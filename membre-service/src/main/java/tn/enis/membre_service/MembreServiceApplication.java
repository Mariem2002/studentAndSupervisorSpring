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
		
		
		EnseignantChercheur ens = new EnseignantChercheur("14660104", "Lahami", "Mariem", new Date(89, 7, 2), "cv1", "mariem.lahami@enis.tn", "password126", new Date(120, 9, 14), "Professeur", "ENIS"); 
		Etudiant etd = new Etudiant("14660102", "Ben Tamansourt", "Mariem", new Date(102, 7, 2), "cv2", "mariem.bentamansourt@enis.tn", "password123", new Date(125, 9, 14), "Cybersecurity", "Génie informatique", null, "ENIS"); 
		membreRepository.save(ens); 
		Etudiant etd2 = new Etudiant("14660103", "Zouari", "Nour", new Date(102, 8, 2), "cv3", "nour.zouari@enis.tn", "password127", new Date(125, 9, 14), "Cybersecurity", "Génie informatique", null, "ENIS"); 
		membreRepository.save(etd); 
		membreRepository.save(etd2); // Update a Member 
		
		Membre m1 = membreService.findByCin("14660102"); 
		Membre m2 = membreService.findByCin("14660104"); 
		
		long idEtd1 = m1.getId(); 
		long idEns1 = m2.getId(); 
		membreService.assignEtudiantToEnseignant(idEtd1, idEns1);
		
		membreService.assignCreateurToOutil(idEns1, 1L);
		
		membreService.assignAuteurToPublication(idEns1, 1L);
		
		membreService.assignOrganisateurToEvenement(idEns1, 1L);
		
		
		
		

	}

}
