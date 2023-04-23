package com.example.demo.exception;


import org.springframework.web.multipart.MultipartFile;

public class EmptyFileException extends FileSizeException {
    public EmptyFileException(MultipartFile file) {
        super("Uploaded file is empty", file);
    }
}