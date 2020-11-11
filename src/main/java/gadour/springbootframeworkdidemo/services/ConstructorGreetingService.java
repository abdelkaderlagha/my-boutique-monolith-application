package gadour.springbootframeworkdidemo.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("en")
public class ConstructorGreetingService implements GreetingService{

	@Override
	public String greeting() {
		return "hello guru!" ;
	}

}
