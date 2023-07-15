package map.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import map.dto.StagiaireDto;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StagiaireOrder implements Comparable<StagiaireDto>{
	
	private StagiaireDto stagiaire;
	
	@Override
	public int compareTo(StagiaireDto stagiaire) {
		// TODO Auto-generated method stub
		if (!this.stagiaire.getNom().equals(stagiaire.getNom()))
			return this.stagiaire.getNom().compareTo(stagiaire.getNom());
		else
			return this.stagiaire.getPrenom().compareTo(stagiaire.getPrenom());
//Source : www.exelib.net
	}

}
