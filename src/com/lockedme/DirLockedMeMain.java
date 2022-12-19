package com.lockedme;

public class DirLockedMeMain {

	public static void main(String[] args) {
		
		// Create "main" folder if not present in current folder structure
		DirFileOperations.createMainFolderIfNotPresent("main");
		
		DirMenuOptions.printWelcomeScreen("LockedMe", "Anand Singh");
		
		DirHandleOptions.handleWelcomeScreenInput();
	}

	
}
