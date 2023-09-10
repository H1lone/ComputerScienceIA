package Model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Load {
    /**
     * Method for load data
     * @return
     */
    public static int lastID(){
        try{
            BufferedReader reader = new BufferedReader(new FileReader("database.txt"));
            String line = reader.readLine(); //read the first line of the database
            if(line != null){
                String last = "";
                while(line != null){
                    last = line;
                    line = reader.readLine(); //read the next line
                }
                List<String> lastStr = Arrays.asList(last.split(", "));
                return Integer.parseInt(lastStr.get(0));
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        return 0; //return -1 when the database is empty
    }
    public static String findEmail(String email){
        try{
            BufferedReader reader = new BufferedReader(new FileReader("database.txt"));
            String line = reader.readLine(); //read the first line of the database
            if(line != null){
                String last = "";
                while(line != null){
                    last = line;
                    List<String> lastStr = Arrays.asList(last.split(", "));
                    if(Objects.equals(lastStr.get(1), email)){
                        return lastStr.get(2);
                    }
                    line = reader.readLine(); //read the next line
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        return "Not found";
    }
}
