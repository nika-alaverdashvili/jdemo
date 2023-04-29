import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;

public class XmlWriterExample {
    public static void main(String[] args) {
        // Create departments
        String[][] departments = {
                {"HR", "hr@oracle.com"},
                {"IT", "it@java.com"}
        };

        // Create XMLStreamWriter
        XMLOutputFactory xmlOutputFactory = XMLOutputFactory.newInstance();
        try {
            XMLStreamWriter xmlStreamWriter = xmlOutputFactory.createXMLStreamWriter(new FileWriter("departments.xml"));

            // Write XML document
            xmlStreamWriter.writeStartDocument();
            xmlStreamWriter.writeStartElement("departments");
            for (String[] department : departments) {
                xmlStreamWriter.writeStartElement("department");
                xmlStreamWriter.writeStartElement("name");
                xmlStreamWriter.writeCharacters(department[0]);
                xmlStreamWriter.writeEndElement();
                xmlStreamWriter.writeStartElement("email");
                xmlStreamWriter.writeCharacters(department[1]);
                xmlStreamWriter.writeEndElement();
                xmlStreamWriter.writeEndElement();
            }
            xmlStreamWriter.writeEndElement();
            xmlStreamWriter.writeEndDocument();

            // Close writer
            xmlStreamWriter.flush();
            xmlStreamWriter.close();

            // Output success message
            System.out.println("XML document generated successfully.");
        } catch (XMLStreamException | IOException e) {
            e.printStackTrace();
        }
    }
}
