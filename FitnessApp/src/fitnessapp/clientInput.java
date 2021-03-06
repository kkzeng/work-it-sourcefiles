/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitnessapp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.swing.JSlider;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;


/**
 *
 * @author Kenneth
 */
public class clientInput extends javax.swing.JFrame {

    /**
     * Creates new form clientInput
     */
    public clientInput() {
        initComponents();
    }
    
    public static final int FL_MIN = 1; //setting the range of the slider
    public static final int FL_MAX = 5;
    public static final int FL_INIT = 3; 
    public double fl;
    public String user, focus;
    public String gdrivePath;
    
    public clientInput(String login, String filePath){
        initComponents();
        user = login;
        gdrivePath = filePath; 
        fitnessLevel.setMajorTickSpacing(1); //managing the tickspacing of the fitness slider
        fitnessLevel.setMinorTickSpacing(1);
        fitnessLevel.setPaintTicks(true);
        fitnessLevel.setPaintLabels(true);
        
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
        saveExcel1 = new javax.swing.JButton();
        ageField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fitnessLevel = new javax.swing.JSlider(JSlider.HORIZONTAL,
            FL_MIN, FL_MAX, FL_INIT);
        jLabel4 = new javax.swing.JLabel();
        weightField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        hyperButton = new javax.swing.JToggleButton();
        strengthButton = new javax.swing.JToggleButton();
        saveExcel = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        bench1RM = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        deadlift1RM = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        squat1RM = new javax.swing.JTextField();
        press1RM = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cardioButton = new javax.swing.JToggleButton();
        jLabel11 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        saveExcel2 = new javax.swing.JButton();

        saveExcel1.setText("Save");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setText("Client Data");

        jLabel2.setText("Age");

        jLabel3.setText("Fitness Level");

        fitnessLevel.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                fitnessLevelStateChanged(evt);
            }
        });

        jLabel4.setText("Weight (kg)");

        jLabel5.setText("Focus");

        hyperButton.setText("Hypertrophy");
        hyperButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hyperButtonActionPerformed(evt);
            }
        });

        strengthButton.setText("Strength");
        strengthButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                strengthButtonActionPerformed(evt);
            }
        });

        saveExcel.setText("Save");
        saveExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveExcelActionPerformed(evt);
            }
        });

        jLabel6.setText("1RM (1 rep maxes)");

        jLabel7.setText("Squat 1RM (kg)");

        jLabel8.setText("Deadlift 1RM (kg)");

        jLabel9.setText("Bench 1RM (kg)");

        jLabel10.setText("Standing Press 1RM (kg)");

        cardioButton.setText("Cardiovascular");
        cardioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardioButtonActionPerformed(evt);
            }
        });

        jLabel11.setText("Name");

        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });

        saveExcel2.setText("Back");
        saveExcel2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveExcel2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cardioButton)
                .addGap(164, 164, 164))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel11))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fitnessLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(squat1RM, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(hyperButton, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(strengthButton))
                            .addComponent(weightField, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ageField, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(bench1RM, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(deadlift1RM, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(press1RM, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10))
                            .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(saveExcel2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(saveExcel, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(jLabel1)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fitnessLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(weightField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hyperButton)
                    .addComponent(strengthButton)
                    .addComponent(jLabel5))
                .addGap(12, 12, 12)
                .addComponent(cardioButton)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(squat1RM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deadlift1RM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bench1RM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(press1RM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveExcel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveExcel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void strengthButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_strengthButtonActionPerformed
        focus = "Strength";
    }//GEN-LAST:event_strengthButtonActionPerformed

    private void saveExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveExcelActionPerformed
    new mainScreen(user,gdrivePath).setVisible(true);
    dispose();

HSSFWorkbook workbook = new HSSFWorkbook();
HSSFSheet sheet = workbook.createSheet("Client Data");
double temp = Integer.parseInt(weightField.getText());
double temp2 = Integer.parseInt(squat1RM.getText());
double temp3 = Integer.parseInt(bench1RM.getText());
double temp4 = Integer.parseInt(deadlift1RM.getText());
double temp5 = Integer.parseInt(press1RM.getText());

 
Map<String, Object[]> data = new HashMap<>();
data.put("1", new Object[] {"Age", "Fitness Level", "Weight","Focus","Squat 1RM", "Bench 1RM", "Deadlift 1RM", "Standing Press 1RM"});
data.put("2", new Object[] {ageField.getText(), fl, temp , focus, temp2,temp3,temp4,temp5});

 
Set<String> keyset = data.keySet();
int rownum = 0;
for (String key : keyset) {
    Row row = sheet.createRow(rownum++);
    Object [] objArr = data.get(key);
    int cellnum = 0;
    for (Object obj : objArr) {
        Cell cell = row.createCell(cellnum++);
         if(obj instanceof Boolean)
            cell.setCellValue((Boolean)obj);
        else if(obj instanceof String)
            cell.setCellValue((String)obj);
        else if(obj instanceof Double)
            cell.setCellValue((Double)obj);
    }
}

HSSFSheet name = workbook.createSheet("Name");
HSSFRow row = name.createRow(0);
row.createCell(0).setCellValue(user); //sets first cell to be the user's name - needed for summary to the trainer later
row.createCell(1).setCellValue(nameField.getText()); //sets second cell in the row to be real name - ease of trainer

        
File myFile = new File(gdrivePath + "/Java Files/Client Data/"+user); //creates user folder
myFile.mkdirs();
myFile = new File (gdrivePath + "/Java Files/Client Data/"+user+"/"+user+"clientdata.xls"); //changes variable so that it writes to the clientdata.xls file
try {
    try (FileOutputStream out = new FileOutputStream(myFile)) { //storing clientdata in its own folder
        workbook.write(out);
    } 
    workbook.close();
} catch (FileNotFoundException e) {
} catch (IOException e) {
}


    }//GEN-LAST:event_saveExcelActionPerformed

    private void hyperButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hyperButtonActionPerformed
        focus = "Hypertrophy";
    }//GEN-LAST:event_hyperButtonActionPerformed

    private void fitnessLevelStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_fitnessLevelStateChanged
       JSlider source = (JSlider)evt.getSource();
        fl = (int)source.getValue();
        
        
    }//GEN-LAST:event_fitnessLevelStateChanged

    private void cardioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardioButtonActionPerformed
         focus = "Cardiovascular";
    }//GEN-LAST:event_cardioButtonActionPerformed

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

    private void saveExcel2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveExcel2ActionPerformed
        dispose();
    }//GEN-LAST:event_saveExcel2ActionPerformed

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
            java.util.logging.Logger.getLogger(clientInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(clientInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(clientInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(clientInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new clientInput().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ageField;
    private javax.swing.JTextField bench1RM;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JToggleButton cardioButton;
    private javax.swing.JTextField deadlift1RM;
    private javax.swing.JSlider fitnessLevel;
    private javax.swing.JToggleButton hyperButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField press1RM;
    private javax.swing.JButton saveExcel;
    private javax.swing.JButton saveExcel1;
    private javax.swing.JButton saveExcel2;
    private javax.swing.JTextField squat1RM;
    private javax.swing.JToggleButton strengthButton;
    private javax.swing.JTextField weightField;
    // End of variables declaration//GEN-END:variables
}
