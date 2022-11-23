package br.com.letscode.letsgoal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class LetsgoalApplication {

	public static void main(String[] args) {
		SpringApplication.run(LetsgoalApplication.class, args);
	}

}
