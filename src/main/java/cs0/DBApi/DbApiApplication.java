package cs0.DBApi;

import cs0.DBApi.Models.PlaceDescription;
import cs0.DBApi.Repositories.PlaceRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class DbApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DbApiApplication.class, args);
	}

	@Bean
	CommandLineRunner runner (PlaceRepository repository){
		return args -> {
			if(repository.findAll().isEmpty()){
				repository.save(new PlaceDescription("UIC", "A happy place"));
				System.out.println("Added.");
			}
		};
	}

}
