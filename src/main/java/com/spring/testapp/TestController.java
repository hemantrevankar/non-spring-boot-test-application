package com.spring.testapp;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
	private AtomicInteger counter = new AtomicInteger();

	@RequestMapping(value="/greet", method=RequestMethod.GET)
	public String greet() {
		return "Hello User..!!";
	}
	
	@RequestMapping(value="/greet/{name}", method=RequestMethod.GET, produces= {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public Greeting greet(@PathVariable("name") String name) {
		return new Greeting(counter.getAndIncrement(), "Hello " + name);
	}
}
