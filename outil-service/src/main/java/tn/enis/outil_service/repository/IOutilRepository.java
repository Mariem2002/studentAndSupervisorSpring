package tn.enis.outil_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

import tn.enis.outil_service.entities.Outil;

@RepositoryRestController
public interface IOutilRepository extends JpaRepository<Outil, Long>{
	

}
