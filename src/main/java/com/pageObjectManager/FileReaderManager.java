package com.pageObjectManager;

import java.io.IOException;

public class FileReaderManager {

	private FileReaderManager() {
		
	}
	
	public static FileReaderManager getInstanceFRM() {
		FileReaderManager frm = new FileReaderManager();
		return frm;
	}
	
	public static ConfigurationReader getInstanceCR() throws IOException {
		ConfigurationReader cr = new ConfigurationReader();
		return cr;

	}
}
