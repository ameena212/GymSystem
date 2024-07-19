package GUI;

import java.awt.Dimension;
import java.awt.Toolkit;
import Logic.*;
import static Logic.GymSystem.employeeList;
import static Logic.GymSystem.memberList;
import Logic.Trainer.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AddEmp extends javax.swing.JFrame {

    private static int id = 0;

    /**
     * Creates new form AddEmp
     */
    public AddEmp() {

        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        pnTitle = new javax.swing.JPanel();
        jButton15 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        panel1 = new java.awt.Panel();
        jLabel1 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtlname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        f = new javax.swing.JRadioButton();
        m = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        txtSalary = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jDay = new javax.swing.JComboBox<>();
        Jmonth = new javax.swing.JComboBox<>();
        Jyear = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        yes = new javax.swing.JRadioButton();
        no = new javax.swing.JRadioButton();
        jButton3 = new javax.swing.JButton();
        lbl = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(241, 247, 251));
        jPanel1.setMinimumSize(new java.awt.Dimension(950, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(950, 600));

        pnTitle.setBackground(new java.awt.Color(205, 228, 242));
        pnTitle.setPreferredSize(new java.awt.Dimension(950, 110));

        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/BackBtn.png"))); // NOI18N
        jButton15.setBorderPainted(false);
        jButton15.setContentAreaFilled(false);
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(21, 50, 112));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/polytechnic Gym System.png"))); // NOI18N
        jLabel7.setPreferredSize(new java.awt.Dimension(1353, 135));

        javax.swing.GroupLayout pnTitleLayout = new javax.swing.GroupLayout(pnTitle);
        pnTitle.setLayout(pnTitleLayout);
        pnTitleLayout.setHorizontalGroup(
            pnTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton15)
                .addContainerGap())
        );
        pnTitleLayout.setVerticalGroup(
            pnTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTitleLayout.createSequentialGroup()
                .addGroup(pnTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnTitleLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnTitleLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jButton15)))
                .addGap(20, 20, 20))
        );

        panel1.setBackground(new java.awt.Color(205, 228, 242));
        panel1.setPreferredSize(new java.awt.Dimension(900, 400));

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(21, 50, 112));
        jLabel1.setText("First Name:");

        txtname.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        txtname.setForeground(new java.awt.Color(21, 50, 112));

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(21, 50, 112));
        jLabel3.setText("Surname:");

        txtlname.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        txtlname.setForeground(new java.awt.Color(21, 50, 112));

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(21, 50, 112));
        jLabel5.setText("Gender:");

        buttonGroup1.add(f);
        f.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        f.setForeground(new java.awt.Color(21, 50, 112));
        f.setText("Female");
        f.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fActionPerformed(evt);
            }
        });

        buttonGroup1.add(m);
        m.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        m.setForeground(new java.awt.Color(21, 50, 112));
        m.setText("Male");

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(21, 50, 112));
        jLabel6.setText("Salary:");

        txtSalary.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        txtSalary.setForeground(new java.awt.Color(21, 50, 112));

        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(21, 50, 112));
        jLabel8.setText("Date of Birth:");

        jDay.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jDay.setForeground(new java.awt.Color(21, 50, 112));
        jDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        Jmonth.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        Jmonth.setForeground(new java.awt.Color(21, 50, 112));
        Jmonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "January", "February", "March", "April", "May ", "June", "July", "August", "September", "October", "November", "December" }));

        Jyear.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        Jyear.setForeground(new java.awt.Color(21, 50, 112));
        Jyear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008" }));

        jLabel9.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(21, 50, 112));
        jLabel9.setText("Phone number:");

        txtPhone.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        txtPhone.setForeground(new java.awt.Color(21, 50, 112));

        jLabel10.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(21, 50, 112));
        jLabel10.setText("Are you a Personal Trainer:");

        buttonGroup2.add(yes);
        yes.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        yes.setForeground(new java.awt.Color(21, 50, 112));
        yes.setText("Yes");

        buttonGroup2.add(no);
        no.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        no.setForeground(new java.awt.Color(21, 50, 112));
        no.setText("No");

        jButton3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jButton3.setForeground(new java.awt.Color(21, 50, 112));
        jButton3.setText("Register");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        lbl.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        lbl.setForeground(new java.awt.Color(21, 50, 112));
        lbl.setText("Address:");

        txtAddress.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        txtAddress.setForeground(new java.awt.Color(21, 50, 112));
        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(f)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(m))
                            .addComponent(txtname)
                            .addComponent(txtlname)
                            .addComponent(txtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(281, 281, 281)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(jDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Jmonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Jyear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbl)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(yes)
                                .addGap(18, 18, 18)
                                .addComponent(no)))
                        .addGap(68, 68, 68))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(390, 390, 390))))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtlname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(f)
                            .addComponent(m))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Jmonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Jyear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(yes)
                            .addComponent(no))))
                .addGap(30, 30, 30)
                .addComponent(jButton3)
                .addContainerGap())
        );

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(21, 50, 112));
        jLabel4.setText("Add Employee");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(384, 384, 384))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(pnTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void fActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
                                            
    try {
        // get the values from the input fields
        String name = txtname.getText().trim();
        if (name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }

        String Lname = txtlname.getText().trim();
        if (Lname.isEmpty()) {
            throw new IllegalArgumentException("Last name cannot be empty.");
        }

        String gender ;
        if (f.isSelected()) {
            gender = "Female";
        } else if (m.isSelected()) {
            gender = "Male";
        } else {
            throw new IllegalArgumentException("Gender must be selected.");
        }

        double salary = Double.parseDouble(txtSalary.getText());
        if (salary < 0) {
            throw new IllegalArgumentException("Salary cannot be negative.");
        }

        String address;
        try {
            address = txtAddress.getText();
            if (address.length() < 4) {
                JOptionPane.showMessageDialog(null, "Please enter an Address with at least four letters.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
                return; // Stop further execution if an exception occurs
            }
        } catch (NullPointerException e) {
           // Handle the exception when `txtName` is null
            JOptionPane.showMessageDialog(null, "Please enter an Address.", "Missing Input", JOptionPane.ERROR_MESSAGE);
            return; // Stop further execution if an exception occurs
        }

        String Day = (String) jDay.getSelectedItem();
        String month = (String) Jmonth.getSelectedItem();
        String year = (String) Jyear.getSelectedItem();
        String dob = Day + month + year;
        if (Day == "Day" || month == "Month" || year == "Year" || Day.isEmpty() || month.isEmpty() || year.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please select a valid date of birth.", "Missing Input", JOptionPane.ERROR_MESSAGE);
            return; // Stop further execution if an exception occurs
        }
        int phone = 0;
        try {
            phone = Integer.parseInt(txtPhone.getText());
        } catch (NumberFormatException ex) {
            throw new IllegalArgumentException("Phone number must be a valid integer.");
        }

        boolean isPt = false;
        if (yes.isSelected()) {
            isPt = true;

        } else if (no.isSelected()) {
            isPt = false;
        } else {
            throw new IllegalArgumentException("Please select if the employee is a personal trainer or not.");
        }
        Employee emp = null;
        boolean isPersonalTrainer = isPt == true;
        if (isPersonalTrainer) {
         
            emp = new Trainer(name, Lname, address, dob, phone, gender, salary, isPersonalTrainer);

            System.out.println("Trainer added successfully.");
        } else {
            emp = new Employee(name, Lname, address, dob, phone, gender, salary, isPersonalTrainer);

        }

        // create a new Employee object
        // add the Employee object to the employeeList
        GymSystem.employeeList.add(emp);
        System.out.println("Employee added successfully.");

        // Show a message to the user to confirm that the employee was added
        JOptionPane.showMessageDialog(null, "Employee added successfully.\n Your ID is "+emp.getId(), "Success", JOptionPane.INFORMATION_MESSAGE);

        for (Employee Employee : GymSystem.employeeList) {
            System.out.println(Employee.toString());
        }
        txtname.setText("");
        txtlname.setText("");
        txtAddress.setText("");
        txtPhone.setText("");
        txtSalary.setText("");
        jDay.setSelectedIndex(0);
        Jmonth.setSelectedIndex(0);
        Jyear.setSelectedIndex(0);
        buttonGroup1.clearSelection();
        buttonGroup2.clearSelection();
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(null, "Please enter valid numbers.", "Error", JOptionPane.ERROR_MESSAGE);
    } catch (IllegalArgumentException ex) {
        JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }


        

    }//GEN-LAST:event_jButton3ActionPerformed


    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new Menu().setVisible(true);
    }//GEN-LAST:event_jButton15ActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddEmp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Jmonth;
    private javax.swing.JComboBox<String> Jyear;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JRadioButton f;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jDay;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl;
    private javax.swing.JRadioButton m;
    private javax.swing.JRadioButton no;
    private java.awt.Panel panel1;
    private javax.swing.JPanel pnTitle;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtSalary;
    private javax.swing.JTextField txtlname;
    private javax.swing.JTextField txtname;
    private javax.swing.JRadioButton yes;
    // End of variables declaration//GEN-END:variables
}