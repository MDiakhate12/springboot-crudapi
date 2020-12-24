package sn.diakhate.crudapi.compte;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import sn.diakhate.crudapi.agence.Agence;
import sn.diakhate.crudapi.agence.AgenceService;
import sn.diakhate.crudapi.client.Client;
import sn.diakhate.crudapi.client.ClientService;

@RestController
public class CompteController {
    
    @Autowired
    private CompteService compteService;
    @Autowired
    private ClientService clientService;
    @Autowired
    private AgenceService agenceService;

    @GetMapping("/comptes")
    public List<Compte> getAllComptes() {
        return compteService.getAllComptes();
    }

    @GetMapping("/comptes/{id}")
    public Compte getCompteById(@PathVariable int id) {
        return compteService.getCompteById(id);
    }

    @PostMapping({"/clients/{idClient}/agences/{idAgence}/comptes", "/agences/{idAgence}/clients/{idClient}/comptes"})
    public void getCompteById(@PathVariable int idClient, @PathVariable int idAgence, @RequestBody Compte compte) {
        Client client = clientService.getClientById(idClient);
        Agence agence = agenceService.getAgenceById(idAgence);

        compte.setClient(client);
        compte.setAgence(agence);
        compteService.addCompte(compte);
    }

    @PutMapping("/comptes/{id}")
    public void updateCompte(@PathVariable int id, @RequestBody Compte compte) {
        Compte toUpdate = compteService.getCompteById(id);

        toUpdate.setSolde(compte.getSolde());
        toUpdate.setDecouvert(compte.getDecouvert());

        compteService.addCompte(compte);
    }

    @DeleteMapping("/comptes/{id}")
    public void deleteCompte(@PathVariable int id) {
        compteService.deleteCompte(id);
    }

}
