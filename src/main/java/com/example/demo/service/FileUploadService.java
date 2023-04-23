package com.example.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.exception.EmptyFileException;
import com.example.demo.exception.FileSizeException;
import com.example.demo.exception.FileUploadException;
import com.example.demo.exception.UnsupportedFileTypeException;

@Service
public class FileUploadService {

    private static final long MAX_FILE_SIZE = 1048576; // 1 MB

    public void uploadFile(MultipartFile file) throws FileUploadException {
        if (file.isEmpty()) {
            throw new EmptyFileException(file);
        }

        if (file.getSize() > MAX_FILE_SIZE) {
            throw new FileSizeException(String.valueOf(MAX_FILE_SIZE), file);
        }

        if (!file.getContentType().equals("application/vnd.ms-excel")) {
            throw new UnsupportedFileTypeException(file);
        }

        // ファイルの処理
        // ...
    }
}