package guru.springframework.spring5webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring5webappApplication {

	public static void main(String[] args) {
		System.out.println("I am changed");
		SpringApplication.run(Spring5webappApplication.class, args);
		System.out.println("finished bug fixes");
	}
}
