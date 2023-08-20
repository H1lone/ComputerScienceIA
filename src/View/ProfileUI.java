package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;

public class ProfileUI extends JPanel {
    private JPanel profileJPanel;
    private JLabel profileLabel;
    private JTextField emailTextField;
    private JTextField accountNameTextField;
    private JTextField subjectTextField;
    private JTextField assignmentTextField;
    private JTextField DateOfBirthTextField;
    private JLabel emailLabel;
    private JLabel accountNameLabel;
    private JLabel dateOfBirthLabel;
    private JLabel subjectLabel;
    private JLabel assignmentLabel;
    private JButton saveButton;
    private JButton exitButton;

    public ProfileUI() {
        add(profileJPanel);
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Cards cards = MainFrame.getCards();
                CardLayout layout = (CardLayout) cards.getLayout();
                layout.show(cards, Cards.MAINPAGE_UI_ID);
            }
        });
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Cards cards = MainFrame.getCards();
                CardLayout layout = (CardLayout) cards.getLayout();
                layout.show(cards, Cards.MAINPAGE_UI_ID);
            }
        });
    }
}