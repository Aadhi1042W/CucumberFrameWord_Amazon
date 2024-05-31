package com.Property;

public class AmazonFileReaderManager {

	private AmazonFileReaderManager() {
		
	}
	
	public static AmazonFileReaderManager getInstanceFileReaderManager() {

		AmazonFileReaderManager manager = new AmazonFileReaderManager();
		
		return manager;
	}
	
	
	public static ConfigClass getConfigReader() {

		ConfigClass cfg=new ConfigClass();
		
		return cfg;
	}
}
