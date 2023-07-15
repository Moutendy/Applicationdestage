package map.mapping;

import map.dto.StagiaireDto;
import map.model.StagiaireModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring",uses = {ProjetMapper.class,EncadrantMapper.class})
public interface StagiaireMapper {
    StagiaireMapper INSTANCE = Mappers.getMapper(StagiaireMapper.class);
    @Mapping(target="id", source="stagiaireModel.id")
    @Mapping(target="nom", source="stagiaireModel.nom")
    @Mapping(target="prenom", source="stagiaireModel.prenom")
    StagiaireDto stagiairemodeltoDto(StagiaireModel stagiaireModel);

    @Mapping(target="id", source="stagiaireDto.id")
    @Mapping(target="nom", source="stagiaireDto.nom")
    @Mapping(target="prenom", source="stagiaireDto.prenom")
    StagiaireModel stagiairedtoToModel(StagiaireDto stagiaireDto);
    List<StagiaireDto> listtoStagiaireDto(List<StagiaireModel> stagiaireModelList);

    List<StagiaireModel> listStagiaireModel(List<StagiaireDto> stagiaireDtoList);
}
