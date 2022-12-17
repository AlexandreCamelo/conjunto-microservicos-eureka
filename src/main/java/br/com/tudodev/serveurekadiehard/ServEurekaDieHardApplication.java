package br.com.tudodev.serveurekadiehard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServEurekaDieHardApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServEurekaDieHardApplication.class, args);
	}

}
