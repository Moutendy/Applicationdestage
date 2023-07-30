package map.controller;

import map.dto.MessageProjetDto;
import map.servives.MessageProjetService;
import org.springframework.http.MediaType;
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

    @GetMapping(value = "messenger/{email}",consumes = { MediaType.APPLICATION_JSON_VALUE,
            MediaType.MULTIPART_FORM_DATA_VALUE }, produces = MediaType.APPLICATION_JSON_VALUE)
    List<MessageProjetDto> listMessageReceivedBySupervisor(@PathVariable("email") String email)
    {
        return listMessageReceivedBySupervisor(email);
    }

    @GetMapping(value = "messenger/{email}/{emailstagiare}",consumes = { MediaType.APPLICATION_JSON_VALUE,
            MediaType.MULTIPART_FORM_DATA_VALUE }, produces = MediaType.APPLICATION_JSON_VALUE)
    List<MessageProjetDto> messageReceivedInbox(@PathVariable("email") String email,@PathVariable("emailstagiare")String emailstagiare)
    {
        return messageReceivedInbox(email,emailstagiare);
    }
}
