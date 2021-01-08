package sn.diakhate.crudapi.agence;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class AgenceService {

    @Autowired
    private AgenceRepository agenceRepository;

    public List<Agence> getAllAgences() {
        return agenceRepository.findAll(Sort.by("id").descending());
    }

    public Agence getAgenceById(int id) {
        return agenceRepository.findById(id);
    }

    public Agence addAgence(Agence agence) {
        return agenceRepository.save(agence);
    }

    public Agence updateAgence(Agence agence) {
        return agenceRepository.save(agence);
    }

    public void deleteAgence(int id) {
        agenceRepository.deleteById(id);
    }

}
