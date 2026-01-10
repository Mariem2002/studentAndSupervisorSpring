package tn.enis.publication_service.services;

import java.util.List;

import tn.enis.publication_service.entities.Publication;


public interface IPublicationService {
	public Publication addPublication(Publication m);

	public void deletePublication(Long id);

	public Publication updatePublication(Publication p);

	public Publication findPublication(Long id);

	public List<Publication> findAll();
}
