package map.repository;

import map.constante.QueryProjet;
import map.model.TacheProjetModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TacheProjetRespository extends JpaRepository<TacheProjetModel,Long> {
    @Query(value = QueryProjet.tache_projet_for_stagiaire,nativeQuery = true)
    List<TacheProjetModel> internProjectTask(@Param("id") Long id);
    @Query(value = QueryProjet.tache_stagiaire,nativeQuery = true)
    List<TacheProjetModel> traineeSpot(@Param("id") Long id);
}
