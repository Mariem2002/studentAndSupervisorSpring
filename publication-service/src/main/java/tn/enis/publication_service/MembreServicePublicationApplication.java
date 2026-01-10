package tn.enis.publication_service;

import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import lombok.AllArgsConstructor;
import tn.enis.publication_service.entities.Publication;
import tn.enis.publication_service.respository.IPublicationRepository;

@SpringBootApplication
@EnableDiscoveryClient 
@AllArgsConstructor
public class MembreServicePublicationApplication implements CommandLineRunner {
	IPublicationRepository publicationRepository;
	RepositoryRestConfiguration configuration;
	public static void main(String[] args) {
		SpringApplication.run(MembreServicePublicationApplication.class, args);
	}

	public void run(String... args) throws Exception {
		configuration.exposeIdsFor(Publication.class);
	//Création des publications
		Publication pubs1 =
				Publication.builder()
				.type("article")
				.titre("an approach for testing soa systems")
				.dateApparition(new Date())
				.lien("lien")
				.sourcePdf("pdf")
				.build();
	
	publicationRepository.save(pubs1);

	}
}