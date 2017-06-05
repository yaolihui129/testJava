package com.imooc.io;

import java.io.UnsupportedEncodingException;

public class EncodeDemo {

	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		String s ="慕课 ABC";
		byte[] bytes1 = s.getBytes();//转换成字节序列用的是项目默认的编码
		for(byte b:bytes1){
			//把字节转换成 int 以16进制的方式显示
			System.out.println(Integer.toHexString(b & 0xff)+" ");
		}
		byte[] bytes3 = s.getBytes("utf-16be");
		for(byte b:bytes3){
			//把字节转换成 int 以16进制的方式显示
			System.out.println(Integer.toHexString(b & 0xff)+" ");
		}
	}

}
