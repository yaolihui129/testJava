package com.imooc.file;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("/Users/yaolh/Desktop/yao");
		if(!file.exists())
			file.mkdirs();//file.mkdirs();
		else
			file.delete();
		//是否是一个目录，如果是目录返回true
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
		
		File file2 =new File("/Users/yaolh/Desktop/yao/日记1.txt");
		if(!file2.exists())
			try{
				file2.createNewFile();
			}catch(IOException e){
				e.printStackTrace();
			}
		else
			file2.delete();
		
		System.out.println(file);
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getName());
		System.out.println(file2.getName());
		System.out.println(file.getParent());
		System.out.println(file.getParentFile().getAbsolutePath());
			
		
	}

}
