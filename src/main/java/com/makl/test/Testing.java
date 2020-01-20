package com.makl.test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class Testing implements ActionListener {
    private JTextField jtxt;
    private JButton jbtn;
    private JFrame jf;

    public Testing() {
        jf = new JFrame("Test");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(300, 200);
        jf.setLayout(null);

        jtxt = new JTextField();
        jtxt.setBounds(10, 10, 200, 30);
        jf.add(jtxt);

        jbtn = new JButton("Test");
        jbtn.setBounds(10, 50, 200, 30);
        jf.add(jbtn);
        jbtn.addActionListener(this);

        jf.setVisible(true);
    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number");
//        int i = sc.nextInt();
//        System.out.println("Entered Number is : " + i);
        Testing t = new Testing();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == jbtn) {
            JOptionPane.showMessageDialog(jf, "Enter text is : " + jtxt.getText());
        }
    }
}
