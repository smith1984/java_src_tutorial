package Ch_7;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.File;

/**
 * Created by ito on 22.03.17.
 */
public class Transform {
    public static void main(String[] args) {
        if (args.length < 2){
            System.out.println("Usage: java Transform <имя_файла.xsl><имя файла.xml>");
            System.exit(0);
        }

        File xslFile = new File(args[0]);
        File xmlFile = new File(args[1]);

        StreamSource xslSourse = new StreamSource(xslFile);
        StreamSource xmlSource = new StreamSource(xmlFile);
        StreamResult outResult = new StreamResult(System.out);

        try{
            TransformerFactory factory = TransformerFactory.newInstance();
            Transformer transformer = factory.newTransformer(xslSourse);
            transformer.transform(xmlSource, outResult);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
