package com.imooc.file;

import java.io.File;
import java.io.IOException;

//列出 File 的一些常用操作如例遍、过滤等操作
public class FileUtils {

	/*
	 * 列出指定目录下（包括
	 */
	
	public static void listDirectory(File dir)throws IOException{
		if(!dir.exists()){
			throw new IllegalArgumentException("目录："+dir+"不存在.");
		}
		if(!dir.isDirectory()){
			throw new IllegalArgumentException(dir+"不是目录");
		}
//		String[] filenames=dir.list();//返回的是字符串数组直接子的名称，不包含子目录下的内容
//		for (String string:filenames){
//			System.out.println(dir+"/"+string);
//		}
		
//		如果要遍历子目录下的内容
		
	File[] files =dir.listFiles();
	if(files!=null && files.length>0){
		for(File file:files){
			if(file.isDirectory()){
				//递归
				listDirectory(file);
			}else{
				System.out.println(file);
			}
			
		}
	}
	
	
		
		
		
	}
}
