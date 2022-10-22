package com.company;

import javax.swing.*;
import java.awt.*;

public class MyFrame {

     MyFrame(){
        // set containers
        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(new Color(54, 54, 94));
        mainPanel.setBounds(15,15,650,800);

        // set second container
         JPanel secondPanel = new JPanel();
         secondPanel.setBackground(new Color(224, 202, 88));
         // set third container "title of program"
         JPanel titlePanel = new JPanel();
         titlePanel.setBackground(new Color(224, 202, 88));
         titlePanel.setSize(400,35);
         titlePanel.setLocation(140, 50);



        // main frame
        JFrame frame = new JFrame();
        frame.setTitle("TIP Agents");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(700,875);
        frame.setVisible(true);
        frame.add(titlePanel);
        frame.add(mainPanel);
        frame.add(secondPanel);




    }

}

