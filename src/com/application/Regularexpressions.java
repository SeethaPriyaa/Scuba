package com.application;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regularexpressions {

	public static void main(String[] args) {
		Regularexpressions re = new Regularexpressions();
		Scanner scanner = new Scanner(System.in);
		String fileNameString =  scanner.nextLine();
		re.isFileAcceptable(fileNameString);
	}
	
	public void isFileAcceptable(String checkFile) {
		
		Pattern pattern = Pattern.compile(".xlsx");
		Matcher matcher = pattern.matcher(checkFile);
		if(matcher.find()) {
			System.out.println("Found the text " + matcher.group()+ " starting at " + matcher.start() + " index and ending at index " + matcher.end());
			System.out.println(checkFile+" File can be uploaded");
		}
		else {
			System.out.println("File can't not be uploaded try with other file");
		}
		
		
	}

}
