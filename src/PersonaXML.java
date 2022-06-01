import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class PersonaXML extends Persona implements GenerableXML{
    public PersonaXML(String nombre, String apellidos, int edad, String dni, String domicilio) {
        super(nombre, apellidos, edad, dni, domicilio);
    }

    @Override
    public void generarXML() {
        try {
            Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
            Element root = doc.createElement("persona");
            doc.appendChild(root);

            Element nombre = doc.createElement("nombre");
            nombre.appendChild(doc.createTextNode(this.getNombre()));
            root.appendChild(nombre);

            Element apellidos = doc.createElement("apellidos");
            apellidos.appendChild(doc.createTextNode(this.getApellidos()));
            root.appendChild(apellidos);

            Element edad = doc.createElement("edad");
            edad.appendChild(doc.createTextNode("" + this.getEdad()));
            root.appendChild(edad);

            Element dni = doc.createElement("dni");
            dni.appendChild(doc.createTextNode(this.getDni()));
            root.appendChild(dni);

            Element domicilio = doc.createElement("domicilio");
            domicilio.appendChild(doc.createTextNode(this.getDomicilio()));
            root.appendChild(domicilio);

            Transformer trans = TransformerFactory.newInstance().newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new FileOutputStream("./" + (this.getNombre() + this.getEdad()).replace(" ", "") + ".xml"));

            trans.transform(source, result);

        } catch (ParserConfigurationException | FileNotFoundException | TransformerException e) {
            System.out.println("Hi ha hagut un problema al crear o escriure el document.");
        }
    }
}
