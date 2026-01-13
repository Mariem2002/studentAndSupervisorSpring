package tn.enis.evenement_service.services;

import java.util.List;

import org.springframework.stereotype.Service;
import lombok.AllArgsConstructor;
import tn.enis.evenement_service.entities.Evenement;
import tn.enis.evenement_service.repository.IEvenementRepository;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;
import jakarta.transaction.Transactional;

@Service
@AllArgsConstructor
public class EvenementImpl implements IEvenementService {

    private final IEvenementRepository evenementRepository;

    public Evenement addEvenement(Evenement e) {
        return evenementRepository.save(e);
    }

    public Evenement updateEvenement(Evenement e) {
        return evenementRepository.saveAndFlush(e);
    }

    public Evenement findEvenement(Long id) {
        return evenementRepository.findById(id)
            .orElseThrow(() ->
                new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "Event not found"
                )
            );
    }

    public List<Evenement> findAll() {
        return evenementRepository.findAll();
    }

    public void deleteEvenement(Long id) {
        if (!evenementRepository.existsById(id)) {
            throw new ResponseStatusException(
                HttpStatus.NOT_FOUND, "Event not found"
            );
        }
        evenementRepository.deleteById(id);
    }

    @Transactional
    public void setOrganisateur(Long eventId, Long memberId) {
        Evenement event = findEvenement(eventId);
        event.setIdOrganisateur(memberId);
    }
}
