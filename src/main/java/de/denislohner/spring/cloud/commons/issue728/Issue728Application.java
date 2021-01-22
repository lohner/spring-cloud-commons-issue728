package de.denislohner.spring.cloud.commons.issue728;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Issue728Application {

	public static void main(String[] args) {
		SpringApplication.run(Issue728Application.class, args);
	}

}
