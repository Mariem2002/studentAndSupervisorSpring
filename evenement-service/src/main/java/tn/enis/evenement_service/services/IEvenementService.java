package tn.enis.evenement_service.services;

import java.util.List;

import tn.enis.evenement_service.entities.Evenement;


public interface IEvenementService {
	public Evenement addEvenement(Evenement m);

	public void deleteEvenement(Long id);

	public Evenement updateEvenement(Evenement p);

	public Evenement findEvenement(Long id);

	public List<Evenement> findAll();
	
	public void setOrganisateur(Long eventId, Long memberId);
}
