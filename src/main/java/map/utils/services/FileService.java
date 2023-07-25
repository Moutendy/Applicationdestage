package map.utils.services;

import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

public interface FileService {
     void uploadFile(MultipartFile file);
     ResponseEntity<Resource> downloadFile(String url);
}
