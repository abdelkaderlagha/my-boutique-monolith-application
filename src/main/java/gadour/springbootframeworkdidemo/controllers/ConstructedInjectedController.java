package gadour.springbootframeworkdidemo.controllers;


import org.springframework.stereotype.Controller;

import gadour.springbootframeworkdidemo.services.GreetingService;

@Controller
public class ConstructedInjectedController {



	private GreetingService greetingService;

	public ConstructedInjectedController( GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}
	
	public String sayHello() {
		return this.greetingService.greeting();
	}
	
	
}
