package tn.enis.publication_service.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

import tn.enis.publication_service.entities.Publication;

@RepositoryRestController
public interface IPublicationRepository extends JpaRepository<Publication, Long> {
}
