package francescoandrisani.u5w1d4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class U5w1d4Application {

	public static void main(String[] args) {
		SpringApplication.run(U5w1d4Application.class, args);
	}
	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U5w1d4Application.class);

}
