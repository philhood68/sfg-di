package guru.springframework.sfgdi.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Qualifier;
import guru.springframework.sfgdi.services.GreetingService;

@Controller
public class ConstructorInjectedController 
{
	private final GreetingService greetingService;
	
	public ConstructorInjectedController( @Qualifier("constructorGreetingService") GreetingService greetingService )
	{
		this.greetingService = greetingService;
	}
	
	public String getGreeting()
	{
		return greetingService.sayGreeting();
	}
}
