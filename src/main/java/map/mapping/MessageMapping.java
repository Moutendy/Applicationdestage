package map.mapping;

import map.dto.MessageProjetDto;

import map.model.MessageProjetModel;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;
@Mapper(componentModel = "spring",uses = {ProjetMapper.class})
public interface MessageMapping {
    MessageMapping INSTANCE = Mappers.getMapper(MessageMapping.class);

    @Mapping(target="id", source="messageProjetModel.id")
    @Mapping(target="issue", source="messageProjetModel.issue")
    @Mapping(target="recipient", source="messageProjetModel.recipient")
    @Mapping(target="dateMessenger", source="messageProjetModel.dateMessenger")
    MessageProjetDto messageProjettoDto(MessageProjetModel messageProjetModel);

    @Mapping(target="id", source="messageProjetDto.id")
    @Mapping(target="issue", source="messageProjetDto.issue")
    @Mapping(target="recipient", source="messageProjetDto.recipient")
    @Mapping(target="dateMessenger", source="messageProjetDto.dateMessenger")
    MessageProjetModel messageProjetdtoToModel(MessageProjetDto messageProjetDto);
    List<MessageProjetDto> listtoMessageProjetDto(List<MessageProjetModel> messageProjetModels);

    List<MessageProjetModel> listMessageProjetModel(List<MessageProjetDto> messageProjetDtos);
}
