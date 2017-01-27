package org.mybatis.jpetstore.persistence;

import java.io.FileNotFoundException;

import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
public class utility {

	private static final String DELIMITER = "/";
	private static String CONFIG_LOCATION = "d:\home\site\wwwroot\webapps";

	public static Resource getConfigFile(String fileName)
			throws FileNotFoundException {
		if (!StringUtils.hasText(fileName)) {
			throw new FileNotFoundException("File is empty");
		}
		System.setProperty(CONFIG_LOCATION, "d:\home\site\wwwroot\webapps");
	
		return  new FileSystemResource(
				System.getProperty(CONFIG_LOCATION) + DELIMITER + fileName);
	}
}
