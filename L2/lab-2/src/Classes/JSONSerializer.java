package Classes;

import Interfaces.ISerializble;
import org.json.JSONObject;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JSONSerializer implements ISerializble {
    @Override
    public void Serialize(BMX obj, String path) throws IOException {
        try (PrintWriter out = new PrintWriter(path)) {
            out.println(new JSONObject(obj));
        }
    }

    @Override
    public BMX DeSerialize(String path) throws IOException {

        BMX bmx = new BMX();

        String json = new String(Files.readAllBytes(Paths.get(path)));
        JSONObject obj = new JSONObject(json);

        bmx.setName(obj.getString("name"));
        bmx.setCompanyName(obj.getString("companyName"));
        bmx.setMovingAngle(obj.getInt("movingAngle"));
        bmx.setOwnerName(obj.getString("ownerName"));

        return bmx;
    }
}