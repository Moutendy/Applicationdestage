package map.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import map.model.StagiaireModel;

@Repository
public interface StagiaireRepository extends JpaRepository<StagiaireModel, Long>{

}
