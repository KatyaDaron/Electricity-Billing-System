package Electricity;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class About extends JFrame implements ActionListener {
    String s;

    public About() {

        JButton b1 = new JButton("Exit");
        add(b1);
        b1.setBounds(180, 430, 120, 20);
        b1.addActionListener(this);

        s = """

                Electricity Billing System is a software-based
                application developed in Java programming
                language.
                The goal of the project is to help the electric
                department by computerizing the billing
                system. It mainly focuses on the calculation of
                units consumed during the specified time and
                the money owed to electricity offices.
                This computerized system will make the
                overall billing system easy, accessible,
                comfortable and effective for consumers.

                """;

        TextArea t1 = new TextArea(s, 10, 40, Scrollbar.VERTICAL);
        t1.setEditable(false);
        t1.setBounds(20, 100, 380, 300);
        add(t1);
        Font f1 = new Font(Font.DIALOG, Font.PLAIN, 16);
        t1.setFont(f1);

        Container contentPane = this.getContentPane();
        t1 = new TextArea();

        JLabel l1 = new JLabel("About Project");
        add(l1);
        l1.setBounds(170, 10, 180, 80);
        l1.setForeground(Color.red);

        Font f2 = new Font(Font.DIALOG, Font.BOLD, 20);
        l1.setFont(f2);

        setBounds(700, 220, 450, 550);
        setLayout(null);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        dispose();
    }

    public static void main(String[] args) {
        new About();
    }
}
