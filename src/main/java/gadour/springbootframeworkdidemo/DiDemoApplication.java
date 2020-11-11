package gadour.springbootframeworkdidemo;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import gadour.springbootframeworkdidemo.controllers.ConstructedInjectedController;


@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
	
		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
		
		System.out.println(ctx.getBean(ConstructedInjectedController.class).sayHello());
		
		
	}

}
