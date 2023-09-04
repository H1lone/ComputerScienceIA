package View;

import Model.Load;
import com.sun.tools.javac.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Objects;

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
                if (!email.isEmpty() && !password.isEmpty() && (Objects.equals(Load.findEmail(email), "Not found"))){
                    try {
                        saveSignUpData(email,password);
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    Cards cards = MainFrame.getCards();
                    CardLayout layout = (CardLayout) cards.getLayout();
                    layout.show(cards, Cards.MAINPAGE_UI_ID);
                }
                else if (email.isEmpty() && !password.isEmpty()){
                    emailLabel.setText("Write a valid Email");
                }
                else if (password.isEmpty() && !email.isEmpty()){
                    passwordLabel.setText("Write a valid Password");
                }
                else if (password.isEmpty() && email.isEmpty()){
                    emailLabel.setText("Write a valid Email");
                    passwordLabel.setText("Write a valid Password");
                }
                else{
                    emailLabel.setText("This email is taken. Please Use different email");
                }
                // message pop up
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
