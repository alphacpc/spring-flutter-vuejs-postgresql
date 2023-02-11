package com.africa.config;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Needs {
	
	public String render_datetime() {
		
		LocalDateTime myDateObj = LocalDateTime.now();
	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	    
	    return myDateObj.format(myFormatObj);
	}

}
