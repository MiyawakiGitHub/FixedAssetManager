package com.example.demo.exception;

import org.springframework.web.multipart.MultipartFile;

public class FileUploadException extends Exception {

	private static final long serialVersionUID = 1L;
	
	private MultipartFile file = null;

	/**
	 * 
	 * @param message
	 * @param file
	 */
    public FileUploadException(String message, MultipartFile file) {
        super(message);
        this.file = file;
    }

    /**
     * 
     * @param message
     * @param cause
     * @param file
     */
    public FileUploadException(String message, Throwable cause, MultipartFile file) {
        super(message, cause);
        this.file = file;
    }

    /**
     * 
     * @return file
     */
    public MultipartFile getFile() {
        return file;
    }

}
