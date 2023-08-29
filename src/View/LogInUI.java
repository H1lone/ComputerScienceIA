package View;

import Model.Load;

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
    private JButton signUpButton;
    private JLabel donTHaveAccountLabel;

    public LogInUI(){
        add(logInJPanel);
        logInButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(Load.findEmail(emailTextField.getText())){
                    logInLabel.setText("found");
                }
                Cards cards = MainFrame.getCards();
                CardLayout layout = (CardLayout) cards.getLayout();
                layout.show(cards, Cards.MAINPAGE_UI_ID);
            }
        });
        signUpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Cards cards = MainFrame.getCards();
                CardLayout layout = (CardLayout) cards.getLayout();
                layout.show(cards, Cards.SIGNUP_UI_ID);
            }
        });
    }

}
