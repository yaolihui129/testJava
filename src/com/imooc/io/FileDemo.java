package com.imooc.io;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 
		File file = new File("E:\\javaio\\imooc");
		//System.out.println(file.exists());
		if(!file.exists())
			file.mkdir(); //file.mkdirs()
		else
			file.delete();
		//
		System.out.println(file.isDirectory());
		//
		System.out.println(file.isFile());
		
		//File file2 = new File("e:\\javaio\\日记1.txt");
		File file2 = new File("e:\\javaio","日记1.txt");
		if(!file2.exists())
			try {
				file2.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		else 
			file2.delete();
         //常用的 File 对象 API
		System.out.println(file);//file.toString() 的内容
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getName());
		System.out.println(file2.getName());
		System.out.println(file.getParent());
		System.out.println(file2.getParent());
		System.out.println(file.getParentFile().getAbsolutePath());
	}
}
