package tn.enis.outil_service.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import tn.enis.outil_service.entities.Outil;
import tn.enis.outil_service.services.IOutilService;

@RestController
@AllArgsConstructor
@RequestMapping// optional prefix
public class OutilRestController {

    private final IOutilService outilService;

    @CrossOrigin(origins = "http://localhost:4200") // allow Angular dev server
    @GetMapping("/outils")
    public List<Outil> findOutils() {
        return outilService.findAll();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/outils/{id}")
    public Outil findOneOutilById(@PathVariable Long id) {
        return outilService.findOutil(id);
    }
    
    

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/outils")
    public Outil addOutil(@RequestBody Outil pub) {
        return outilService.addOutil(pub);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @DeleteMapping("/outils/{id}")
    public void deleteOutil(@PathVariable Long id) {
        outilService.deleteOutil(id);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PutMapping("/outils/{id}")
    public Outil updateOutil(@PathVariable Long id, @RequestBody Outil pub) {
        pub.setId(id);
        return outilService.updateOutil(pub);
    }
}
