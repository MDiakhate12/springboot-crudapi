package sn.diakhate.crudapi.compte;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Sort;


@Service
public class CompteService {

    @Autowired
    private CompteRepository compteRepository;
   
    public List<Compte> getAllComptes() {
        return compteRepository. findAll(Sort.by("id").descending());
    }
    
    public List<Compte> getComptesByAgenceId(int idAgence) {
        return compteRepository.findAllComptesByAgenceId(idAgence);
    }

    public List<Compte> getComptesByClientId(int idCompte) {
        return compteRepository.findAllComptesByClientId(idCompte);
    }

    public Compte getCompteById(int id) {
        return compteRepository.findById(id);
    }

    public Compte addCompte(Compte compte) {
        return compteRepository.save(compte);
    }

    public void updateCompte(Compte compte) {
       compteRepository.save(compte);
    }

    public void deleteCompte(int id) {
        compteRepository.deleteById(id);
    }

}
