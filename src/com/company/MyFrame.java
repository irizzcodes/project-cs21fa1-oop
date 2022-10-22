package com.company;

import javax.swing.*;
import java.awt.*;

public class MyFrame {

     MyFrame(){
        // set containers
        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(new Color(224, 202, 88));
        // set second container
         JPanel secondPanel = new JPanel();
         secondPanel.setBackground(new Color(54, 54, 94));
         mainPanel.setBounds(30,35,625,765);



        // main frame
        JFrame frame = new JFrame();
        frame.setTitle("TIP Agents");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(700,875);
        frame.setVisible(true);
        frame.getContentPane().setBackground(new Color(224, 202, 88));
        frame.add(mainPanel);
        frame.add(secondPanel);



    }

}

