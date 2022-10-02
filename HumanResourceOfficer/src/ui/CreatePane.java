/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import employeeModel.Employee;
import employeeModel.EmployeeDirectory;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author manavhirey
 */
public class CreatePane extends javax.swing.JPanel {

    /**
     * Creates new form CreatePane
     */
    
    EmployeeDirectory directory;
    String selectedImagePath,gender = "";
    
    public CreatePane(EmployeeDirectory directory) {
        initComponents();
        this.directory = directory;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        empId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ageField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lvlField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        teamField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        posField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        phoneField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        saveBtn = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        uploadButton = new javax.swing.JButton();
        sdField = new javax.swing.JFormattedTextField();
        fRadio = new javax.swing.JRadioButton();
        mRadio = new javax.swing.JRadioButton();
        oRadio = new javax.swing.JRadioButton();

        titleLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("New Employee Field");

        jLabel1.setText("Name:");

        nameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                nameFieldFocusLost(evt);
            }
        });

        jLabel3.setText("Employee ID:");

        empId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                empIdKeyPressed(evt);
            }
        });

        jLabel2.setText("Age:");

        jLabel4.setText("Gender");

        jLabel5.setText("Start Date:");

        jLabel6.setText("Level:");

        jLabel7.setText("Team Info:");

        jLabel8.setText("Position Title:");

        jLabel9.setText("Phone Number:");

        phoneField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                phoneFieldKeyPressed(evt);
            }
        });

        jLabel10.setText("Email ID:");

        emailField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailFieldFocusLost(evt);
            }
        });

        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        jLabel11.setText("Photo:");

        uploadButton.setText("Upload Photo");
        uploadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadButtonActionPerformed(evt);
            }
        });

        sdField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        sdField.setText("MM/DD/YYYY");

        fRadio.setText("Female");
        fRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fRadioActionPerformed(evt);
            }
        });

        mRadio.setText("Male");
        mRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mRadioActionPerformed(evt);
            }
        });

        oRadio.setText("Other");
        oRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oRadioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(emailField, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                                .addComponent(nameField)
                                .addComponent(empId)
                                .addComponent(ageField)
                                .addComponent(lvlField)
                                .addComponent(teamField)
                                .addComponent(posField, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                                .addComponent(phoneField, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                                .addComponent(sdField))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(fRadio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mRadio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(oRadio)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(258, 258, 258)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(uploadButton, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(titleLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(empId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(ageField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(fRadio)
                    .addComponent(mRadio)
                    .addComponent(oRadio))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(sdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(lvlField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(teamField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(posField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(phoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)))
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(uploadButton))
                .addGap(14, 14, 14)
                .addComponent(saveBtn)
                .addContainerGap(55, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    public void createEmployee(String employeeId, String name, int age, String gender, String startDate, String level, String teamInfo, String position, Long cellNo, String email, String image){
        Employee ne = directory.addNewEmployee();
        
        ne.setEmployeeId(employeeId);
        ne.setName(name);
        ne.setAge(age);
        ne.setGender(gender);
        ne.setStartDate(startDate);
        ne.setLevel(level);
        ne.setTeamInfo(teamInfo);
        ne.setPosition(position);
        ne.setCellNo(cellNo);
        ne.setEmail(email);
        ne.setImage(image);
        
        nameField.setText("");
        empId.setText("");
        ageField.setText("");
        sdField.setText("");
        lvlField.setText("");
        teamField.setText("");
        posField.setText("");
        phoneField.setText("");
        emailField.setText("");
        
        mRadio.setSelected(false);
        fRadio.setSelected(false);
        oRadio.setSelected(false);
        
        
    }
    
    
    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:   
        
        String name = nameField.getText();
        String employeeId = empId.getText();
        int age = Integer.parseInt(ageField.getText());;
        String startDate = sdField.getText();
        String level = lvlField.getText();;
        String teamInfo = teamField.getText();;
        String position = posField.getText();;
        long cellNo = Long.parseLong(phoneField.getText());
        String email = emailField.getText();
        String image = selectedImagePath;
        
        createEmployee(employeeId, name, age, gender, startDate, level, teamInfo, position, cellNo, email, image);
        
        JOptionPane.showMessageDialog(this,"New Employee Added!");
        
        
    }//GEN-LAST:event_saveBtnActionPerformed

    private void uploadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadButtonActionPerformed
        // TODO add your handling code here:
        JFileChooser browseImageFile = new JFileChooser();
        FileNameExtensionFilter fNameFilter = new FileNameExtensionFilter("IMAGES", "png", "jpeg","jpg");
        browseImageFile.addChoosableFileFilter(fNameFilter);
        int showOpenPopup = browseImageFile.showOpenDialog(null);
        
        if (showOpenPopup == JFileChooser.APPROVE_OPTION) {
            File selectedImageFile = browseImageFile.getSelectedFile();
            selectedImagePath = selectedImageFile.getAbsolutePath();
            JOptionPane.showMessageDialog(null, selectedImagePath);
            
            
        }
    }//GEN-LAST:event_uploadButtonActionPerformed

    private void phoneFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phoneFieldKeyPressed
        // TODO add your handling code here:
         String phoneNumber = phoneField.getText();
        int lengthOfPhoneNumber = phoneNumber.length();
        char checkChar = evt.getKeyChar();
        if (checkChar >= '0' && checkChar <= '9') {
            if (lengthOfPhoneNumber < 10) {
                phoneField.setEditable(true);
            } else {
                phoneField.setEditable(false);
                JOptionPane.showMessageDialog(this, "Cannot add more than 10 Numbers!");
            }
        } else {
            if (evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode() == KeyEvent.VK_DELETE) {
                phoneField.setEditable(true);
            } else {
                phoneField.setEditable(false);
            }
        }
        
    }//GEN-LAST:event_phoneFieldKeyPressed

    private void mRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mRadioActionPerformed
        // TODO add your handling code here:
        if(mRadio.isSelected()){
            fRadio.setSelected(false);
            gender = "Male";
            oRadio.setSelected(false);
        }
    }//GEN-LAST:event_mRadioActionPerformed

    private void fRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fRadioActionPerformed
        // TODO add your handling code here:
        if(fRadio.isSelected()){
            mRadio.setSelected(false);
            gender = "Female";
            oRadio.setSelected(false);
        }
    }//GEN-LAST:event_fRadioActionPerformed

    private void oRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oRadioActionPerformed
        // TODO add your handling code here:
        if(oRadio.isSelected()){
            mRadio.setSelected(false);
            gender = "Other";
            fRadio.setSelected(false);
        }
    }//GEN-LAST:event_oRadioActionPerformed

    private void nameFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameFieldFocusLost
        // TODO add your handling code here:
        Pattern p = Pattern.compile("[^A-Za-z ]");
        Matcher m = p.matcher(nameField.getText());
       // boolean b = m.matches();
        boolean b = m.find();
        if (b){
            JOptionPane.showMessageDialog(null,"Special Characters are not allowed.");
            nameField.setText("");
        }
    }//GEN-LAST:event_nameFieldFocusLost

    private void emailFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFieldFocusLost
        // TODO add your handling code here:
        String regexPattern = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"+ "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
        Pattern pattern = Pattern.compile(regexPattern);
        Matcher matcher = pattern.matcher(emailField.getText());
        
        if(!matcher.matches()){
            JOptionPane.showMessageDialog(null,"Enter a valid Email");
            emailField.setText("");
        }
    }//GEN-LAST:event_emailFieldFocusLost

    private void empIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_empIdKeyPressed
        // TODO add your handling code here:
        String idEmp = empId.getText();
        int lengthOfStr = idEmp.length();
        
        if (lengthOfStr < 10) {
            phoneField.setEditable(true);
        } else {
            phoneField.setEditable(false);
            JOptionPane.showMessageDialog(this, "Cannot enter more than 10 Numbers!");
        }
    }//GEN-LAST:event_empIdKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ageField;
    private javax.swing.JTextField emailField;
    private javax.swing.JTextField empId;
    private javax.swing.JRadioButton fRadio;
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
    private javax.swing.JTextField lvlField;
    private javax.swing.JRadioButton mRadio;
    private javax.swing.JTextField nameField;
    private javax.swing.JRadioButton oRadio;
    private javax.swing.JTextField phoneField;
    private javax.swing.JTextField posField;
    private javax.swing.JButton saveBtn;
    private javax.swing.JFormattedTextField sdField;
    private javax.swing.JTextField teamField;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JButton uploadButton;
    // End of variables declaration//GEN-END:variables
}
