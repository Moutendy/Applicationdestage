package map.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

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
	public void addListStagiaire(@RequestBody List<StagiaireDto> listStagiaire) {
		 stagiaireServiceI.addStagiaireCollection(listStagiaire);
	}
	@PutMapping(value = "/addstagiaire",produces = "application/json")
	public void updateListStagiaire(@RequestBody List<StagiaireDto> listStagiaire) {
		stagiaireServiceI.addStagiaireCollection(listStagiaire);
		stagiaireServiceI.updateStagiaire(listStagiaire);
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
    @GetMapping(value = "showstagiairebyorder/{id}",consumes = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.MULTIPART_FORM_DATA_VALUE }, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<StagiaireDto> listOfTrainees(@PathVariable("id")Long id)
	{
		return stagiaireServiceI.listOfTrainees(id);
	}
}
