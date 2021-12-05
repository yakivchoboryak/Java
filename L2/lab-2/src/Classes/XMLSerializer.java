package Classes;

import Interfaces.ISerializble;
import com.fasterxml.jackson.xml.XmlMapper;
import java.io.File;
import java.io.IOException;

public class XMLSerializer implements ISerializble {

    @Override
    public void Serialize(BMX obj, String path) throws IOException {
        XmlMapper mapper = new XmlMapper();
        mapper.writeValue(new File(path), obj);
    }

    @Override
    public BMX DeSerialize(String path) throws IOException {
        XmlMapper xmlMapper = new XmlMapper();
        BMX value = xmlMapper.readValue(new File(path), BMX.class);
        return  value;
    }
}