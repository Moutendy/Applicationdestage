package map.mapping;

import map.dto.EncadrantDto;
import map.dto.TacheProjetDto;
import map.model.EncadrantModel;
import map.model.TacheProjetModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring",uses = {ProjetMapper.class,EncadrantMapper.class})
public interface TacheProjetMapping {

    TacheProjetMapping INSTANCE = Mappers.getMapper(TacheProjetMapping.class);

    @Mapping(target="id", source="tacheProjetModel.id")
    @Mapping(target="name", source="tacheProjetModel.name")
    @Mapping(target="desc", source="tacheProjetModel.desc")
    @Mapping(target="status", source="tacheProjetModel.status")
    @Mapping(target="start", source="tacheProjetModel.start")
    @Mapping(target="end", source="tacheProjetModel.end")
    TacheProjetDto tacheProjetmodeltoDto(TacheProjetModel tacheProjetModel);

    @Mapping(target="id", source="tacheProjetDto.id")
    @Mapping(target="name", source="tacheProjetDto.name")
    @Mapping(target="desc", source="tacheProjetDto.desc")
    @Mapping(target="status", source="tacheProjetDto.status")
    @Mapping(target="start", source="tacheProjetDto.start")
    @Mapping(target="end", source="tacheProjetDto.end")
    TacheProjetModel tacheProjetdtoToModel(TacheProjetDto tacheProjetDto);
    List<TacheProjetDto> listtoTacheProjetDto(List<TacheProjetModel> encadrantModelList);

    List<TacheProjetModel> listTacheProjetModel(List<TacheProjetDto> encadrantDtoList);
}
