package map.model;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Table(name="stagiaire")
public class StagiaireModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id ;
	@Column(name="nom")
	private String nom;
	@Column(name="prenom")
	private String prenom;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="projet",nullable = false, updatable = false)
	private ProjetModel projet;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "encadrant", nullable = false,updatable = false)
	private EncadrantModel encadrant;
	
}
