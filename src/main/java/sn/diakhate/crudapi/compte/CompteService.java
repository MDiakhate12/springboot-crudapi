package sn.diakhate.crudapi.compte;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CompteService {
    
    // private List<Compte> comptes = Arrays.asList(
    //     new Compte(1, 1000.0, 100.0, "1", 1), 
    //     new Compte(2, 2000., 200., "2", 2), 
    //     new Compte(3, 3000., 300., "3", 3)
    // );    
    private List<Compte> comptes = new ArrayList<Compte>() {{
        add(new Compte(1, 1000.0, 100.0, "1", 1));
        add(new Compte(2, 2000., 200., "2", 2));
        add(new Compte(3, 3000., 300., "3", 3));
    }};
        
    public List<Compte> getAllComptes() {
        return comptes;
    }

    public Compte getCompteById(int id) {
        return comptes
                .stream()
                .filter(compte -> compte.getId() == id)
                .findFirst()
                .get();
    }

    public void addCompte(Compte compte) {
        comptes.add(compte);
    }

    public void updateCompte(int id, Compte compte) {
        compte.setId(id);
        comptes.set(id-1, compte);
    }

    public void deleteCompte(int id) {
        comptes.removeIf(compte -> compte.getId() == id);
    }

}
