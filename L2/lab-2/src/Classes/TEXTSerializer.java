package Classes;
import Interfaces.ISerializble;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class TEXTSerializer implements ISerializble {
    @Override
    public void Serialize(BMX obj, String path) throws IOException {
        try (PrintWriter out = new PrintWriter(path)) {
            out.println(obj.getName());
            out.println(obj.getCompanyName());
            out.println(obj.getMovingAngle());
            out.println(obj.getOwnerName());
            out.println();
        }
    }

    @Override
    public BMX DeSerialize(String path) throws IOException {
        BMX bmx = new BMX();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            line = br.readLine();
            bmx.setName(line);

            line = br.readLine();
            bmx.setCompanyName(line);

            line = br.readLine();
            bmx.setMovingAngle(Integer.parseInt(line));

            line = br.readLine();
            bmx.setOwnerName(line);
        }
        return bmx;
    }
}
