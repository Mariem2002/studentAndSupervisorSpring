package tn.enis.evenement_service.services;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import tn.enis.evenement_service.entities.Evenement;
import tn.enis.evenement_service.repository.IEvenementRepository;


@Service
@AllArgsConstructor
public class EvenementImpl implements IEvenementService{
	private final IEvenementRepository evenementRepository;

	public Evenement addEvenement(Evenement m) {
		// TODO Auto-generated method stub
		return evenementRepository.save(m);
	}

	
	public void deleteEvenement(Long id) {
		// TODO Auto-generated method stub
		evenementRepository.deleteById(id);
	}

	
	public Evenement updateEvenement(Evenement p) {
		// TODO Auto-generated method stub
		return evenementRepository.saveAndFlush(p);
	}

	
	public Evenement findEvenement(Long id) {
		// TODO Auto-generated method stub
		return evenementRepository.findById(id).get(); // alesh find w get mabaadhhom ?
	}

	
	public List<Evenement> findAll() {
		// TODO Auto-generated method stub
		return evenementRepository.findAll();
	}

}
