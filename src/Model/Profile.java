package Model;

import com.sun.source.tree.Tree;

import java.awt.image.BufferedImage;
import java.util.Date;
import java.util.TreeMap;


/**Tasks:
 * make a constructor for editProfile + documentation 완
 * make getter + setter for each attribute + documentation 완
 * make file for each UI page 완
 */


public class Profile {
    private String accountName;
    private String email;
    private String password;
    private BufferedImage profileImage;
    private String subjects;
    private Date dateOfBirth;
    private TreeMap assignment;



    /**
     * constructor for profile class used when the client first signs up
     * @param email user's email
     * @param password user's password
     */
    public Profile(String email, String password){
        this.email = email;
        this.password = password;
    }



    /**
     * constructor for editProfile class used when user tries to edit their profile
     * @param email user's email
     * @param password user's password
     * @param accountName Name of the account
     * @param profileImage Image of the user's profile
     * @param subjects user's subjects
     * @param dateOfBirth user's date of birth
     * @param assignment Assignments set by the user
     */
    public Profile(String email, String password, String accountName, BufferedImage profileImage, String subjects, Date dateOfBirth, TreeMap assignment){
        this.email = email;
        this.password = password;
        this.accountName = accountName;
        this.profileImage = profileImage;
        this.subjects = subjects;
        this.dateOfBirth = dateOfBirth;
        this.assignment = assignment;
    }



    /**getter for email
     * @return user's email
     */
    public String getEmail(){return email;}

    /**
     * getter for password
     * @return user's password
     */
    public String getPassword(){return password;}

    /**
     * getter for accountName
     * @return user's accountName
     */
    public String getAccountName(){return accountName;}

    /**
     * getter for profileImage
     * @return ProfileImage
     */
    public BufferedImage getProfileImage(){return profileImage;}

    /**
     * getter for subjects
     * @return user's subjects
     */
    public String getSubjects(){return subjects;}

    /**
     * getter for dateOfBirth
     * @return user's date of birth
     */
    public Date getDateOfBirth(){return dateOfBirth;}

    /**
     * getter for assignment
     * @return assignment set by the user
     */
    public TreeMap getAssignment(){return assignment;}

    /**setter for email
     * @param email user's email
     */
    public void setEmail(String email){this.email = email;}

    /**
     * setter for Password
     * @param password user's password
     */
    public void setPassword(String password){this.password = password;}

    /**
     * setter for accountName
     * @param accountName user's account name
     */
    public void setAccountName(String accountName){this.accountName = accountName;}

    /**
     * setter for profileImage
     * @param profileImage user's profile image
     */
    public void setProfileImage(BufferedImage profileImage){this.profileImage = profileImage;}

    /**
     * setter for subjects
     * @param subjects user's subjects
     */
    public void setSubjects(String subjects){this.subjects = subjects;}

    /**
     * setter for dateOfBirth
     * @param dateOfBirth user's date of birth
     */
    public void setDateOfBirth(Date dateOfBirth){this.dateOfBirth = dateOfBirth;}

    /**
     * setter for assignment
     * @param assignment assignment set by the user
     */
    public void setAssignment(TreeMap assignment){this.assignment = assignment;}
}
