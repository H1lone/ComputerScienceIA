package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUpUI extends JPanel {
    private JPanel signUpJPanel;
    private JLabel signUpLabel;
    private JButton signUpButton;
    private JLabel passwordLabel;
    private JLabel emailLabel;
    private JTextField emailTextfiled;
    private JPasswordField passwordPasswordField;

    public SignUpUI(){
        add(signUpJPanel);
        signUpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Cards cards = MainFrame.getCards();
                CardLayout layout = (CardLayout) cards.getLayout();
                layout.show(cards, Cards.MAINPAGE_UI_ID);
            }
        });


    }
}
