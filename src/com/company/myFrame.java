package com.company;

import javax.swing.*;
import java.awt.*;

public class myFrame extends JFrame {

    myFrame(){
        this.setTitle("TIP Agents");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(1000,1250);
        this.setVisible(true);
        this.getContentPane().setBackground(new Color(40, 39, 79));
    }
}
