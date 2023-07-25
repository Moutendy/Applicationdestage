package map.servives;

import java.util.List;

import map.dto.StagiaireDto;


public interface StagiaireServiceI {

	void addStagiaireCollection(List<StagiaireDto> listStagiaire);
	
	List<StagiaireDto> showStagiaireCollection();
	
	List<StagiaireDto> showByOrderStagiaireCollection();


	void deleteStagiaire(List<Long> id);

	void updateStagiaire(List<StagiaireDto> listStagiaire);
}
