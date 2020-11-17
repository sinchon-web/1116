package io;

import java.io.File;
import java.io.IOException;

public class IOTest03 {

	public static void main(String[] args) throws IOException {
		String path="D:/java/workspace/day1116/src/io";
		File dir=new File(path+"/test");
		
		if(dir.exists()) {//파일객체 존재여부 체크
			System.out.println("존재합니다");
		}else {
			System.out.println("없다.");
			//dir.createNewFile();
			dir.mkdirs();//디렉토리 생성...
			System.out.println("201116 폴더 생성");
		}
		String fileName="f" + System.nanoTime() + ".txt";
		File file=new File(dir, fileName);
		
		file.createNewFile();
		System.out.println("파일생성완료!");

	}

}
