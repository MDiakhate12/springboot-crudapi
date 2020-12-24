package sn.diakhate.crudapi.compte;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompteService {

    @Autowired
    private CompteRepository compteRepository;
   
    public List<Compte> getAllComptes() {
        return compteRepository.findAll();
    }

    public Compte getCompteById(int id) {
        return compteRepository.findById(id);
    }

    public void addCompte(Compte compte) {
        compteRepository.save(compte);
    }

    public void updateCompte(Compte compte) {
       compteRepository.save(compte);
    }

    public void deleteCompte(int id) {
        compteRepository.deleteById(id);
    }

}
