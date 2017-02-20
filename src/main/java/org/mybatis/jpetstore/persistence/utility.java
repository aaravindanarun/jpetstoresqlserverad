package org.mybatis.jpetstore.persistence;

import java.io.FileNotFoundException;

import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.io.File;
import java.io.IOException;
@Component
public class utility {

	private static final String DELIMITER = "/";
	//getting the Current Working directory path of the Project
	private static String currentDirectory = System.getProperty("user.dir");
	
	//Setting the Configuration file location
	private static String CONFIG_LOCATION =currentDirectory;
	
	public static Resource getConfigFile(String fileName)
			throws FileNotFoundException {
		if (!StringUtils.hasText(fileName)) {
			throw new FileNotFoundException("File is empty");
		}
		
		System.setProperty(CONFIG_LOCATION, CONFIG_LOCATION );
	
		return  new FileSystemResource(
				System.getProperty(CONFIG_LOCATION) + DELIMITER + fileName);
	}
}
