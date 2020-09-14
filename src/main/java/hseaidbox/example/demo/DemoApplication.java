package hseaidbox.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages={"hseaidbox.example.demo.service", "hseaidbox.example.demo.controller"})
@EnableJpaRepositories(basePackages={"hseaidbox.example.demo.repositories"})
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
