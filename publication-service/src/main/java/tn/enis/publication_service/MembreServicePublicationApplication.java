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
public class MembreServicePublicationApplication {
	IPublicationRepository publicationRepository;
	RepositoryRestConfiguration configuration;
	public static void main(String[] args) {
		SpringApplication.run(MembreServicePublicationApplication.class, args);
	}

	
}