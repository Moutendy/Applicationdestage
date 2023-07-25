package map.servives.impl;

import map.dto.MessageProjetDto;
import map.mapping.MessageMapping;
import map.repository.MessageProjetRepository;
import map.servives.MessageProjetService;
import org.springframework.stereotype.Service;
import java.util.Collections;
import java.util.List;

@Service
public class MessageProjetServiceImpl implements MessageProjetService {
    private MessageMapping messageMapping;
    private MessageProjetRepository messageProjetRepository;

   public MessageProjetServiceImpl(MessageMapping messageMapping,MessageProjetRepository messageProjetRepository)
    {
        this.messageMapping=messageMapping;
        this.messageProjetRepository=messageProjetRepository;
    }
    @Override
    public void addMessageProjet(MessageProjetDto messageProjetDto) {
        messageProjetRepository.save(messageMapping.messageProjetdtoToModel(messageProjetDto));
    }
    @Override
    public List<MessageProjetDto> showMessageProjetCollection() {
        return messageMapping.listtoMessageProjetDto(messageProjetRepository.findAll());
    }
    @Override
    public List<MessageProjetDto> showByOrderMessageProjetCollection() {
       List<MessageProjetDto> messageProjetDtos=messageMapping.listtoMessageProjetDto(messageProjetRepository.findAll());
        Collections.sort(messageProjetDtos);
       return messageProjetDtos;
    }
    @Override
    public void deleteEncadrant(Long id) {
          messageProjetRepository.deleteById(id);
    }
    @Override
    public void updateMessageProjet(MessageProjetDto messageProjetDto) {
            messageProjetRepository.save(messageMapping.messageProjetdtoToModel(messageProjetDto));
    }
}
