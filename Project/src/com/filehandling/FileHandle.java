package com.filehandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileHandle {
	void method() throws FileNotFoundException,IOException{
		FileReader fr =new FileReader("pes.txt");
		BufferedReader r=new BufferedReader(fr);
		throw new FileNotFoundException();
		
	}
	public static void main(String[] args) throws IOException {
		FileHandle e1=new FileHandle();
		try {
			e1.method();
		}catch(FileNotFoundException e) {
			 System.out.println(e.getMessage());
			
		}
		System.out.println("exception handelled");
	}
	

}
