package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

class AAA extends InputStream{

	@Override
	public int read() throws IOException {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

public class IOTest01 {
	
	//public abstract void disp();
	public static void main(String[] args) throws IOException {
		//File file=new File("img_1.jpg");
		//FileInputStream fis=new FileInputStream(file);
		FileInputStream fis=null; 
		fis=new FileInputStream(new File("img_1.jpg"));
		FileOutputStream fos=null;
		fos=new FileOutputStream("img_4_copy.jpg");
		int readData;
		//*
		while( (readData = fis.read()) != -1 ) {
			
			fos.write(readData);
		}
		//*/
		/*
		boolean check;
		do {
			readData = fis.read();
			check=readData != -1;
			if(check) {
				fos.write(readData);
			}
		}while(check);
		//*/
		
		fos.close();
		fis.close();
		

	}

}
