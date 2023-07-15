package map.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import map.model.EncadrantModel;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProjetDto implements Comparable<ProjetDto>{
	private Long id ;
	private String name;
	private String language;
	private String desc;
	private String conception;
	private Date start;
	private Date end;
	private EncadrantDto encadrant;

	@Override
	public int compareTo(ProjetDto projetDto) {
		// TODO Auto-generated method stub
		if (!this.name.equals(projetDto.getName()))
			return this.name.compareTo(projetDto.getName());
		else
			return this.language.compareTo(projetDto.getLanguage());

	}
}
