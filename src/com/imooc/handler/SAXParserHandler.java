package com.imooc.handler;



import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SAXParserHandler<viod> extends DefaultHandler {
	int bookIndex =0;
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		// TODO Auto-generated method stub
		super.startElement(uri, localName, qName, attributes);
		if(qName.equals("book")){
			bookIndex++;
//			String value = attributes.getValue("id");
//			System.out.println("book 的属性值是："+value);
//			
			int num=attributes.getLength();
			for (int i=0;i<num;i++){
				System.out.print("book元素的第"+(i+1)+attributes.getQName(i));
				System.out.println("--属性值是："+attributes.getValue(i));
			}
		}
		else if(!qName.equals("book")&&!qName.equals("bookstore")){
			System.out.println("节点名是："+qName);
		}
		
	}
	
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		// TODO Auto-generated method stub
		super.characters(ch, start, length);
		String value=new String(ch, start, length);
		if(!value.trim().equals("")){
			System.out.print("---节点值是："+value);
		}
		
	}
	
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		// TODO Auto-generated method stub
		super.endElement(uri, localName, qName);
		if(qName.equals("book")){
			System.out.println("=================结束遍"+bookIndex+"历的内容===========");
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
