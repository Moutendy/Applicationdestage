package map.mapping;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import map.dto.ProjetDto;
import map.model.ProjetModel;

@Mapper(componentModel = "spring",uses = {EncadrantMapper.class})
public interface ProjetMapper {
	ProjetMapper INSTANCE = Mappers.getMapper(ProjetMapper.class);

	 @Mapping(target="id", source="project.id")
	 @Mapping(target="name", source="project.name")
	 @Mapping(target="language", source="project.language")
	 @Mapping(target="desc", source="project.desc")
	 @Mapping(target="conception", source="project.conception")
	 @Mapping(target="end", source="project.end")
	 ProjetDto ModeltoDto(ProjetModel project);


	 @Mapping(target="id", source="projetDto.id")
	 @Mapping(target="name", source="projetDto.name")
	 @Mapping(target="language", source="projetDto.language")
	 @Mapping(target="desc", source="projetDto.desc")
	 @Mapping(target="conception", source="projetDto.conception")
	 @Mapping(target="start", source="projetDto.start")
	 @Mapping(target="end", source="projetDto.end")
	 ProjetModel DtoToModel(ProjetDto projetDto);
	
	List<ProjetDto> listtoProjetDto(List<ProjetModel> projetModelList);
	
	
	List<ProjetModel> listProjetModel(List<ProjetDto> projetDtoList);
}
