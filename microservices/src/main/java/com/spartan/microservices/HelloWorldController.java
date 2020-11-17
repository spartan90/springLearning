package com.spartan.microservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//rest service
@RestController
public class HelloWorldController {
	
	//what type of mehtod
	//uri
	//@RequestMapping(method=RequestMethod.GET,path="/helloWorld")
	@GetMapping(path="/helloWorld")
	public String helloWorld() {
		return "Hello World!";
	}

}
