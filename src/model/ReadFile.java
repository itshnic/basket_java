package model;

import java.io.*;
import java.util.ArrayList;

public class ReadFile {
    String path;
    String fileName;

    public ReadFile(String path, String fileName) {
        this.path = path;
        this.fileName = fileName;
    }
    public String[] fileToArray() {
        try (BufferedReader fr = new BufferedReader(new FileReader(this.path + this.fileName))) {
            return fr.readLine().split(" ");
        } catch (IOException e) {
            throw new RuntimeException("Нет файла или он не читается");
        }
    }
}
