package sn.diakhate.crudapi.agence;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AgenceController {
    
    @Autowired
    private AgenceService agenceService;

    @GetMapping({"/", "/agences"})
    public List<Agence> getAllAgences() {
        return agenceService.getAllAgences();
    }

    @GetMapping("/agences/{id}")
    public Agence getAgenceById(@PathVariable int id) {
        return agenceService.getAgenceById(id);
    }

    @PostMapping("/agences")
    public void getAgenceById(@RequestBody Agence agence) {
        agenceService.addAgence(agence);
    }

    @PutMapping("/agences/{id}")
    public void updateAgence(@PathVariable int id, @RequestBody Agence agence) {
        Agence toUpdate = agenceService.getAgenceById(id);
        toUpdate.setAddresse(agence.getAddresse());
        toUpdate.setNom(agence.getNom());
        toUpdate.setTelephone(agence.getTelephone());
        agenceService.updateAgence(toUpdate);
    }

    @DeleteMapping("/agences/{id}")
    public void deleteAgence(@PathVariable int id) {
        agenceService.deleteAgence(id);
    }

}
