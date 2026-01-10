package tn.enis.evenement_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.enis.evenement_service.entities.Evenement;

public interface IEvenementRepository extends JpaRepository<Evenement, Long>{

	
	

}
