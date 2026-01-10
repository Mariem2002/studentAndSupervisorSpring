package tn.enis.outil_service.services;

import java.util.List;

import tn.enis.outil_service.entities.Outil;

public interface IOutilService {
	public Outil addOutil(Outil m);

	public void deleteOutil(Long id);

	public Outil updateOutil(Outil p);

	public Outil findOutil(Long id);

	public List<Outil> findAll();
}
