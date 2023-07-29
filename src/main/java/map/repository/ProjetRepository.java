package map.repository;

import map.constante.QueryProjet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import map.model.ProjetModel;

import java.util.List;

@Repository
public interface ProjetRepository extends JpaRepository<ProjetModel, Long>{
    @Query(value = QueryProjet.projet_stagiaire_for_encadrant,nativeQuery = true)
    List<ProjetModel> traineeProjectForSupervisor(@Param("id") Long id);

    @Query(value = QueryProjet.projet_stagiaire,nativeQuery = true)
    List<ProjetModel> internProject(@Param("id") Long id);
}
