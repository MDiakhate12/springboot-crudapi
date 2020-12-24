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

@RestController
public class CompteController {
    
    @Autowired
    private CompteService compteService;

    @GetMapping("/comptes")
    public List<Compte> getAllComptes() {
        return compteService.getAllComptes();
    }

    @GetMapping("/comptes/{id}")
    public Compte getCompteById(@PathVariable int id) {
        return compteService.getCompteById(id);
    }

    @PostMapping("/comptes")
    public void getCompteById(@RequestBody Compte compte) {
        compteService.addCompte(compte);
    }

    @PutMapping("/comptes/{id}")
    public void updateCompte(@PathVariable int id, @RequestBody Compte compte) {
        compteService.updateCompte(id, compte);
    }

    @DeleteMapping("/comptes/{id}")
    public void deleteCompte(@PathVariable int id) {
        compteService.deleteCompte(id);
    }

}
