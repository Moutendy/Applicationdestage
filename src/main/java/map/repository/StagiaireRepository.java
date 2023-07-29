package map.repository;

import map.constante.QueryProjet;
import map.model.TacheProjetModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import map.model.StagiaireModel;

import java.util.List;

@Repository
public interface StagiaireRepository extends JpaRepository<StagiaireModel, Long>{
    @Query(value = QueryProjet.list_stagiaire,nativeQuery = true)
    List<StagiaireModel> listOfTrainees(@Param("id") Long id);

}
