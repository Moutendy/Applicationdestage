package map.repository;

import map.constante.QueryMessage;
import map.constante.QueryProjet;
import map.model.MessageProjetModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MessageProjetRepository extends JpaRepository<MessageProjetModel,Long> {

    @Query(value = QueryMessage.list_message_recu_by_encadrant,nativeQuery = true)
   List<MessageProjetModel> listMessageReceivedBySupervisor(@Param("email")String email);
    @Query(value = QueryMessage.message_recu_inbox,nativeQuery = true)
    List<MessageProjetModel> messageReceivedInbox(@Param("email")String email,@Param("emailstagiare")String emailstagiare);
}
