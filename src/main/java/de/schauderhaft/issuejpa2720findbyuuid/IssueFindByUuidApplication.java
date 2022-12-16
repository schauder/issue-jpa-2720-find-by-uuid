package de.schauderhaft.issuejpa2720findbyuuid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

@SpringBootApplication
public class IssueFindByUuidApplication {

	public static void main(String[] args) {
		SpringApplication.run(IssueFindByUuidApplication.class, args);
	}

}
