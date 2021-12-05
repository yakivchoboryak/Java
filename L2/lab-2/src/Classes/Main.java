package Classes;

import java.io.IOException;

public class Main {
    private static final String XMLPath = "D:\\JavaLabs\\Java\\L2\\j2.xml";
    private static final String JSONPath = "D:\\JavaLabs\\Java\\L2\\j2.json";
    private static final String TEXTPath = "D:\\JavaLabs\\Java\\L2\\j2.txt";


    public static void main(String[] args) throws IOException {
        XMLSerializer xml = new XMLSerializer();
        TEXTSerializer text = new TEXTSerializer();
        JSONSerializer json = new JSONSerializer();

        BMX bmx1 = new BMX();

        bmx1.setName("!--!--!");
        bmx1.setMovingAngle(35);
        bmx1.setCompanyName("java");
        bmx1.setOwnerName("Yakiv");

        xml.Serialize(bmx1,XMLPath);
        text.Serialize(bmx1,TEXTPath);
        json.Serialize(bmx1,JSONPath);

        BMX XMLbmx = xml.DeSerialize(XMLPath);
        BMX TEXTbmx = text.DeSerialize(TEXTPath);
        BMX JSONbmx = json.DeSerialize(JSONPath);
    }
}
