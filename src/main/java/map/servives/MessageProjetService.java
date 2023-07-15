package map.servives;

import map.dto.EncadrantDto;
import map.dto.MessageProjetDto;

import java.util.List;

public interface MessageProjetService {
    void addMessageProjet(MessageProjetDto messageProjetDto);

    List<MessageProjetDto> showMessageProjetCollection();
    List<MessageProjetDto> showByOrderMessageProjetCollection();
    void deleteEncadrant(Long id);
    void updateMessageProjet(MessageProjetDto messageProjetDto,long id);
}
