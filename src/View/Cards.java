package View;

import Model.Load;

import javax.swing.*;
import java.awt.*;

public class Cards extends JPanel {
    public static AssignmentUI assignmentUI = new AssignmentUI(); //
    public static SignUpUI signUpUI = new SignUpUI();
    public static LogInUI logInUI = new LogInUI();
    public static MainPageUI mainPageUI = new MainPageUI();
    public static FilterUI filterUI = new FilterUI();
    public static ProfileUI profileUI = new ProfileUI();
    public static CalendarUI calendarUI = new CalendarUI();
    public static HomeworkTimetableUI homeworkTimetableUI = new HomeworkTimetableUI();

    public static final String ASSIGNMENT_UI_ID = "AssignmentUI"; //
    public static final String SIGNUP_UI_ID = "SignUpUI";
    public static final String LOGIN_UI_ID = "LogInUI";
    public static final String MAINPAGE_UI_ID = "MainPageUI";
    public static final String FILTER_UI_ID = "FilterUI";
    public static final String PROFILE_UI_ID = "ProfileUI";
    public static final String CALENDAR_UI_ID = "CalendarUI";
    public static final String HomeworkTimeTable_UI_ID = "HomeworkTimeTableUI";

    public Cards(){ //
        super(new CardLayout());
        add(signUpUI, SIGNUP_UI_ID);
        add(logInUI, LOGIN_UI_ID);
        add(mainPageUI, MAINPAGE_UI_ID);
        add(assignmentUI, ASSIGNMENT_UI_ID);
        add(filterUI, FILTER_UI_ID);
        add(calendarUI, CALENDAR_UI_ID);
        add(profileUI, PROFILE_UI_ID);
        add(homeworkTimetableUI, HomeworkTimeTable_UI_ID);
    }

}
