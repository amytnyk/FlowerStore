package com.alexm.flowerstorecontinue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@SpringBootApplication
public class FlowerstoreContinueApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlowerstoreContinueApplication.class, args);
	}

	@GetMapping(value = "/get_list_of_objects")
	public List<Integer> getListOfObjects() {
		return List.of(1, 2, 3, 4);
	}
}
