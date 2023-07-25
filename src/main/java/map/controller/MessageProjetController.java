package map.controller;

import map.dto.MessageProjetDto;
import map.servives.MessageProjetService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("apis/messageprojet/")
public class MessageProjetController {
    private MessageProjetService messageProjetService;
   public MessageProjetController(MessageProjetService messageProjetService) {
        this.messageProjetService=messageProjetService;
    }

    @PostMapping(value="sendMessage",consumes = "application/json")
    void sendMessage(@RequestBody MessageProjetDto messageProjetDto)
    {
        messageProjetService.addMessageProjet(messageProjetDto);
    }
    @PutMapping(value="sendreadMessage",consumes = "application/json")
    void updateMessage(@RequestBody MessageProjetDto messageProjetDto)
    {
      messageProjetService.updateMessageProjet(messageProjetDto);
    }
    @GetMapping(value="readMessage",consumes = "application/json")
    List<MessageProjetDto> getMessage()
    {
     return messageProjetService.showMessageProjetCollection();
    }
    @GetMapping(value="readByOrderMessage",consumes = "application/json")
    List<MessageProjetDto> readByOrderMessage()
    {
      return  messageProjetService.showByOrderMessageProjetCollection();
    }
}
