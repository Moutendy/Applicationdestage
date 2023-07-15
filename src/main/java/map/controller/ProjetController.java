package map.controller;

import map.dto.ProjetDto;
import map.servives.ProjetService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("apis/projetstagiaire/")
public class ProjetController {
    ProjetService projetService;
    public ProjetController(ProjetService projetService)
    {
        this.projetService=projetService;
    }

    @PostMapping(value="addprojet",produces = "application/json")
    void addProjet(@RequestBody ProjetDto projetDto){
        projetService.addProjet(projetDto);
    }
}
