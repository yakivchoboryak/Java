package Interfaces;

import Classes.BMX;

import java.io.IOException;

public interface ISerializble {
    void Serialize(BMX obj, String path) throws IOException;
    BMX DeSerialize(String path) throws IOException;
}
