package map.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="tache")
@Builder
public class TacheProjetModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id ;
    @Column(name="name")
    private String name;
    @Column(name="description")
    private String desc;
    @Column(name="status")
    private Boolean status;
    @Column(name="start")
    private Date start;
    @Column(name="end")
    private Date end;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_projet", nullable = false)
    private ProjetModel projet;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_encadrant", nullable = false)
    private EncadrantModel encadrant;

}
