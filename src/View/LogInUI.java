package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LogInUI extends JPanel {
    private JLabel logInLabel;
    private JPanel logInJPanel;
    private JButton logInButton;
    private JTextField emailTextField;
    private JPasswordField passwordPasswordField;

    public LogInUI(){
        add(logInJPanel);
        logInButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Cards cards = MainFrame.getCards();
                CardLayout layout = (CardLayout) cards.getLayout();
                layout.show(cards, Cards.MAINPAGE_UI_ID);
            }
        });
    }
}