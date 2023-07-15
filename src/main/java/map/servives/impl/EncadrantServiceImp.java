package map.servives.impl;

import map.dto.EncadrantDto;
import map.mapping.EncadrantMapper;
import map.repository.EncadrantRepository;
import map.servives.EncadrantService;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class EncadrantServiceImp implements EncadrantService {

   private EncadrantRepository encadrantRepository;

   private EncadrantMapper encadrantMapper;
   public EncadrantServiceImp(EncadrantRepository encadrantRepository,EncadrantMapper encadrantMapper)
   {
       this.encadrantMapper=encadrantMapper;
       this.encadrantRepository=encadrantRepository;
   }
    @Override
    public void addEncadrant(EncadrantDto encadrantDto) {
        encadrantRepository.save(encadrantMapper.encadrantdtoToModel(encadrantDto));
    }

    @Override
    public List<EncadrantDto> showEncadrantCollection() {
        return encadrantMapper.listtoEncadrantDto(encadrantRepository.findAll());
    }

    @Override
    public List<EncadrantDto> showByOrderEncadrantCollection() {
        List<EncadrantDto>encadrantDtoList = encadrantMapper.listtoEncadrantDto(encadrantRepository.findAll());
        Collections.sort(encadrantDtoList);
        return encadrantDtoList;
    }

    @Override
    public void deleteEncadrant(Long id) {
        if(encadrantRepository.existsById(id)) {
            encadrantRepository.deleteById(id);
        }
    }

    @Override
    public void updateEncadrant(EncadrantDto encadrantDto, long id) {
        if(encadrantRepository.existsById(id)) {
            encadrantRepository.save(encadrantMapper.encadrantdtoToModel(encadrantDto));
        }
    }
}
