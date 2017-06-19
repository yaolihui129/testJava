package com.imooc.handler;



import java.util.ArrayList;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.imooc.entity.Book;

public class SAXParserHandler<viod> extends DefaultHandler {
	int bookIndex =0;
	String value=null;
	Book book=null;
	private ArrayList<Book> bookList=new ArrayList<Book>();
	
	
	
	
	public ArrayList<Book> getBookList() {
		return bookList;
	}

	public void setBookList(ArrayList<Book> bookList) {
		this.bookList = bookList;
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		// TODO Auto-generated method stub
		super.startElement(uri, localName, qName, attributes);
		if(qName.equals("book")){
			bookIndex++;
			bookList.add(book);
			book=new Book();
//			String value = attributes.getValue("id");
//			System.out.println("book 的属性值是："+value);
//			
			int num=attributes.getLength();
			for (int i=0;i<num;i++){
				System.out.println("book元素的第"+(i+1)+attributes.getQName(i));
				System.out.println("属性值是："+attributes.getValue(i));
				if(attributes.getQName(i).equals("id")){
					book.setId(attributes.getValue(i));
				}
			}
		}
		else if(!qName.equals("book")&&!qName.equals("bookstore")){
			System.out.print("节点名是："+qName);
		}
		
	}
	
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		// TODO Auto-generated method stub
		super.characters(ch, start, length);
		value=new String(ch, start, length);
		if(!value.trim().equals("")){
			System.out.println("--节点值是："+value);
		}
		
	}
	
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		// TODO Auto-generated method stub
		super.endElement(uri, localName, qName);
		if(qName.equals("book")){
			book=null;
			System.out.println("=================结束遍"+bookIndex+"历的内容===========");
		}
		else if(qName.equals("name")){
			book.setName(value);
		}
		else if(qName.equals("author")){
			book.setAuthor(value);
		}
		else if(qName.equals("year")){
			book.setYear(value);
		}
		else if(qName.equals("price")){
			book.setPrice(value);
		}
		else if(qName.equals("language")){
			book.setLanguage(value);
		}
	}
	
	@Override
	public void startDocument() throws SAXException {
		// TODO Auto-generated method stub
		super.startDocument();
		System.out.println("SAX 解析开始");
	}
	
	@Override
	public void endDocument() throws SAXException {
		// TODO Auto-generated method stub
		super.endDocument();
		System.out.println("SAX 解析结束");
	}

	

	
	
	
}
