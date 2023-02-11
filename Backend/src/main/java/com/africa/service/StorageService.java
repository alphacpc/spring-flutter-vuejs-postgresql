//package com.africa.service;
//
//import java.io.File;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.time.LocalDateTime;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Service;
//import org.springframework.web.multipart.MultipartFile;
//
//import com.amazonaws.services.s3.AmazonS3;
//
//@Service 
//public class StorageService {
//
//	@Value("${application.bucket.name}")
//	private String bucketName;
//	
//	@Autowired
//	private AmazonS3 s3Client;
//	
//	public String uploadFile(MultipartFile file) {
//		
//		File fileObj = convertMultiPartFileToFile(file);
//		
//		String filename = LocalDateTime.now() + "_" + file.getOriginalFilename();
//		
//		s3Client.putObject(bucketName, filename, fileObj);
//				
//		fileObj.delete();
//		
//		return "File updated : " + filename;
//	}
//	
//	
//
//	private File convertMultiPartFileToFile(MultipartFile file) {
//		
//		File convertedFile = new File(file.getOriginalFilename());
//		
//		try(FileOutputStream fos = new FileOutputStream(convertedFile)) {
//			fos.write(file.getBytes());
//		}
//		catch(IOException e) {
//			System.out.println("Erreur de convertion multipartFile to file => " + e);
//		}
//		
//		return convertedFile;
//	}
//	
//}
