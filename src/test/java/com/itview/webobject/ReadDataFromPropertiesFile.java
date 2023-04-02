package com.itview.webobject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadDataFromPropertiesFile {

	public static void main(String[] args) throws Exception {


		String projectPath = System.getProperty("user.dir"); // current project path return		
		String configFilePath=projectPath+"\\Config\\config.properties";
		
		
		FileInputStream fi=new FileInputStream(configFilePath);		
		Properties prop=new Properties();		
		prop.load(fi);
		
		String browerName=prop.getProperty("browser");
		String url=prop.getProperty("carHomeEMI");
				
			System.out.println(browerName);	
			System.out.println(url);
			

	}

}
