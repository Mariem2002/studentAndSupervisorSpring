package tn.enis.publication_service.services;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import tn.enis.publication_service.entities.Publication;
import tn.enis.publication_service.respository.IPublicationRepository;

@Service
@AllArgsConstructor
public class PublicationImpl implements IPublicationService{
	private final IPublicationRepository publicationRepository;

	public Publication addPublication(Publication m) {
		// TODO Auto-generated method stub
		return publicationRepository.save(m);
	}

	
	public void deletePublication(Long id) {
		// TODO Auto-generated method stub
		publicationRepository.deleteById(id);
	}

	
	public Publication updatePublication(Publication p) {
		// TODO Auto-generated method stub
		return publicationRepository.saveAndFlush(p);
	}

	
	public Publication findPublication(Long id) {
		// TODO Auto-generated method stub
		return publicationRepository.findById(id).get(); // alesh find w get mabaadhhom ?
	}

	
	public List<Publication> findAll() {
		// TODO Auto-generated method stub
		return publicationRepository.findAll();
	}

}
