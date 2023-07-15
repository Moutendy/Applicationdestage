package map.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import map.dto.StagiaireDto;
import map.servives.StagiaireServiceI;

@RestController
@RequestMapping("apis/stagiaire/")
public class StagiaireController {

	
	StagiaireServiceI stagiaireServiceI;
	
	public StagiaireController(StagiaireServiceI stagiaireServiceI){
		this.stagiaireServiceI = stagiaireServiceI;
	}
	
	 @PostMapping(value = "/addstagiaire",produces = "application/json")
	public void addListStagiaire(@RequestBody List<StagiaireDto> listStagiaire)
	{
		 stagiaireServiceI.addStagiaireCollection(listStagiaire);
	}
	 
	 @GetMapping(value="/showstagiaire",produces = "application/json")
	 public List<StagiaireDto> listStagiaire()
	 {
		 return stagiaireServiceI.showStagiaireCollection();
	 }

	@GetMapping(value="/showstagiairebyorder",produces = "application/json")
	public List<StagiaireDto> listStagiaireByOrder()
	{
		return stagiaireServiceI.showByOrderStagiaireCollection();
	}

}
