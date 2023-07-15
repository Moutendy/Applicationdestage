package map.repository;

import map.model.MessageProjetModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageProjetRepository extends JpaRepository<MessageProjetModel,Long> {
}
