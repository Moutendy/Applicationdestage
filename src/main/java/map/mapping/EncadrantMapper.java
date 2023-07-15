package map.mapping;

import map.dto.EncadrantDto;
import map.dto.StagiaireDto;
import map.model.EncadrantModel;
import map.model.StagiaireModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EncadrantMapper {
    EncadrantMapper INSTANCE = Mappers.getMapper(EncadrantMapper.class);

    @Mapping(target="id", source="encadrantModel.id")
    @Mapping(target="name", source="encadrantModel.name")
    @Mapping(target="profil", source="encadrantModel.profil")
    @Mapping(target="experience", source="encadrantModel.experience")
    EncadrantDto encadrantmodeltoDto(EncadrantModel encadrantModel);

    @Mapping(target="id", source="encadrantDto.id")
    @Mapping(target="name", source="encadrantDto.name")
    @Mapping(target="profil", source="encadrantDto.profil")
    @Mapping(target="experience", source="encadrantDto.experience")
    EncadrantModel encadrantdtoToModel(EncadrantDto encadrantDto);
    List<EncadrantDto> listtoEncadrantDto(List<EncadrantModel> encadrantModelList);

    List<EncadrantModel> listEncadrantModel(List<EncadrantDto> encadrantDtoList);
}
