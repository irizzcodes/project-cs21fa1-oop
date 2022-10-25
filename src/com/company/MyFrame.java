package com.company;

import javax.swing.*;
import java.awt.*;

public class MyFrame {

     MyFrame(){
        // set containers
        JPanel mainPanel = new JPanel();
        mainPanel.setBorder(BorderFactory.createLineBorder(Color.black));
        mainPanel.setBackground(new Color(54, 54, 94));
        mainPanel.setBounds(15,15,650,800);
        // set second container
         JPanel secondPanel = new JPanel();
         secondPanel.setBackground(new Color(224, 202, 88));
         // set third container "title of program"
         JPanel titlePanel = new JPanel();
         titlePanel.setBorder(BorderFactory.createLineBorder(Color.black));
         titlePanel.setBackground(new Color(224, 202, 88));
         titlePanel.setSize(400,35);
         titlePanel.setLocation(140, 50);
         // set Academic container
         JPanel academicPanel = new JPanel();
         academicPanel.setBorder(BorderFactory.createLineBorder(Color.black));
         academicPanel.setBackground(new Color(111, 141, 179));
         academicPanel.setSize(525,120);
         academicPanel.setLocation(80,140);
         // set Personal container
         JPanel personalPanel = new JPanel();
         personalPanel.setBorder(BorderFactory.createLineBorder(Color.black));
         personalPanel.setBackground(new Color(111, 141, 179));
         personalPanel.setSize(525,100);
         personalPanel.setLocation(80,300);
         // set Database container
         JPanel dataPanel = new JPanel();
         dataPanel.setBackground(new Color(224, 202, 88));
         dataPanel.setSize(470,180);
         dataPanel.setLocation(105,450);

         //========================================================================================
         JLabel title, mainAcademic, mainPersonal, mainSearch, mainStudentCheck, mainEmployeeCheck;
         // set titlePanel text
         title = new JLabel("TIP Database");
         title.setFont(new Font("Bebas Neue",Font.PLAIN,20));
         titlePanel.add(title);
         // set mainPanel academic text
         mainAcademic = new JLabel("Academic Member Information");
         mainAcademic.setFont(new Font("Bebas Neue",Font.PLAIN,17));
         mainAcademic.setForeground(Color.WHITE);
         mainPanel.setLayout(null);
         Dimension size = mainAcademic.getPreferredSize();
         mainAcademic.setBounds(70,100,size.width,size.height);
         mainPanel.add(mainAcademic);
         // set mainPanel personal text
         mainPersonal = new JLabel("Personal Information");
         mainPersonal.setFont(new Font("Bebas Neue",Font.PLAIN,17));
         mainPersonal.setForeground(Color.WHITE);
         mainPersonal.setBounds(70,260,size.width,size.height);
         mainPanel.add(mainPersonal);
         // set mainPanel search text
         mainSearch = new JLabel("Search: ");
         mainSearch.setFont(new Font("Bebas Neue",Font.PLAIN,15));
         mainSearch.setForeground(Color.WHITE);
         mainSearch.setBounds(100,410,size.width,size.height);
         mainPanel.add(mainSearch);
         // set mainPanel student check text
         mainStudentCheck = new JLabel("Student");
         mainStudentCheck.setFont(new Font("Bebas Neue",Font.PLAIN,15));
         mainStudentCheck.setForeground(Color.WHITE);
         mainStudentCheck.setBounds(360,410,size.width,size.height);
         mainPanel.add(mainStudentCheck);
         // set mainPanel employee check text
         mainEmployeeCheck = new JLabel("Employee");
         mainEmployeeCheck.setFont(new Font("Bebas Neue",Font.PLAIN,15));
         mainEmployeeCheck.setForeground(Color.WHITE);
         mainEmployeeCheck.setBounds(460,410,size.width,size.height);
         mainPanel.add(mainEmployeeCheck);


         //======================================================================================
        // main frame
        JFrame frame = new JFrame();
        frame.setTitle("TIP Agents");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(700,875);
        frame.setVisible(true);
        frame.add(dataPanel);
        frame.add(personalPanel);
        frame.add(academicPanel);
        frame.add(titlePanel);
        frame.add(mainPanel);
        frame.add(secondPanel);




    }

}

