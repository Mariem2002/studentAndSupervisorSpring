package tn.enis.membre_service.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import tn.enis.membre_service.entities.EnseignantChercheur;
import tn.enis.membre_service.entities.Etudiant;
import tn.enis.membre_service.entities.Membre;
@Repository
public interface MembreRepository extends JpaRepository<Membre,Long>
{

Membre findByCin(String cin);
List<Membre>findByNomStartingWith(String caractere);
Membre findByEmail(String email);
List<Membre> findByNom(String nom);
List<Etudiant> findByDiplome(String diplome);
List<EnseignantChercheur> findByGrade(String grade);
List<EnseignantChercheur> findByEtablissement(String etablissement);
}