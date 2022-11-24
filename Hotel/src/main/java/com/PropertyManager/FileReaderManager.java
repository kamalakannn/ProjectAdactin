package com.PropertyManager;

public class FileReaderManager {

	private FileReaderManager() {
	}

	public static FileReaderManager getInstanceFRM() {

		FileReaderManager fmr = new FileReaderManager();
		return fmr;

	}

	public FileReader getInstanceFR() throws Throwable {

		FileReader fr = new FileReader();

		return fr;
	}

}
