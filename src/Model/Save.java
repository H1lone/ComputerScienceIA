package Model;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**Task
 * Complete userData method 완
 * documentation for saveData (save class) and lastID (load class) 완
 * review all the methods from save and load class
 * Make all UI page
 */
public class Save {
    /**
     * Method for saving data
     * @param profile
     */
    public void SaveData(Profile profile){
        int lastID = Load.lastID();
        if(lastID == -1){
            try {
                FileWriter newFile = new FileWriter("database.txt", StandardCharsets.UTF_8, true);
                newFile.write("0, "+convertProfileToStr(profile));
                newFile.close();
            } catch(IOException e){
                e.printStackTrace();
        }

        }else{
            try {
                FileWriter newFile = new FileWriter("database.txt", StandardCharsets.UTF_8, true);
                newFile.write("\n");
                newFile.write(lastID +1+", "+convertProfileToStr(profile));
                newFile.close();
            } catch(IOException e){
                e.printStackTrace();
            }
        }
    }

    /**
     * A method that converts profile objects to String
     * @param profile user profile
     * @return userData
     */
    public String convertProfileToStr(Profile profile){
        return profile.getEmail()+","+profile.getPassword()+","+profile.getAccountName()
                +","+profile.getProfileImage()+","+profile.getSubjects()+","+profile.getDateOfBirth()
                +","+profile.getAssignment();
    }
}
