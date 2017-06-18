package com.imooc.file;

import java.io.FileInputStream;

public class IOUtil {
	
	
	public static void printHex(String fileName){
		FileInputStream in =new FileInputStream(fileName);
		int b;
		int i=1;
		while((b=in.read()!=-1)){
			System.out.println(Integer.toHexString(b)+" ");
			if(i++%10==0){
				System.out.println();
			}
		}
		in.close();
	}

	

}
