package com.imooc.file;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

public class RafDemo {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		File demo =new File("demo");
		if(!demo.exists())
			demo.mkdir();
		File file =new File(demo,"raf.dat");
		if(!file.exists())
			file.createNewFile();
		RandomAccessFile raf = new RandomAccessFile(file, "rw");
		System.out.println(raf.getFilePointer());
		raf.write('A');
		System.out.println(raf.getFilePointer());
		raf.write('B');	
		
		
		int i = 0x7fffffff;
		//用 write 方法每次只能写一个字节
		raf.write(i>>>24);
		raf.write(i>>>16);
		raf.write(i>>>8);
		raf.write(i);
		System.out.println(raf.getFilePointer());
		raf.write(i);
		
		String s = "中";
		byte[] gbk =s.getBytes("gbk");
		raf.write(gbk);
		System.out.println(raf.length());
		
		//读文件，必须把指针移动到头部
		raf.seek(0);
		byte[] buf =new byte[(int)raf.length()];
		raf.read(buf);
		System.out.println(Arrays.toString(buf));
		String s1 = new String(buf);
		System.out.println(s1);
		for(byte b:buf){
//			System.out.println(Integer.toHexString(b &));
		}
	}

}
