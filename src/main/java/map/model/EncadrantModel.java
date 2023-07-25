package map.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="encadrant")
@Builder
public class EncadrantModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id ;
    @Column(name="name")
    private String name;
    @Column(name="profil")
    private String profil;
    @Column(name="experience")
    private Long experience;
    @Column(name="email",nullable = false, updatable = false)
    private String email;

    @Column(name="password",nullable = false, updatable = false)
    private String password;
}
