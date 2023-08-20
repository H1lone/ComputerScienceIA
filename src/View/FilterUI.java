package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FilterUI extends JPanel{
    private JPanel filterJPanel;
    private JLabel filterLabel;
    private JCheckBox overdueCheckBox;
    private JCheckBox todayCheckBox;
    private JCheckBox thisWeekCheckBox;
    private JCheckBox subject1CheckBox;
    private JCheckBox subject2CheckBox;
    private JCheckBox subject3CheckBox;
    private JCheckBox subject4CheckBox;
    private JCheckBox subject5CheckBox;
    private JCheckBox subject6CheckBox;
    private JCheckBox doneCheckBox;
    private JCheckBox undoneCheckBox;
    private JLabel dueDateLabel;
    private JLabel subjectLabel;
    private JLabel progressLabel;
    private JButton applyButton;
    private JButton cancelButton;

    public FilterUI(){
        add(filterJPanel);
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Cards cards = MainFrame.getCards();
                CardLayout layout = (CardLayout) cards.getLayout();
                layout.show(cards, Cards.MAINPAGE_UI_ID);
            }
        });
        applyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Cards cards = MainFrame.getCards();
                CardLayout layout = (CardLayout) cards.getLayout();
                layout.show(cards, Cards.HomeworkTimeTable_UI_ID);
            }
        });
    }
}
