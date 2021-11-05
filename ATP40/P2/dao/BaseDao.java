package P2.dao;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class BaseDao<T> implements IDao<T>{
    public String filename;

    public BaseDao(String filename){
        this.filename = filename; 
    }

    public void save(Object model) {
        try {
            FileWriter fw = new FileWriter(filename, true);
            fw.write(model.toString());
            fw.write("\n");
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Object> list() {
        return null;
    }     
}
