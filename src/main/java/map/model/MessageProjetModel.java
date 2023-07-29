package map.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="messenger")
@Builder
public class MessageProjetModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id ;
    @Column(name="issue")
    private String issue;
    @Column(name="recipient")
    private String recipient;
    @Column(name="message")
    private String message;
    @Column(name="dateMessenger")
    private Date  dateMessenger;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_projet", nullable = false)
    private ProjetModel projet;
}
