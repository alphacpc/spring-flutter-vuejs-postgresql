//package com.africa.controller;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.multipart.MultipartFile;
//
//import com.africa.service.StorageService;
//
//
//@RestController
//@RequestMapping("api/v1/file")
//public class StorageController {
//
//	@Autowired
//	private StorageService storageService;
//
//	
//	@PostMapping("upload")
//	public ResponseEntity<String> uploaString(@RequestParam(value="file") MultipartFile file) {
//		
//		return new ResponseEntity<>(storageService.uploadFile(file), HttpStatus.OK) ;
//	}
//}
