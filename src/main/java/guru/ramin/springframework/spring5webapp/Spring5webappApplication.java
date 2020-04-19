package guru.ramin.springframework.spring5webapp;

import guru.ramin.springframework.spring5webapp.repositories.AuthorRepository;
import guru.ramin.springframework.spring5webapp.repositories.BookRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring5webappApplication {
	public static void main(String[] args) {
		SpringApplication.run(Spring5webappApplication.class, args);
	}

}
