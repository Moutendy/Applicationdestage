package map.servives;

import map.dto.ProjetDto;
import map.dto.StagiaireDto;

import java.util.List;

public interface ProjetService {
    void addProjet(ProjetDto projet);

    List<ProjetDto> showProjetCollection();
    List<ProjetDto> showByOrderProjetCollection();
    void deleteProjet(Long id);
    void updateProjet(ProjetDto projet,long id);
}
