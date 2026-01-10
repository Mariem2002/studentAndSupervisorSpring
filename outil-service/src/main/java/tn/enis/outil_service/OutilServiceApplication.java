package tn.enis.outil_service;

import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import lombok.AllArgsConstructor;
import tn.enis.outil_service.entities.Outil;
import tn.enis.outil_service.repository.IOutilRepository;

@SpringBootApplication
@EnableDiscoveryClient
@AllArgsConstructor
public class OutilServiceApplication implements CommandLineRunner{
	IOutilRepository outilRepository;
	RepositoryRestConfiguration configuration;
	public static void main(String[] args) {
		SpringApplication.run(OutilServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		configuration.exposeIdsFor(Outil.class);
		Outil outil1 = Outil.builder()
				.dateCreation(new Date())
				.source("www.wikipedia.com")
				.build();
		outilRepository.save(outil1);
	}

}
