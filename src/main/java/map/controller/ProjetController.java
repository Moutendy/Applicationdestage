package map.controller;

import map.dto.ProjetDto;
import map.servives.ProjetService;
import map.utils.services.FileService;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@RestController
@RequestMapping("apis/projetstagiaire/")
public class ProjetController {
  private  ProjetService projetService;
  private   FileService fileService;
    public ProjetController(ProjetService projetService,FileService fileService)
    {
        this.fileService = fileService;
        this.projetService = projetService;
    }

    @PostMapping(value = "addprojet",consumes = {
            MediaType.APPLICATION_JSON_VALUE }, produces = MediaType.APPLICATION_JSON_VALUE)
    void addProjet(@RequestBody  ProjetDto projetDto){

        projetService.addProjet(projetDto);
    }
    @PutMapping(value = "updateprojet",produces = "application/json")
    void updateProjet(@RequestBody ProjetDto projetDto){
        projetService.updateProjet(projetDto);
    }
    @GetMapping(value = "getallprojet",produces = "application/json")
    List<ProjetDto> getProjet(){
       return projetService.showProjetCollection();
    }
    @GetMapping(value = "getallbyorderprojet",produces = "application/json")
    List<ProjetDto> getByOrderProjet(){
        return projetService.showByOrderProjetCollection();
    }
    @DeleteMapping(value = "deleteprojet/{id}",produces = "application/json")
    void deleteByOrderProjet(@PathVariable("id")Long id){
         projetService.deleteProjet(id);
    }

    @GetMapping(value = "downloadprojet/{url}",consumes = { MediaType.APPLICATION_JSON_VALUE,
            MediaType.MULTIPART_FORM_DATA_VALUE }, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Resource> downloadFile(@PathVariable("url") String url) {
        return fileService.downloadFile(url);
    }

    @PostMapping(value="uploadfileprojet",consumes = { MediaType.APPLICATION_JSON_VALUE,
            MediaType.MULTIPART_FORM_DATA_VALUE }, produces = MediaType.APPLICATION_JSON_VALUE)
    public void uploadFile(@RequestParam("file") MultipartFile file) {
         fileService.uploadFile(file);
    }

    @GetMapping(value = "stagiaireofencadrant/{id}",consumes = { MediaType.APPLICATION_JSON_VALUE,
            MediaType.MULTIPART_FORM_DATA_VALUE }, produces = MediaType.APPLICATION_JSON_VALUE)
    List<ProjetDto> traineeProjectForSupervisor(@PathVariable("id") Long id)
    {
        return projetService.traineeProjectForSupervisor(id);
    }

    @GetMapping(value = "projetstagiaire/{id}",consumes = { MediaType.APPLICATION_JSON_VALUE,
            MediaType.MULTIPART_FORM_DATA_VALUE }, produces = MediaType.APPLICATION_JSON_VALUE)
    List<ProjetDto> internProject(@PathVariable("id") Long id)
    {
        return projetService.internProject(id);
    }
}
