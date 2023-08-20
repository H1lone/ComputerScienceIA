package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainPageUI extends JPanel {
    private JLabel assignmentLabel;
    private JPanel mainPageJPanel;
    private JButton addAssignmentButton;
    private JTextField addAssignmentTextField4;
    private JTextField addAssignmentTextField3;
    private JTextField addAssignmentTextField;
    private JTextField addAssignmentTextField2;
    private JButton profileButton;
    private JButton homeworkTimetableButton;
    private JButton calendarButton;

    public MainPageUI(){
        add(mainPageJPanel);
        addAssignmentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Cards cards = MainFrame.getCards();
                CardLayout layout = (CardLayout) cards.getLayout();
                layout.show(cards, Cards.ASSIGNMENT_UI_ID);
            }
        });
        homeworkTimetableButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Cards cards = MainFrame.getCards();
                CardLayout layout = (CardLayout) cards.getLayout();
                layout.show(cards, Cards.HomeworkTimeTable_UI_ID);
            }
        });
        profileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Cards cards = MainFrame.getCards();
                CardLayout layout = (CardLayout) cards.getLayout();
                layout.show(cards, Cards.PROFILE_UI_ID);
            }
        });
        calendarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Cards cards = MainFrame.getCards();
                CardLayout layout = (CardLayout) cards.getLayout();
                layout.show(cards, Cards.CALENDAR_UI_ID);
            }
        });
    }

}
