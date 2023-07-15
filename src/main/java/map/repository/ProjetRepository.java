package map.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import map.model.ProjetModel;
@Repository
public interface ProjetRepository extends JpaRepository<ProjetModel, Long>{

}
