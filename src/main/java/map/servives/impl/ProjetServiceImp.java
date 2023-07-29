package map.servives.impl;

import map.dto.ProjetDto;
import map.mapping.ProjetMapper;
import map.repository.ProjetRepository;
import map.servives.ProjetService;
import org.springframework.stereotype.Service;
import java.util.Collections;
import java.util.List;
@Service
public class ProjetServiceImp implements ProjetService {
    ProjetRepository projetRepository;
    ProjetMapper projetMapper;
    public ProjetServiceImp(ProjetRepository projetRepository, ProjetMapper projetMapper)
    {
        this.projetMapper = projetMapper;
        this.projetRepository = projetRepository;
    }
    @Override
    public void addProjet(ProjetDto projet) {
        projetRepository.save(projetMapper.DtoToModel(projet));
    }
    @Override
    public List<ProjetDto> showProjetCollection() {
        return projetMapper.listtoProjetDto(projetRepository.findAll());
    }
    @Override
    public List<ProjetDto> showByOrderProjetCollection() {
        List<ProjetDto> listProjet= projetMapper.listtoProjetDto(projetRepository.findAll());
        Collections.sort(listProjet);
        return listProjet;
    }
    @Override
    public void deleteProjet(Long id) {
        if(projetRepository.existsById(id)) {
            projetRepository.deleteById(id);
        }
    }
    @Override
    public void updateProjet(ProjetDto projet) {
        projetRepository.save(projetMapper.DtoToModel(projet));
    }
    @Override
    public List<ProjetDto> traineeProjectForSupervisor(Long id) {
        return projetMapper.listtoProjetDto(projetRepository.traineeProjectForSupervisor(id));
    }
    @Override
    public List<ProjetDto> internProject(Long id) {
        return projetMapper.listtoProjetDto(projetRepository.internProject(id));
    }
}
