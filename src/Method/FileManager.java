package Method;

import Entities.DanhBa;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileManager {
    private final String PATH = "contacts.csv";
    File file;
    FileWriter writer;

    {
        try {
            writer = new FileWriter(PATH);
            ArrayList<DanhBa> danhBa = new ArrayList<>();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
