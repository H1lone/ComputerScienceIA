package View;

import com.sun.tools.javac.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import static Model.Save.saveSignUpData;

public class SignUpUI extends JPanel {
    private JPanel signUpJPanel;
    private JLabel signUpLabel;
    private JButton signUpButton;
    private JLabel passwordLabel;
    private JLabel emailLabel;
    private JTextField emailTextfield;
    private JTextField passwordTextField;
    private JButton logInButton;
    private JPasswordField passwordPasswordField;

    public SignUpUI(){
        add(signUpJPanel);
        signUpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String email = emailTextfield.getText();
                String password = passwordTextField.getText();
                try {
                    saveSignUpData(email,password);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
                Cards cards = MainFrame.getCards();
                CardLayout layout = (CardLayout) cards.getLayout();
                layout.show(cards, Cards.MAINPAGE_UI_ID);
            }
        });
        logInButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Cards cards = MainFrame.getCards();
                CardLayout layout = (CardLayout) cards.getLayout();
                layout.show(cards, Cards.LOGIN_UI_ID);
            }
        });

    }
}
