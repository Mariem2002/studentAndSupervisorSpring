package tn.enis.membre_service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.repository.CrudRepository;

import lombok.AllArgsConstructor;
import tn.enis.membre_service.beans.EvenementBean;
import tn.enis.membre_service.beans.OutilBean;
import tn.enis.membre_service.beans.PublicationBean;
import tn.enis.membre_service.dao.MembreEvntRepository;
import tn.enis.membre_service.dao.MembreOutilRepository;
import tn.enis.membre_service.dao.MembreRepository;
import tn.enis.membre_service.entities.EnseignantChercheur;
import tn.enis.membre_service.entities.Etudiant;
import tn.enis.membre_service.entities.Membre;
import tn.enis.membre_service.proxies.EvenementProxyService;
import tn.enis.membre_service.proxies.OutilProxyService;
import tn.enis.membre_service.proxies.PublicationProxyService;
import tn.enis.membre_service.services.IMembreService;

@SpringBootApplication
@EnableFeignClients
@AllArgsConstructor
public class MembreServiceApplication implements CommandLineRunner {
	MembreRepository membreRepository;
	IMembreService membreService;
	PublicationProxyService publicationProxyService;
	EvenementProxyService evenementProxyService;
	OutilProxyService outilProxyService;
	MembreEvntRepository membreEvntRepository;
	MembreOutilRepository membreOutilRepository;

	public static void main(String[] args) {
		SpringApplication.run(MembreServiceApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {

		// TODO Auto-generated method stub
		
		
	
		
		
		
		

	}

}
