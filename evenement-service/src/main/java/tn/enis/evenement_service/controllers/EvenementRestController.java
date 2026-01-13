package tn.enis.evenement_service.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import tn.enis.evenement_service.entities.Evenement;
import tn.enis.evenement_service.services.IEvenementService;


import org.springframework.web.bind.annotation.RestController;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/") // optional prefix
public class EvenementRestController {

    private final IEvenementService evenementService;

    @CrossOrigin(origins = "http://localhost:4200") // allow Angular dev server
    @GetMapping("/evenements")
    public List<Evenement> findEvenements() {
        return evenementService.findAll();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/evenements/{id}")
    public Evenement findOneEvenementById(@PathVariable Long id) {
        return evenementService.findEvenement(id);
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/evenements/{eventId}/organisateur/{memberId}")
    public ResponseEntity<Void> assignOrganisateur(
            @PathVariable Long eventId,
            @PathVariable Long memberId) {

        evenementService.setOrganisateur(eventId, memberId);
        return ResponseEntity.ok().build();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/evenements")
    public Evenement addEvenement(@RequestBody Evenement pub) {
        return evenementService.addEvenement(pub);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @DeleteMapping("/evenements/{id}")
    public void deleteEvenement(@PathVariable Long id) {
        evenementService.deleteEvenement(id);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PutMapping("/evenements/{id}")
    public Evenement updateEvenement(@PathVariable Long id, @RequestBody Evenement pub) {
        pub.setId(id);
        return evenementService.updateEvenement(pub);
    }
}
