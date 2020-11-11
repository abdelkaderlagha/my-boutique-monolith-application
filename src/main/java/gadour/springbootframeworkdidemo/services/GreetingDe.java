package gadour.springbootframeworkdidemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile({"de","default"})
public class GreetingDe implements GreetingService {

	@Override
	public String greeting() {
		
		return "Shusss";
	}
	

}
