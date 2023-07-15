package map.repository;

import map.model.TacheProjetModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TacheProjetRespository extends JpaRepository<TacheProjetModel,Long> {
}
