package View;

import com.sun.tools.javac.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
    }
}
