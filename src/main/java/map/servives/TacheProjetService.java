package map.servives;

import map.dto.TacheProjetDto;


import java.util.List;


public interface TacheProjetService {
    void addTacheProjet(TacheProjetDto tacheProjetDto);

    List<TacheProjetDto> showTacheProjetCollection();
    List<TacheProjetDto> showByOrderTacheProjetCollection();
    void deleteTacheProjet(Long id);
    void updateTacheProjet(TacheProjetDto tacheProjetDto);


    //tache des stagiaires qui ont un projet vu par l'encadrant
    List<TacheProjetDto> internProjectTask(Long id);

    //tache des stagiaires dans un projet
    List<TacheProjetDto> traineeSpot(Long id);
}
