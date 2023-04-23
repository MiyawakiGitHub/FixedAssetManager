package com.example.demo.exception;

import org.springframework.web.multipart.MultipartFile;

public class FileSizeException extends FileUploadException {
    public FileSizeException(String str, MultipartFile file) {
        super("Uploaded file size exceeds maximum size of " + file + " bytes", file);
    }
}