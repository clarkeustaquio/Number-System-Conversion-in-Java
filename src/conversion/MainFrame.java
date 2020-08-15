/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversion;

import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;

/**
 *
 * @author clark
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        myinitComponents();
    }
    
    public static int check_int = 0;
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
        btnGenerate = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txtF_Binary = new javax.swing.JTextField();
        txtF_Decimal = new javax.swing.JTextField();
        txtF_Octal = new javax.swing.JTextField();
        txtF_Hexa = new javax.swing.JTextField();
        lblTitle = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        btnBinary = new javax.swing.JRadioButton();
        btnDecimal = new javax.swing.JRadioButton();
        btnOctal = new javax.swing.JRadioButton();
        btnHexa = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Conversion");
        setName("Conversion"); // NOI18N

        btnGenerate.setText("Generate");
        btnGenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        txtF_Binary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtF_BinaryActionPerformed(evt);
            }
        });

        txtF_Decimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtF_DecimalActionPerformed(evt);
            }
        });

        txtF_Octal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtF_OctalActionPerformed(evt);
            }
        });

        txtF_Hexa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtF_HexaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtF_Decimal)
                    .addComponent(txtF_Binary)
                    .addComponent(txtF_Octal)
                    .addComponent(txtF_Hexa, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtF_Binary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(txtF_Decimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtF_Octal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtF_Hexa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblTitle.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTitle.setText("Number System");

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnBinary.setText("Binary");
        btnBinary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBinaryActionPerformed(evt);
            }
        });

        btnDecimal.setText("Decimal");
        btnDecimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecimalActionPerformed(evt);
            }
        });

        btnOctal.setText("Octal");
        btnOctal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOctalActionPerformed(evt);
            }
        });

        btnHexa.setText("Hexadecimal");
        btnHexa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHexaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBinary)
                    .addComponent(btnHexa)
                    .addComponent(btnOctal)
                    .addComponent(btnDecimal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(9, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnGenerate, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblTitle)
                                .addGap(117, 117, 117))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblTitle)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnBinary)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDecimal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnOctal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnHexa))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnClear)
                    .addComponent(btnGenerate))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void myinitComponents(){
        txtF_Binary.setEditable(false);
        txtF_Decimal.setEditable(false);
        txtF_Octal.setEditable(false);
        txtF_Hexa.setEditable(false);
    }
    
    
    private void btnGenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateActionPerformed
        if(!(txtF_Binary.getText().equals("")) && check_int == 1){
            String get = txtF_Binary.getText();
            try{
                Integer.parseInt(get);
            long binary = Integer.parseInt(txtF_Binary.getText());
                    String check = Long.toString(binary);
                    boolean ret = true;
                    
                    for(int i = 0; i < check.length(); i++){
                        char c = check.charAt(i);
                        if(c != '1' && c != '0'){
                            txtF_Binary.setText("");
                            ret = false;
                        }
                    }
                   
                    if(ret){
                    txtF_Decimal.setText(Integer.toString(Conversion.toDecimal(binary)));
                    txtF_Decimal.setEnabled(false);
        
                    txtF_Octal.setText(Integer.toString(Conversion.toOctal()));
                    txtF_Octal.setEnabled(false);
                    
                    txtF_Hexa.setText(Conversion.toHexa());
                    txtF_Hexa.setEnabled(false); 
                    } 
                    
            }catch(NumberFormatException e){
                txtF_Binary.setText("");
            }

        }
        if(!(txtF_Decimal.getText().equals("")) && check_int == 2){
            String get = txtF_Decimal.getText();
            try{
                Integer.parseInt(get);
                    int decimal = Integer.parseInt(txtF_Decimal.getText());
                    txtF_Binary.setText(FromDecimal.Decimal(decimal));
                    txtF_Binary.setEnabled(false);
                    
                    txtF_Octal.setText(FromDecimal.toOctal());
                    txtF_Octal.setEnabled(false);
                    
                    txtF_Hexa.setText(FromDecimal.toHexa());
                    txtF_Hexa.setEnabled(false);
            }catch(NumberFormatException e){
                txtF_Decimal.setText("");
            }

        }
        if(!(txtF_Octal.getText().equals("")) && check_int == 3){
            String get = txtF_Octal.getText();
            try{
                Integer.parseInt(get);
                int octal = Integer.parseInt(txtF_Octal.getText());
                String check = Integer.toString(octal);
                    boolean ret = true;
                    
                    for(int i = 0; i < check.length(); i++){
                        char c = check.charAt(i);
                        if(c == '8' || c == '9'){
                            txtF_Octal.setText("");
                            ret = false;
                        }
                    }                
                if(ret){
                    txtF_Decimal.setText(Integer.toString(FromOctal.Octal(octal)));
                    txtF_Decimal.setEnabled(false);
                    
                    txtF_Binary.setText(FromOctal.toBinary());
                    txtF_Binary.setEnabled(false);
                    
                    txtF_Hexa.setText(FromOctal.toHexa());
                    txtF_Hexa.setEnabled(false);
                }
            }catch(NumberFormatException e){
                txtF_Octal.setText("");
            }
            
        }
        if(!(txtF_Hexa.getText().equals("")) && check_int == 4){
            String hexa = txtF_Hexa.getText();
                FromHexa a = new FromHexa();
                boolean ret = true;
                
                for(int i = 0; i < hexa.length(); i++){
                    String up = hexa.toUpperCase();
                    char c = up.charAt(i);
                if(!(c >= '0' && c <= '9' || c >= 'A' && c <= 'F')){
                    txtF_Hexa.setText("");
                    ret = false;
                }
            }
                if(ret){
                    txtF_Decimal.setText(Integer.toString(a.Hexa(hexa)));
                    txtF_Decimal.setEnabled(false);
                    
                    txtF_Binary.setText(a.toBinary());
                    txtF_Binary.setEnabled(false);
                   
                    txtF_Octal.setText(a.toOctal());
                    txtF_Octal.setEnabled(false);
                }
        }
    }//GEN-LAST:event_btnGenerateActionPerformed
    
    private void txtF_BinaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtF_BinaryActionPerformed
        if(evt.getSource().equals("")){
            txtF_Binary.setEditable(false);
        }
    }//GEN-LAST:event_txtF_BinaryActionPerformed

    private void txtF_DecimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtF_DecimalActionPerformed

    }//GEN-LAST:event_txtF_DecimalActionPerformed

    private void txtF_OctalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtF_OctalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtF_OctalActionPerformed

    private void txtF_HexaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtF_HexaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtF_HexaActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtF_Decimal.setEnabled(true);
        txtF_Octal.setEnabled(true);
        txtF_Hexa.setEnabled(true);
        txtF_Binary.setEnabled(true);
        
        txtF_Decimal.setEditable(false);
        txtF_Octal.setEditable(false);
        txtF_Hexa.setEditable(false);
        txtF_Binary.setEditable(false);
        
        txtF_Binary.setText("");
        txtF_Decimal.setText("");
        txtF_Octal.setText("");
        txtF_Hexa.setText("");
        
        btnBinary.setSelected(false);
        btnDecimal.setSelected(false);
        btnOctal.setSelected(false);
        btnHexa.setSelected(false);
        
        btnDecimal.setEnabled(true);
        btnOctal.setEnabled(true);
        btnHexa.setEnabled(true);
        btnBinary.setEnabled(true);
        check_int = 0;
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnBinaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBinaryActionPerformed
        if(btnBinary.isSelected()){
                    check_int = 1;
                    txtF_Decimal.setEnabled(false);
                    txtF_Octal.setEnabled(false);
                    txtF_Hexa.setEnabled(false);
            
                    txtF_Binary.setEditable(true);
            
                    btnDecimal.setEnabled(false);
                    btnOctal.setEnabled(false);
                    btnHexa.setEnabled(false); 
                    
        }else if(!btnBinary.isSelected()){        
            Clear();
        }
            
    }//GEN-LAST:event_btnBinaryActionPerformed

    private void btnOctalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOctalActionPerformed
       if(btnOctal.isSelected()){
            check_int = 3;
            txtF_Decimal.setEnabled(false);
            txtF_Binary.setEnabled(false);
            txtF_Hexa.setEnabled(false);
            
            txtF_Octal.setEditable(true);
            
            btnDecimal.setEnabled(false);
            btnBinary.setEnabled(false);
            btnHexa.setEnabled(false);
            
       }else if(!btnOctal.isSelected()){
           Clear();
       }
    }//GEN-LAST:event_btnOctalActionPerformed

    private void btnHexaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHexaActionPerformed
       if(btnHexa.isSelected()){
            check_int = 4;
            txtF_Decimal.setEnabled(false);
            txtF_Binary.setEnabled(false);
            txtF_Octal.setEnabled(false);
            
            txtF_Hexa.setEditable(true);
            
            btnDecimal.setEnabled(false);
            btnBinary.setEnabled(false);
            btnOctal.setEnabled(false);
            
       }else if(!btnHexa.isSelected()){
           Clear();
       }
    }//GEN-LAST:event_btnHexaActionPerformed

    private void btnDecimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecimalActionPerformed
        if(btnDecimal.isSelected()){
            check_int = 2;
            txtF_Hexa.setEnabled(false);
            txtF_Binary.setEnabled(false);
            txtF_Octal.setEnabled(false);
            
            txtF_Decimal.setEditable(true);
            
            btnHexa.setEnabled(false);
            btnBinary.setEnabled(false);
            btnOctal.setEnabled(false);
            
       }else if(!btnDecimal.isSelected()){
           Clear();
       }
    }//GEN-LAST:event_btnDecimalActionPerformed
    private void Clear(){
        check_int = 0;
        txtF_Decimal.setEnabled(true);
        txtF_Octal.setEnabled(true);
        txtF_Hexa.setEnabled(true);
        txtF_Binary.setEnabled(true);
        
        txtF_Decimal.setEditable(false);
        txtF_Octal.setEditable(false);
        txtF_Hexa.setEditable(false);
        txtF_Binary.setEditable(false);
        
        txtF_Binary.setText("");
        txtF_Decimal.setText("");
        txtF_Octal.setText("");
        txtF_Hexa.setText("");
        
        btnBinary.setSelected(false);
        btnDecimal.setSelected(false);
        btnOctal.setSelected(false);
        btnHexa.setSelected(false);
        
        btnDecimal.setEnabled(true);
        btnOctal.setEnabled(true);
        btnHexa.setEnabled(true);
        btnBinary.setEnabled(true);
    }
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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btnBinary;
    private javax.swing.JButton btnClear;
    private javax.swing.JRadioButton btnDecimal;
    private javax.swing.JButton btnGenerate;
    private javax.swing.JRadioButton btnHexa;
    private javax.swing.JRadioButton btnOctal;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtF_Binary;
    private javax.swing.JTextField txtF_Decimal;
    private javax.swing.JTextField txtF_Hexa;
    private javax.swing.JTextField txtF_Octal;
    // End of variables declaration//GEN-END:variables
}
