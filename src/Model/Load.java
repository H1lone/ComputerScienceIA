package Model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Load {
    /**
     * Method for load data
     * @return
     */
    public static int lastID(){
        try{
            BufferedReader reader = new BufferedReader(new FileReader("database.txt"));
            String line = reader.readLine();
            if(line != null){
                String last = "";
                while(line != null){
                    last = line;
                    line = reader.readLine();
                }
                List<String> lastStr = Arrays.asList(last.split(", "));
                return Integer.parseInt(lastStr.get(0));
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        return -1; //return -1 when the database is empty
    }
}
