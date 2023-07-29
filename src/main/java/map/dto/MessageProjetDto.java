package map.dto;

import jakarta.persistence.*;
import lombok.*;
import map.model.ProjetModel;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class MessageProjetDto implements Comparable<MessageProjetDto>{
    private Long id ;
    private String issue;
    private String recipient;
    private ProjetDto projet;
    private Date  dateMessenger;
    private String message;
    @Override
    public int compareTo(MessageProjetDto messageProjetDto) {
        if (!this.dateMessenger.equals(messageProjetDto.getDateMessenger()))
            return this.dateMessenger.compareTo(messageProjetDto.getDateMessenger());
        return 0;
    }
}
