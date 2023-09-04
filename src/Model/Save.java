package Model;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/**Task
 * Complete userData method
 * documentation for saveData (save class) and lastID (load class) 완
 * review all the methods from save and load class
 * Make all UI page
 */
public class Save {
    /**
     * Method for saving data
     */
    public static void saveSignUpData(String email, String password) throws IOException {
        FileWriter newFile = new FileWriter("database.txt", StandardCharsets.UTF_8, true);
        int newId;
        if (Load.lastID()==1){
            newId = 0;
        }
        else{
            newId = Load.lastID()+1;
        }

        newFile.write(""+newId+", "+email+", "+password);
        newFile.write("\n");
        newFile.close();
    }

    public static void saveProfile(String email, String accountName, String dob, String subjects) throws IOException {
        FileWriter newFile = new FileWriter("database.txt", StandardCharsets.UTF_8, true);
        newFile.write(""+email+", "+ accountName+", "+dob+", "+ subjects);
        newFile.close();
    }

    /*
    * Create a method that stores the assignment
    * */


    public static void saveAssignmentsData(String title, String subject, String description, String dueDate) throws IOException {
        ArrayList<String> information = new ArrayList<String>();
        information.add(title);
        information.add(subject);
        information.add(description);
        information.add(dueDate);
        FileWriter newFile = new FileWriter("database.txt", StandardCharsets.UTF_8, true);
        newFile.write(""+information);
        newFile.close();
    }
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
