package map.controller;

import map.dto.EncadrantDto;
import map.mapping.EncadrantMapper;
import map.servives.EncadrantService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("apis/encadrant/")
public class EncadrantController {
    private EncadrantService encadrantService;
    public EncadrantController(EncadrantService encadrantService) {
        this.encadrantService=encadrantService;
    }
    @GetMapping(value="showencadrant",produces = "application/json")
    List<EncadrantDto> showEncadrant() {
       return encadrantService.showEncadrantCollection();
    }
    @GetMapping(value="showbydordencadrant",produces = "application/json")
    List<EncadrantDto> showEncadrantByOrder() {
        return encadrantService.showByOrderEncadrantCollection();
    }
    @PutMapping(value="updateencadrant" ,consumes = "application/json")
    void updateEncadrant(@RequestBody EncadrantDto encadrantDto) {
        encadrantService.updateEncadrant(encadrantDto);
    }
    @PostMapping(value="postencadrant" ,consumes = "application/json")
    void postEncadrant(@RequestBody EncadrantDto encadrantDto) {
        encadrantService.addEncadrant(encadrantDto);
    }
}
