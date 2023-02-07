package com.application;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExceptionHandling {

	public static void main(String[] args) throws IOException  {
		try {
			File fil = new File ("C:/seethalk/txt.xlsx");
			FileInputStream fs = new FileInputStream(fil);
			fs.close();
		}catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
			System.out.println("Inside catch");
		}
		
		file_input();
	}
			
	
	public static void file_input() throws IOException{
		File fil = new File ("C:/seethalk/txt.xlsx");
		FileInputStream fs = new FileInputStream(fil);
		fs.close();
}

}
