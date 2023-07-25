package map.dto;


import lombok.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StagiaireDto implements Comparable<StagiaireDto>{

	private Long id ;
	
	private String nom;
	
	private String prenom;
	
	private ProjetDto projet;

	private String email;

	private String password;

	private EncadrantDto encadrant;
	@Override
	public int compareTo(StagiaireDto stagiaire) {
		// TODO Auto-generated method stub
		if (!this.nom.equals(stagiaire.getNom()))
			return this.nom.compareTo(stagiaire.getNom());
		else
			return this.prenom.compareTo(stagiaire.getPrenom());

	}
}
