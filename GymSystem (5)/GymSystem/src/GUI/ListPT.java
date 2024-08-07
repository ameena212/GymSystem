package GUI;

import GUI.Menu;
import java.awt.Dimension;
import java.awt.Toolkit;
import Logic.*;
import static Logic.GymSystem.memberList;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ListPT extends javax.swing.JFrame {

    /**
     * Creates new form ListPT
     */
    public ListPT() {
        initComponents();
        refillCombo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        pnTitle1 = new javax.swing.JPanel();
        jButton15 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        trainertxt = new javax.swing.JTextArea();
        cbTrainers = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        memberIdTextField = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(241, 247, 251));
        jPanel1.setPreferredSize(new java.awt.Dimension(950, 600));

        jLabel12.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(21, 50, 112));
        jLabel12.setText("Choose Trainer");

        jLabel10.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(21, 50, 112));
        jLabel10.setText("List of personal trainer");

        pnTitle1.setBackground(new java.awt.Color(205, 228, 242));
        pnTitle1.setPreferredSize(new java.awt.Dimension(950, 110));

        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/BackBtn.png"))); // NOI18N
        jButton15.setBorderPainted(false);
        jButton15.setContentAreaFilled(false);
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(21, 50, 112));
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/polytechnic Gym System.png"))); // NOI18N
        jLabel22.setPreferredSize(new java.awt.Dimension(1353, 135));

        javax.swing.GroupLayout pnTitle1Layout = new javax.swing.GroupLayout(pnTitle1);
        pnTitle1.setLayout(pnTitle1Layout);
        pnTitle1Layout.setHorizontalGroup(
            pnTitle1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTitle1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton15)
                .addContainerGap())
        );
        pnTitle1Layout.setVerticalGroup(
            pnTitle1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTitle1Layout.createSequentialGroup()
                .addGroup(pnTitle1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnTitle1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnTitle1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jButton15)))
                .addContainerGap())
        );

        trainertxt.setColumns(20);
        trainertxt.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        trainertxt.setForeground(new java.awt.Color(21, 50, 112));
        trainertxt.setRows(5);
        jScrollPane2.setViewportView(trainertxt);

        cbTrainers.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        cbTrainers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTrainersActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(205, 228, 242));
        jButton2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jButton2.setForeground(new java.awt.Color(21, 50, 112));
        jButton2.setText("List");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        memberIdTextField.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N

        jButton6.setBackground(new java.awt.Color(205, 228, 242));
        jButton6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(21, 50, 112));
        jButton6.setText("Delete");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(21, 50, 112));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/PT.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnTitle1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 869, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbTrainers, 0, 178, Short.MAX_VALUE)
                                    .addComponent(memberIdTextField))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton6)
                                    .addComponent(jButton2))
                                .addGap(77, 77, 77)
                                .addComponent(jLabel10)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(pnTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(49, 49, 49)
                                        .addComponent(jLabel10))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cbTrainers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(memberIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton6)))
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new Menu().setVisible(true);
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        // Get the selected trainer from the employee list
        Trainer selectedTrainer = (Trainer)cbTrainers.getSelectedItem();

       // if (selectedEmployee instanceof Trainer) {
            //Trainer selectedTrainer = (Trainer) selectedEmployee;

            // Clear the trainertxt text area
            trainertxt.setText("");

            // Iterate over the members of the selected trainer and append their details to the text area
            for (Member member : selectedTrainer.getMemberTList()) {
                trainertxt.append(member.getMembershipId() + "  " + member.getFirstName() + "  " + member.getSurname() + "\n");
            }

            // Show a message if the selected trainer has no members
            if (selectedTrainer.getMemberTList().isEmpty()) {
                trainertxt.setText("This trainer has no members.");
                  JOptionPane.showMessageDialog(this, "This trainer has no members."+JOptionPane.ERROR_MESSAGE);
            }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cbTrainersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTrainersActionPerformed
        // TODO add your handling code here:
        cbTrainers.getSelectedItem();
    }//GEN-LAST:event_cbTrainersActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
 boolean found = false;
int indexOfMember = 0;
Trainer selectedTrainer = (Trainer)cbTrainers.getSelectedItem();

try {
    // Get the ID from the text box
    int memberId = Integer.parseInt(memberIdTextField.getText());

    // Search for the member in the trainer's memberTList
    ArrayList<Member> memberTList = selectedTrainer.getMemberTList();
    for (int i = 0; i < memberTList.size(); i++) {
        Member member = memberTList.get(i);
        if (Integer.valueOf(member.getMembershipId()).equals(memberId)) {
            found = true;
            indexOfMember = i;
            break;
        }
    }

    if (found) {
        // Remove the member from the trainer's memberTList
        memberTList.remove(indexOfMember);
        trainertxt.append("Member deleted successfully.\n\n");
        JOptionPane.showMessageDialog(this, "Member deleted successfully.\n\n");
    } else {
        
        JOptionPane.showMessageDialog(this, "Member not found.\n\n" + JOptionPane.ERROR_MESSAGE);
    }
} catch (NumberFormatException e) {
   
    JOptionPane.showMessageDialog(this, "Invalid input. Please enter a valid ID.\n\n" + JOptionPane.ERROR_MESSAGE);
}

    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(ListPT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListPT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListPT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListPT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListPT().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Trainer> cbTrainers;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField memberIdTextField;
    private javax.swing.JPanel pnTitle1;
    private javax.swing.JTextArea trainertxt;
    // End of variables declaration//GEN-END:variables

    private void refillCombo() {

        cbTrainers.removeAllItems(); // Remove all items from the combo box

        // Retrieve the list of trainers from the GymSystem class
        ArrayList<Employee> trainerList = GymSystem.employeeList;
        // Loop through the trainerList and add each trainer's name to the combo box
        for (Employee employee : trainerList) {
            if (employee instanceof Trainer) {
                Trainer trainer = (Trainer) employee;
                cbTrainers.addItem(trainer);
            }
        }

    }
}
