package io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOTest04 {

	public static void main(String[] args) throws IOException {
		
		FileReader fr=new FileReader("C:/Users/user/Desktop/data1116.txt");
		
		int data;
		while(true ) {
			data=fr.read();
			if(data == -1 ) {break;}
			System.out.print((char)data);
		}
		
		
		fr.close();

	}

}
