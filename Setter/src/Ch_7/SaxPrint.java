package Ch_7;

import java.io.*;
import javax.xml.parsers.*;
import org.xml.sax.*;
import  org.xml.sax.helpers.*;

public class SaxPrint extends DefaultHandler{

    public void startDocument() throws SAXException{
        System.out.println("Начало документа.");
    }

    public void endDocument() throws SAXException{
        System.out.println("");
        System.out.println("Конец документа.");
    }

    public void startElement(String uri, String lName, String qName, Attributes attribs) throws SAXException{
        System.out.println("");
        System.out.println("   Начало " + qName);
        if (attribs.getLength() > 0){
            for (int i = 0; i < attribs.getLength(); i++){
                System.out.println("         ." + attribs.getQName(i) + " = " + attribs.getValue(i));
            }
        }
    }

    public void endElement(String uri, String lName, String qName) throws SAXException{
        System.out.println("   Конец " + qName);
    }

    public void characters(char[] data, int start, int leght) throws SAXException{
        StringBuffer buffer = new StringBuffer(leght);
        buffer.append(data, start, leght);
        if (buffer.toString().trim().length() > 0)
            System.out.println(" " + buffer);
    }

    public static void main(String[] args) {
        if (args.length < 1){
            System.out.println("Usage: java SaxPrint <имя файла.xml>");
            System.exit(0);
        }
        File docFile = new File(args[0]);
        try{
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();
            saxParser.parse(docFile, new SaxPrint());
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
