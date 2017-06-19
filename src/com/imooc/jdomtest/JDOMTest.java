package com.imooc.jdomtest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;


public class JDOMTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SAXBuilder saxBuilder= new SAXBuilder();
		InputStream in;
		try {
			in = new FileInputStream("book.xml");
			Document document = saxBuilder.build(in);
			Element rootElement=document.getRootElement();
			List<Element> bookList =rootElement.getChildren();
			
			for(Element book:bookList){
				System.out.println("开始解析第"+(bookList.indexOf(book) +1)+"书====");
				System.out.println("结束解析第"+(bookList.indexOf(book) +1)+"书====");
			}
			
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}catch(JDOMException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}

}
