package com.imooc.file;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutDemo {
	
	public static void main(String[] args)throws IOException{
		
		FileOutputStream out =new FileOutputStream("demo/out.dat",true);
		out.write('A');
		out.write('B');
		int a =10;
	}

}
