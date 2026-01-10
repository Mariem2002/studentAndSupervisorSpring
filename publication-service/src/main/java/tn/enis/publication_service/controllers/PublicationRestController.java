package tn.enis.publication_service.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import tn.enis.publication_service.entities.Publication;
import tn.enis.publication_service.services.IPublicationService;


import org.springframework.web.bind.annotation.RestController;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/") // optional prefix
public class PublicationRestController {

    private final IPublicationService publicationService;

    @CrossOrigin(origins = "http://localhost:4200") // allow Angular dev server
    @GetMapping("/publications")
    public List<Publication> findPublications() {
        return publicationService.findAll();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/publications/{id}")
    public Publication findOnePublicationById(@PathVariable Long id) {
        return publicationService.findPublication(id);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/publications")
    public Publication addPublication(@RequestBody Publication pub) {
        return publicationService.addPublication(pub);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @DeleteMapping("/publications/{id}")
    public void deletePublication(@PathVariable Long id) {
        publicationService.deletePublication(id);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PutMapping("/publications/{id}")
    public Publication updatePublication(@PathVariable Long id, @RequestBody Publication pub) {
        pub.setId(id);
        return publicationService.updatePublication(pub);
    }
}
