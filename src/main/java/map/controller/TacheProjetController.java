package map.controller;

import map.dto.ProjetDto;
import map.dto.TacheProjetDto;
import map.servives.TacheProjetService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("apis/tachesProjet/")
public class TacheProjetController {
    private TacheProjetService tacheProjetService;
    public TacheProjetController(TacheProjetService tacheProjetService)
    {
        this.tacheProjetService=tacheProjetService;
    }
    @PostMapping(value="addtache",produces = "application/json")
    void addTache(@RequestBody TacheProjetDto tacheProjetDto){
        tacheProjetService.addTacheProjet(tacheProjetDto);
    }
     @PutMapping(value = "updatetache",produces = "application/json")
    void updateTache(@RequestBody TacheProjetDto tacheProjetDto){
         tacheProjetService.updateTacheProjet(tacheProjetDto);
    }
    @DeleteMapping(value="delete/{id}",produces = "application/json")
    void deleteProjet(@PathVariable("id")Long id){
        tacheProjetService.deleteTacheProjet(id);
    }
   @GetMapping(value="getallTache",consumes = "application/json")
   List<TacheProjetDto> getAllTache()
   {
      return tacheProjetService.showTacheProjetCollection();
   }
   @GetMapping(value = "getallbyorder",consumes = "application/json")
    List<TacheProjetDto>getAllbyOrderTache()
   {
       return tacheProjetService.showByOrderTacheProjetCollection();
   }
}
