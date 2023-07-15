package map.controller;

import map.dto.MessageProjetDto;
import map.servives.MessageProjetService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("apis/messageprojet")
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
}
