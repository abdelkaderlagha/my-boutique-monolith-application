package gadour.springbootframeworkdidemo.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("es")
public class GreetingSpain implements GreetingService{

	@Override
	public String greeting() {
		
		return "hola";
	}
	

}
