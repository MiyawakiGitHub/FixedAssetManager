package com.example.demo.exception;

import org.springframework.web.multipart.MultipartFile;

public class UnsupportedFileTypeException extends FileUploadException {
    public UnsupportedFileTypeException(MultipartFile file) {
        super("Uploaded file has an unsupported file type", file);
    }
}
