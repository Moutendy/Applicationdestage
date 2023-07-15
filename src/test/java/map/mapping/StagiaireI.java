package map.mapping;

import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;


import map.dto.StagiaireDto;
import map.model.StagiaireModel;

@Mapper(componentModel = "spring",uses = {ProjetMapper.class})
public interface StagiaireI {

	StagiaireMapper INSTANCE = Mappers.getMapper(StagiaireMapper.class);
	
	 @Mapping(target="id", source="stagiaire.id")
	 @Mapping(target="nom", source="stagiaire.nom")
	 @Mapping(target="prenom", source="stagiaire.prenom")
	 StagiaireDto ModeltoDto(StagiaireModel stagiaire);
	

	 @Mapping(target="id", source="stagiaireDto.id")
	 @Mapping(target="nom", source="stagiaireDto.nom")
	 @Mapping(target="prenom", source="stagiaireDto.prenom")
	 StagiaireModel DtoToModel(StagiaireDto stagiaireDto);
	
	List<StagiaireDto> listtoStagiaireDto(List<StagiaireModel> stagiaire);
	
	
	List<StagiaireModel> listStagiaireModel(List<StagiaireDto> stagiaire);
}
