package tn.enis.evenement_service;

import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import lombok.AllArgsConstructor;
import tn.enis.evenement_service.entities.Evenement;
import tn.enis.evenement_service.repository.IEvenementRepository;

@SpringBootApplication 
@EnableDiscoveryClient
@AllArgsConstructor
public class EvenementServiceApplication implements CommandLineRunner{
	IEvenementRepository evenementRepository;
	RepositoryRestConfiguration configuration;
	public static void main(String[] args) {
		SpringApplication.run(EvenementServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		configuration.exposeIdsFor(Evenement.class);
		Evenement evt1 =
				Evenement.builder()
				.titre("an approach for testing soa systems")
				.dateEvenement(new Date())
				.lieu("Tunis")
				.build();
		
		evenementRepository.save(evt1);
	}
	

}
