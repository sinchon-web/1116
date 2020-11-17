package io;

import java.io.Console;
import java.io.IOException;
import java.io.InputStream;

public class IOTest02 {

	public static void main(String[] args) throws IOException {
		
		
		InputStream is=System.in;
		int readData=is.read();
		System.out.println("문자데이터로 읽어진다 : "+readData);
		//이클립스 실행시 null리턴 cmd모드 실행해야가능
		//Console console=System.console();
		//String str=console.readLine();
		
		//System.out.println(str);
		
		

	}

}
