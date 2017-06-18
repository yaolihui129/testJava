package com.imooc.xml;

import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DOMTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DocumentBuilderFactory dbf=	DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document document=db.parse("books.xml");
			NodeList booklist = document.getElementsByTagName("book");
			System.out.println(booklist.getLength());
			//遍历没一个 book 节点
			for(int i=0;i<booklist.getLength();i++){
				Node book= booklist.item(i);
				NamedNodeMap attrs =book.getAttributes();
				System.out.println("第"+(i+1)+"本书");
				for(int j=0;j<attrs.getLength();j++){
					Node attr=attrs.item(j);
					System.out.print("属性名："+attr.getNodeName());
					System.out.println("--属性值："+attr.getNodeValue());
					
				}
				
				NodeList childNodes =book.getChildNodes();
				System.out.println("第"+(i+1)+"本书共有"+childNodes.getLength()+"个子节点");
				for(int k=0;k<childNodes.getLength();k++){
					if(childNodes.item(k).getNodeType()==Node.ELEMENT_NODE){
						//获取了 element 类型节点的节点名
						System.out.print("第"+(k+1)+"个节点的节点名"+childNodes.item(k).getNodeName());
						System.out.println("--节点值是："+childNodes.item(k).getFirstChild().getNodeValue());
					}
					
				}
				
				System.out.println("========结束例遍"+(i+1));
			}
		} catch (ParserConfigurationException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO: handle exception
			e.printStackTrace();
		}catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
