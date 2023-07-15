package map.servives;

import map.dto.TacheProjetDto;


import java.util.List;


public interface TacheProjetService {
    void addTacheProjet(TacheProjetDto tacheProjetDto);

    List<TacheProjetDto> showTacheProjetCollection();
    List<TacheProjetDto> showByOrderTacheProjetCollection();
    void deleteTacheProjet(Long id);
    void updateTacheProjet(TacheProjetDto tacheProjetDto,long id);
}
