package map.utils.services.impl;

import map.utils.services.FileService;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import org.springframework.beans.factory.annotation.Value;
import java.io.File;
@Service
public class FileServiceImpl implements FileService {
    @Value("${download.directory}")
    private String downloadDirectory;
    @Value("${update.directory}")
    private String updateDirectory;
    @Override
    public void uploadFile(MultipartFile file) {
        if (!Files.exists(Paths.get(updateDirectory))) {
            new File(updateDirectory).mkdir();
        }
        try {
            Path filePath = Path.of(updateDirectory, file.getOriginalFilename());
            Files.copy(file.getInputStream(), filePath, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
        }
    }

    @Override
    public ResponseEntity<Resource> downloadFile(String url) {
        try {
            Path imagePath = Paths.get(updateDirectory, url);
            Resource resource = new UrlResource(imagePath.toUri());
//            URL fileUrl = new URL(url);
//            String fileName = fileUrl.getFile().substring(fileUrl.getFile().lastIndexOf("/") + 1);
//            Path tempFilePath = Path.of(updateDirectory, url);
//            Files.copy(fileUrl.openStream(), tempFilePath, StandardCopyOption.REPLACE_EXISTING);
//
//            File file = tempFilePath.toFile();
//            Resource resource = new UrlResource(file.toURI());
//
//            if (resource.exists()) {
//                HttpHeaders headers = new HttpHeaders();
//                headers.add(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=" + fileName);
//                return ResponseEntity.ok().headers(headers).body(resource);
//            }
//        } catch (MalformedURLException e) {
//            // Gérer l'URL incorrecte
//        } catch (IOException e) {
//            // Gérer les erreurs de téléchargement
//        }


            if (resource.exists()) {
                return ResponseEntity.ok().contentType(MediaType.APPLICATION_PDF).body(resource);
            } else {
                return ResponseEntity.notFound().build();
            }
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
        // Gérer les erreurs de fichier inexistant

    }
}
