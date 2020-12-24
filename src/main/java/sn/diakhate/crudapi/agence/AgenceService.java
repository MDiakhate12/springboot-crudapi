package sn.diakhate.crudapi.agence;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AgenceService {
   
    @Autowired
    private AgenceRepository agenceRepository;

    public List<Agence> getAllAgences() {
        return agenceRepository.findAll();
    }

    public Agence getAgenceById(int id) {
        return agenceRepository.findById(id);
    }

    public void addAgence(Agence agence) {
        agenceRepository.save(agence);
    }

    public void updateAgence(Agence agence) {
        agenceRepository.save(agence);
    }

    public void deleteAgence(int id) {
        agenceRepository.deleteById(id);
    }

}
