package map.servives;

import map.dto.EncadrantDto;
import map.dto.ProjetDto;

import java.util.List;

public interface EncadrantService {
    void addEncadrant(EncadrantDto encadrantDto);

    List<EncadrantDto> showEncadrantCollection();
    List<EncadrantDto> showByOrderEncadrantCollection();
    void deleteEncadrant(Long id);
    void updateEncadrant(EncadrantDto encadrantDto);
}
