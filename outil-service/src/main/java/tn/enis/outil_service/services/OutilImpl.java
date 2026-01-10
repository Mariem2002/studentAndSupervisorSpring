package tn.enis.outil_service.services;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import tn.enis.outil_service.entities.Outil;
import tn.enis.outil_service.repository.IOutilRepository;

@Service
@AllArgsConstructor
public class OutilImpl implements IOutilService{
	private final IOutilRepository outilRepository;

	public Outil addOutil(Outil m) {
		// TODO Auto-generated method stub
		return outilRepository.save(m);
	}

	
	public void deleteOutil(Long id) {
		// TODO Auto-generated method stub
		outilRepository.deleteById(id);
	}

	
	public Outil updateOutil(Outil p) {
		// TODO Auto-generated method stub
		return outilRepository.saveAndFlush(p);
	}

	
	public Outil findOutil(Long id) {
		// TODO Auto-generated method stub
		return outilRepository.findById(id).get(); // alesh find w get mabaadhhom ?
	}

	
	public List<Outil> findAll() {
		// TODO Auto-generated method stub
		return outilRepository.findAll();
	}

}
