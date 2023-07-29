package map.servives.impl;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import map.mapping.StagiaireMapper;
import org.springframework.stereotype.Service;

import map.dto.StagiaireDto;
import map.repository.StagiaireRepository;
import map.servives.StagiaireServiceI;

@Service
public class StagiaireServiceImpl implements StagiaireServiceI{

	
	StagiaireRepository stagiaireRepository;
	
	StagiaireMapper stagiaireMapper;
	
	public StagiaireServiceImpl(StagiaireMapper stagiaireMapper, StagiaireRepository stagiaireRepository){
		this.stagiaireRepository = stagiaireRepository;
		this.stagiaireMapper = stagiaireMapper;
	}
	
	@Override
	public void addStagiaireCollection(List<StagiaireDto> listStagiaire) {
		// TODO Auto-generated method stub
		stagiaireRepository.saveAll(stagiaireMapper.listStagiaireModel(listStagiaire));
	}

	@Override
	public List<StagiaireDto> showStagiaireCollection() {
		// TODO Auto-generated method stub
		return stagiaireMapper.listtoStagiaireDto(stagiaireRepository.findAll());
	}

	@Override
	public List<StagiaireDto> showByOrderStagiaireCollection() {
		// TODO Auto-generated method stub
		List<StagiaireDto> listStagiaire= stagiaireMapper.listtoStagiaireDto(stagiaireRepository.findAll());
		Collections.sort(listStagiaire);
		return listStagiaire;
	}

	@Override
	public void deleteStagiaire(List<Long> id) {
		stagiaireRepository.deleteAllById(id);
	}
	@Override
	public void updateStagiaire(List<StagiaireDto> listStagiaire) {
		stagiaireRepository.saveAll(stagiaireMapper.listStagiaireModel(listStagiaire));
	}

	@Override
	public List<StagiaireDto> listOfTrainees(Long id) {
		return stagiaireMapper.listtoStagiaireDto(stagiaireRepository.listOfTrainees(id));
	}
}
