package com.atenea.hospital.hospital_java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableJpaRepositories("com.atenea.hospital.hospital_java.repositories.*")
@ComponentScan(basePackages = { "com.atenea.hospital.hospital_java.controllers.*" })
@EntityScan("com.atenea.hospital.hospital_java.entities.*")
@SpringBootApplication
public class HospitalJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(HospitalJavaApplication.class, args);
	}

}
