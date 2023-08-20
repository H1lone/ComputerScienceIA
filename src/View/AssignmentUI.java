package View;

import com.sun.tools.javac.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

import static Model.Save.saveAssignmentsData;

public class AssignmentUI extends JPanel {
    private JTextField titleTextField;
    private JTextField subjectTextField;
    private JTextField dueDateTextField;
    private JTextArea descriptionTextArea;
    private JButton cancelButton;
    private JButton addButton;
    private JLabel assignmentLabel;
    private JLabel titleLable;
    private JLabel descriptionLabel;
    private JLabel subjectLabel;
    private JLabel dueDateLabel;
    private JPanel assignmentJPanel;

    public AssignmentUI(){
        add(assignmentJPanel);
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Cards cards = MainFrame.getCards();
                CardLayout layout = (CardLayout) cards.getLayout();
                layout.show(cards, Cards.MAINPAGE_UI_ID);
            }
        });
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String title = titleTextField.getText();
                String description = descriptionTextArea.getText();
                String dueDate = dueDateTextField.getText();
                String subject = subjectTextField.getText();


                try {
                    saveAssignmentsData(title, subject, description, dueDate);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }

                Cards cards = MainFrame.getCards();
                CardLayout layout = (CardLayout) cards.getLayout();
                layout.show(cards, Cards.HomeworkTimeTable_UI_ID);
            }
        });
    }
}
