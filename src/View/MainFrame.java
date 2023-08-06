package View;

import Model.Profile;
import com.sun.tools.javac.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainFrame {
    private static JFrame frame;
    private static Cards cards;
    private static Profile profile;

    public static void main(String[] args){
        EventQueue.invokeLater(new Runnable() {
            public void run() { initialize(); }
        });
    }
    public MainFrame(){
        initialize();
    }

    public static void initialize(){
        cards = new Cards();
        frame = new JFrame();
        frame.getContentPane().add(cards); //
        frame.setBounds(100, 100, 500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e){
                e.getWindow().dispose();
            }
        }); //
        frame.setVisible(true); //
    }

    public static JFrame getFrame() {
        return frame;
    }

    public static Cards getCards() {
        return cards;
    }

}
