package map.servives.impl;

import map.dto.TacheProjetDto;
import map.mapping.TacheProjetMapping;
import map.repository.TacheProjetRespository;
import map.servives.TacheProjetService;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
@Service
public class TacheProjetServiceImpl implements TacheProjetService {
    private TacheProjetMapping tacheProjetMapping;
    private TacheProjetRespository tacheProjetRespository;
    public TacheProjetServiceImpl(TacheProjetRespository tacheProjetRespository,TacheProjetMapping tacheProjetMapping)
    {
        this.tacheProjetMapping=tacheProjetMapping;
        this.tacheProjetRespository=tacheProjetRespository;
    }
    @Override
    public void addTacheProjet(TacheProjetDto tacheProjetDto) {
        tacheProjetRespository.save(tacheProjetMapping.tacheProjetdtoToModel(tacheProjetDto));
    }

    @Override
    public List<TacheProjetDto> showTacheProjetCollection() {
        return tacheProjetMapping.listtoTacheProjetDto(tacheProjetRespository.findAll());
    }

    @Override
    public List<TacheProjetDto> showByOrderTacheProjetCollection() {
        List<TacheProjetDto> tacheProjetDtos = tacheProjetMapping.listtoTacheProjetDto(tacheProjetRespository.findAll());
        Collections.sort(tacheProjetDtos);
        return tacheProjetDtos;
    }

    @Override
    public void deleteTacheProjet(Long id) {
    if(tacheProjetRespository.existsById(id))
        tacheProjetRespository.deleteById(id);
    }

    @Override
    public void updateTacheProjet(TacheProjetDto tacheProjetDto, long id) {
        if(tacheProjetRespository.existsById(id))
            tacheProjetRespository.save(tacheProjetMapping.tacheProjetdtoToModel(tacheProjetDto));
    }
}
