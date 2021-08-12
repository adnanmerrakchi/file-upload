package com.example.uploadingfiles;

import com.example.uploadingfiles.storage.StorageService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FileUploadController {

    private final StorageService storageService;

    public FileUploadController(StorageService storageService) {
        this.storageService = storageService;
    }

    @GetMapping
    public String getFiles(){
        return "";
    }

    @GetMapping("/files/{filename}")
    public String getFile(@PathVariable("filename") String filename ){
        return "";
    }

    @PostMapping
    public String uploadFile(){
        return "";
    }

}
