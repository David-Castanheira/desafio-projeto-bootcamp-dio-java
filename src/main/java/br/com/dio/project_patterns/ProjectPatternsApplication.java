package br.com.dio.project_patterns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ProjectPatternsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectPatternsApplication.class, args);
	}

}
