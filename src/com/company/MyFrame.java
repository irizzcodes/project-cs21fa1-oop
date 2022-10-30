package com.company;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JComponent implements ActionListener {

    //Returns Int of dimension calculation
    public int getDimen(int val, double percentage) {
        return (int) Math.round(val * percentage);
    }
    int heightMain = 800;
    int widthMain = 650;

    JTextField fNameTextField, lNameTextField, yrLvlTextField, ageTextField, gendTextField, progTextField;



     MyFrame(){
        // set containers
        JPanel mainPanel = new JPanel();
        mainPanel.setBorder(BorderFactory.createLineBorder(Color.black));
        mainPanel.setBackground(new Color(54, 54, 94));
        mainPanel.setBounds(15,15,widthMain,heightMain);
        // set second container
         JPanel secondPanel = new JPanel();
         secondPanel.setBackground(new Color(224, 202, 88));
         // set third container "title of program"
         JPanel titlePanel = new JPanel();
         titlePanel.setBorder(BorderFactory.createLineBorder(Color.black));
         titlePanel.setBackground(new Color(224, 202, 88));
         titlePanel.setSize(400,35);
         titlePanel.setLocation(140, 50);

         int aContWidth = (int) Math.round(widthMain * .84);
         int aContHeight = (int) Math.round(heightMain * .15);
         // set Academic container
         JPanel academicPanel = new JPanel(null);
         academicPanel.setBorder(BorderFactory.createLineBorder(Color.black));
         academicPanel.setBackground(new Color(111, 141, 179));
         academicPanel.setSize(aContWidth, aContHeight);
         academicPanel.setLocation(80,140);



            //Academic Container Attributes
            // ================================
            // Editable Text
            JTextField fNameTextField = new JTextField();
            JTextField lNameTextField = new JTextField();
            JTextField yrLvlTextField = new JTextField();
            JTextField ageTextField = new JTextField();

            String[] genderSelect = {"Male", "Female", "Other"};
            JComboBox gendCombo = new JComboBox(genderSelect);

            String[] progSelect = {"Computer Science", "IT" , "Information Systems", "Farm Management", "Architecture",
            "Construction", "Multimedia", "Arts", "Industrial Design", "Adult Education", "Dentistry", "Health Studies",
            "Philosophy"};
            JComboBox progCombo = new JComboBox(progSelect);

            //Static Text
            JLabel fNameLabel = new JLabel();
            JLabel lNameLabel = new JLabel();
            JLabel yrLvlLabel = new JLabel();
            JLabel ageLabel = new JLabel();
            JLabel gendLabel = new JLabel();
            JLabel progLabel = new JLabel();




            int acTxtHeight = getDimen(aContHeight, .20);
            int acTxtWidth = getDimen(aContWidth,.30);

            //Text Field Manager
            fNameTextField.setPreferredSize(new Dimension(20, 20));
            fNameTextField.setFont(new Font("Consolas", Font.PLAIN, 15));
            fNameTextField.setBounds(acTxtWidth - 50, 10, acTxtWidth, acTxtHeight);

            lNameTextField.setPreferredSize(new Dimension(20, 20));
            lNameTextField.setFont(new Font("Consolas", Font.PLAIN, 15));
            lNameTextField.setBounds(acTxtWidth - 50, acTxtHeight + 20, acTxtWidth, acTxtHeight);

            yrLvlTextField.setPreferredSize(new Dimension(20, 20));
            yrLvlTextField.setFont(new Font("Consolas", Font.PLAIN, 15));
            yrLvlTextField.setBounds(acTxtWidth - 50, acTxtHeight + 55, acTxtWidth, acTxtHeight);

            ageTextField.setPreferredSize(new Dimension(20, 20));
            ageTextField.setFont(new Font("Consolas", Font.PLAIN, 15));
            ageTextField.setBounds((acTxtWidth * 2) + 40, 10, acTxtWidth, acTxtHeight);


            gendCombo.setPreferredSize(new Dimension(20, 20));
            gendCombo.setFont(new Font("Consolas", Font.PLAIN, 15));
            gendCombo.setBounds((acTxtWidth * 2) + 40, acTxtHeight + 20, acTxtWidth, acTxtHeight);
            gendCombo.setEditable(true);

            progCombo.setPreferredSize(new Dimension(20, 20));
            progCombo.setFont(new Font("Consolas", Font.PLAIN, 15));
            progCombo.setBounds((acTxtWidth * 2) + 40, acTxtHeight + 55, acTxtWidth, acTxtHeight);
            progCombo.setEditable(true);


            //Label Manager
            fNameLabel.setPreferredSize(new Dimension(20, 20));
            fNameLabel.setText("First Name: ");
            fNameLabel.setForeground(Color.WHITE);
            fNameLabel.setFont(new Font("Consolas", Font.BOLD, 15));
            fNameLabel.setBounds(20, 10, acTxtWidth, acTxtHeight);

            lNameLabel.setPreferredSize(new Dimension(20, 20));
            lNameLabel.setText("Last Name: ");
            lNameLabel.setForeground(Color.WHITE);
            lNameLabel.setFont(new Font("Consolas", Font.BOLD, 15));
            lNameLabel.setBounds(20, acTxtHeight + 20, acTxtWidth, acTxtHeight);

            yrLvlLabel.setPreferredSize(new Dimension(20, 20));
            yrLvlLabel.setText("Year Level: ");
            yrLvlLabel.setForeground(Color.WHITE);
            yrLvlLabel.setFont(new Font("Consolas", Font.BOLD, 15));
            yrLvlLabel.setBounds(20, acTxtHeight + 55, acTxtWidth, acTxtHeight);

            ageLabel.setPreferredSize(new Dimension(20, 20));
            ageLabel.setFont(new Font("Consolas", Font.BOLD, 15));
            ageLabel.setText("Age: ");
            ageLabel.setForeground(Color.WHITE);
            ageLabel.setBounds(acTxtWidth * 2, 10, acTxtWidth, acTxtHeight);

            gendLabel.setPreferredSize(new Dimension(20, 20));
            gendLabel.setFont(new Font("Consolas", Font.BOLD, 15));
            gendLabel.setText("Gender: ");
            gendLabel.setForeground(Color.WHITE);
            gendLabel.setBounds((acTxtWidth * 2) - 20, acTxtHeight + 20, acTxtWidth, acTxtHeight);

            progLabel.setPreferredSize(new Dimension(20, 20));
            progLabel.setFont(new Font("Consolas", Font.BOLD, 15));
            progLabel.setText("Program: ");
            progLabel.setForeground(Color.WHITE);
            progLabel.setBounds((acTxtWidth * 2) - 25, acTxtHeight + 55, acTxtWidth, acTxtHeight);

            //ADD COMPONENTS
            // ================================
            academicPanel.add(fNameTextField);
            academicPanel.add(lNameTextField);
            academicPanel.add(yrLvlTextField);
            academicPanel.add(ageTextField);
            academicPanel.add(gendCombo);
            academicPanel.add(progCombo);

            academicPanel.add(fNameLabel);
            academicPanel.add(lNameLabel);
            academicPanel.add(yrLvlLabel);
            academicPanel.add(ageLabel);
            academicPanel.add(gendLabel);
            academicPanel.add(progLabel);



         // set Personal container

         int pContHeight = getDimen(heightMain, .15);
         int pContWidth = getDimen(widthMain, .84);

         int pTxtHeight = getDimen(pContHeight, .20);
         int pTxtWidth = getDimen(pContWidth, .24);


         JPanel personalPanel = new JPanel(null);
         personalPanel.setBorder(BorderFactory.createLineBorder(Color.black));
         personalPanel.setBackground(new Color(111, 141, 179));
         personalPanel.setSize(pContWidth,pContHeight);
         personalPanel.setLocation(80, 300);

            //Personal Container Attributes

            JLabel contInfoLabel = new JLabel();
            JLabel birthLabel = new JLabel();
            JLabel adrsLabel = new JLabel();
            JLabel mommyLabel = new JLabel();
            JLabel motherNumLabel = new JLabel();

            JTextField contInfoText = new JTextField();
            JTextField birthText = new JTextField();
            JTextField adrsText = new JTextField();
            JTextField mommyText = new JTextField();
            JTextField  motherNumText = new JTextField();

            //TEXT FIELD

            birthText.setPreferredSize(new Dimension(20, 20));
            birthText.setFont(new Font("Consolas", Font.PLAIN, 15));
            birthText.setBounds(pTxtWidth + 20, 10, pTxtWidth, pTxtHeight);

            adrsText.setPreferredSize(new Dimension(20, 20));
            adrsText.setFont(new Font("Consolas", Font.PLAIN, 15));
            adrsText.setBounds(pTxtWidth + 20, pTxtHeight + 20, pTxtWidth, pTxtHeight);

            contInfoText.setPreferredSize(new Dimension(20, 20));
            contInfoText.setFont(new Font("Consolas", Font.PLAIN, 15));
            contInfoText.setBounds(pTxtWidth + 20, pTxtHeight + 55, pTxtWidth, pTxtHeight);

            mommyText.setPreferredSize(new Dimension(20, 20));
            mommyText.setFont(new Font("Consolas", Font.PLAIN, 15));
            mommyText.setBounds((pTxtWidth * 2) + 150, 10, pTxtWidth, pTxtHeight);

            motherNumText.setPreferredSize(new Dimension(20, 20));
            motherNumText.setFont(new Font("Consolas", Font.PLAIN, 15));
            motherNumText.setBounds((pTxtWidth * 2) + 150, pTxtHeight + 20, pTxtWidth, pTxtHeight);

            //JLABEL

            birthLabel.setPreferredSize(new Dimension(20, 20));
            birthLabel.setFont(new Font("Consolas", Font.BOLD, 15));
            birthLabel.setText("Birth Day: ");
            birthLabel.setForeground(Color.WHITE);
            birthLabel.setBounds(60, 10, acTxtWidth, acTxtHeight);

            adrsLabel.setPreferredSize(new Dimension(20, 20));
            adrsLabel.setFont(new Font("Consolas", Font.BOLD, 15));
            adrsLabel.setText("Current Address: ");
            adrsLabel.setForeground(Color.WHITE);
            adrsLabel.setBounds(20, pTxtHeight + 20, acTxtWidth, acTxtHeight);

            contInfoLabel.setPreferredSize(new Dimension(20, 20));
            contInfoLabel.setFont(new Font("Consolas", Font.BOLD, 15));
            contInfoLabel.setText("Contact Info: ");
            contInfoLabel.setForeground(Color.WHITE);
            contInfoLabel.setBounds(40, pTxtHeight + 55, acTxtWidth, acTxtHeight);

            mommyLabel.setPreferredSize(new Dimension(20, 20));
            mommyLabel.setFont(new Font("Consolas", Font.BOLD, 15));
            mommyLabel.setText("Mothers Name: ");
            mommyLabel.setForeground(Color.WHITE);
            mommyLabel.setBounds((pTxtWidth * 2) + 47, 10, acTxtWidth, acTxtHeight);

            motherNumLabel.setPreferredSize(new Dimension(20, 20));
            motherNumLabel.setFont(new Font("Consolas", Font.BOLD, 15));
            motherNumLabel.setText("Mothers Number: ");
            motherNumLabel.setForeground(Color.WHITE);
            motherNumLabel.setBounds((pTxtWidth * 2) + 30, pTxtHeight + 20, acTxtWidth, acTxtHeight);

                //ADD COMPONENTS
            // ================================

            personalPanel.add(birthText);
            personalPanel.add(adrsText);
            personalPanel.add(contInfoText);
            personalPanel.add(mommyText);
            personalPanel.add(motherNumText);

            personalPanel.add(contInfoLabel);
            personalPanel.add(adrsLabel);
            personalPanel.add(birthLabel);
            personalPanel.add(mommyLabel);
            personalPanel.add(motherNumLabel);



         // TABLE ATTR
         //=====================================================================================

         class ScrollableJTable extends  JPanel {
             public ScrollableJTable() {
                 initializeUI();
             }

             private void initializeUI() {
                 //DefaultTableModel tableModel = new DefaultTableModel();

                 String[] columnName = {"First Name", "Last Name", "Year Level", "Age", "Gender", "Test-VALUE", "Test-VALUE", "Test-VALUE", "Test-VALUE"};

                 //DATA BASE HERE MAYBE
                 Object[][] data = {
                         {"Kathy", "Smith",
                                 "Snowboarding", Integer.valueOf(5), false, false, false, false, false},
                         {"John", "Doe",
                                 "Rowing", Integer.valueOf(3), true, false, false, false, false},
                         {"Sue", "Black",
                                 "Knitting", Integer.valueOf(2), false, false, false, false, false},
                         {"Jane", "White",
                                 "Speed reading", Integer.valueOf(20), true, false, false, false, false},
                         {"Joe", "Brown",
                                 "Pool", Integer.valueOf(10),false, false, false, false, false}

                 };

                 setLayout(new BorderLayout());
                 setPreferredSize(new Dimension(470, 180));

                 JTable table = new JTable(data, columnName );



                 // Turn off JTable's auto resize so that JScrollPane will show a horizontal
                 // scroll bar.
                 table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

                /* tableModel.addColumn("First Name");
                 tableModel.addColumn("Last Name");
                 tableModel.addColumn("Year Level");
                 tableModel.addColumn("Age");
                 tableModel.addColumn("Gender");
                 tableModel.addColumn("Program");*/


                 JScrollPane pane = new JScrollPane(table);
                 add(pane, BorderLayout.CENTER);


                 // ACTION LISTENER FOR CLICK CLICK
                 table.addMouseListener(new java.awt.event.MouseAdapter(){
                     @Override
                     public void mouseClicked(java.awt.event.MouseEvent evt) {
                         int row = table.rowAtPoint(evt.getPoint());
                         int col = table.columnAtPoint(evt.getPoint());
                         if (row >= 0 && col >= 0) {

                                // GET POSITION HERE FOR TABLE
                                // HERES A REFERENCE https://stackoverflow.com/questions/21158083/how-to-set-the-value-of-specific-cell-in-jtable
                         }
                     }
                 });
             }
         }


         // set Database container
         JPanel dataPanel = new ScrollableJTable();
         dataPanel.setBackground(new Color(224, 202, 88));
         dataPanel.setSize(470,180);
         dataPanel.setLocation(105,450);



         //========================================================================================
         // initialize JLabel
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


                //SEARCH BOX TEXT FIELD

         JTextField searchText = new JTextField();
         searchText.setFont(new Font("Bebas Neue",Font.PLAIN,15));
         searchText.setForeground(Color.WHITE);
         searchText.setBounds(170,410,150,size.height);
         mainPanel.add(searchText);



         // initialize JCheckbox
         JCheckBox btnStudentCheck, btnEmployeeCheck;
         // set student JCheckbox
         btnStudentCheck = new JCheckBox();
         btnStudentCheck.setSelected(false);
         btnStudentCheck.setBounds(415,417,15,10);
         mainPanel.add(btnStudentCheck);
         // set employee JCheckbox
         btnEmployeeCheck = new JCheckBox();
         btnEmployeeCheck.setSelected(false);
         btnEmployeeCheck.setBounds(530,417,15,10);
         mainPanel.add(btnEmployeeCheck);

         // initialize Buttons
         Button btnLoad, btnSave, btnDelete, btnReset;
         // set Load Button
         btnLoad = new Button("Load");
         btnLoad.setFont(new Font("Bebas Neue",Font.PLAIN,14));
         btnLoad.setBounds(80,630,110,30);
         btnLoad.setBackground(new Color(224, 202, 88));
         mainPanel.add(btnLoad);
         // set Save Button
         btnSave = new Button("Save");
         btnSave.setFont(new Font("Bebas Neue",Font.PLAIN,14));
         btnSave.setBounds(207,630,110,30);
         btnSave.setBackground(new Color(224, 202, 88));
         mainPanel.add(btnSave);
         // set Delete Button
         btnDelete = new Button("Delete");
         btnDelete.setFont(new Font("Bebas Neue",Font.PLAIN,14));
         btnDelete.setBounds(334,630,110,30);
         btnDelete.setBackground(new Color(224, 202, 88));
         mainPanel.add(btnDelete);
         // set Reset Button
         btnReset = new Button("Reset");
         btnReset.setFont(new Font("Bebas Neue",Font.PLAIN,14));
         btnReset.setBounds(460,630,110,30);
         btnReset.setBackground(new Color(224, 202, 88));
         mainPanel.add(btnReset);


         //======================================================================================
        // main frame
        JFrame frame = new JFrame();
        frame.setTitle("TIP Database");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(700,875);
        frame.add(dataPanel);
        frame.add(personalPanel);
        frame.add(academicPanel);
        frame.add(titlePanel);
        frame.add(mainPanel);
        frame.add(secondPanel);
        frame.setVisible(true);


        //Action Listeners
         fNameTextField.addActionListener( this);


    }


    //Put all Logic Here
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        String pass1 = fNameTextField.getText();
        // Look at this link https://www.javatpoint.com/java-actionlistener
        // NOTE !!!!!!!!!!!!!!!!!

        if(e.getSource() != fNameTextField) {

        }
        else {
        }



    }

}

