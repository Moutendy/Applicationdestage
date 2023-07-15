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

    @GetMapping(value="showencadrant",consumes = "application/json")
    List<EncadrantDto> showEncadrant() {
       return encadrantService.showEncadrantCollection();
    }
    @GetMapping(value="showbydordencadrant",consumes = "application/json")
    List<EncadrantDto> showEncadrantByOrder() {
        return encadrantService.showByOrderEncadrantCollection();
    }


    @PutMapping(value="updateencadrant/{id}" ,consumes = "application/json")
    void updateEncadrant(@RequestBody EncadrantDto encadrantDto,@PathVariable("id") Long id) {
        encadrantService.updateEncadrant(encadrantDto,id);
    }
    @PostMapping(value="postencadrant/{id}" ,consumes = "application/json")
    void postEncadrant(@RequestBody EncadrantDto encadrantDto) {
        encadrantService.addEncadrant(encadrantDto);
    }
}
