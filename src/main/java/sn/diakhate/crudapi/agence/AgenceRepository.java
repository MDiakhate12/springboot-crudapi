package sn.diakhate.crudapi.agence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgenceRepository extends JpaRepository<Agence, Integer> {
 
    public Agence findById(int id);
}
