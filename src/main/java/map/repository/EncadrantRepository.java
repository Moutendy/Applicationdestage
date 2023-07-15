package map.repository;

import map.model.EncadrantModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EncadrantRepository extends JpaRepository<EncadrantModel,Long> {
}
