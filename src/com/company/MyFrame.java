package com.company;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    MyFrame(){
        this.setTitle("TIP Agents");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(700,875);
        this.setVisible(true);
        this.getContentPane().setBackground(new Color(219, 201, 110));


        // set containers
        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(new Color(40, 39, 79));
    }


}

