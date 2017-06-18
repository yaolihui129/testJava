package com.imooc.xml;
import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.SAXException;
import com.imooc.handler.SAXParserHandler;
public class SAXTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SAXParserFactory factory=SAXParserFactory.newInstance();
		try {
			SAXParser parser = factory.newSAXParser();
			SAXParserHandler handler =new SAXParserHandler();
			parser.parse("books.xml", handler);
		} catch(ParserConfigurationException e){
			e.printStackTrace();
			
		}catch (SAXException e) {
			// TODO: handle exception
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
			
		}
	}
}
