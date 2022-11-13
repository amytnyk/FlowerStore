package com.alexm.flowerstorecontinue;

import com.alexm.flowerstorecontinue.delivery.PostDeliveryStrategy;
import com.alexm.flowerstorecontinue.item.FlowerPack;
import com.alexm.flowerstorecontinue.item.Item;
import com.alexm.flowerstorecontinue.item.decorator.BasketDecorator;
import com.alexm.flowerstorecontinue.item.decorator.PaperDecorator;
import com.alexm.flowerstorecontinue.item.flower.Chamomile;
import com.alexm.flowerstorecontinue.item.flower.Rose;
import com.alexm.flowerstorecontinue.payment.CreditCardPaymentStrategy;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FlowerstoreContinueApplicationTests {
	@Test
	void testBasic() {
		Order order = new Order();
		order.setDelivery(new PostDeliveryStrategy());
		order.setPayment(new CreditCardPaymentStrategy());
		order.addItem(new BasketDecorator(new FlowerPack(new Chamomile())));
		order.addItem(new Rose());
		Assertions.assertEquals(order.calculateTotalPrice(), 34);
		order.processOrder();
	}

	@Test
	void testAdvanced() {
		Order order = new Order();
		order.setDelivery(new PostDeliveryStrategy());
		order.setPayment(new CreditCardPaymentStrategy());
		Item chamomiles = new PaperDecorator(new FlowerPack(new Chamomile()));
		order.addItem(chamomiles);
		order.addItem(new BasketDecorator(new FlowerPack(new Rose(), 20)));
		order.addItem(new Rose());
		order.removeItem(chamomiles);
		Assertions.assertEquals(order.calculateTotalPrice(), 214);
		order.processOrder();
	}
}
