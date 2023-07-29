package map.repository;

import map.constante.QueryProjet;
import map.model.EncadrantModel;
import map.model.ProjetModel;
import map.model.StagiaireModel;
import map.model.TacheProjetModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EncadrantRepository extends JpaRepository<EncadrantModel,Long> {
}
