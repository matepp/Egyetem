package hotelregistry.view.dialogs;

import hotelregistry.view.HotelRegistryGUI;
import java.util.Arrays;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class ChangePasswordDialog extends javax.swing.JDialog {

    private final HotelRegistryGUI mainGUI;

    @SuppressWarnings({"OverridableMethodCallInConstructor", "LeakingThisInConstructor"})
    public ChangePasswordDialog(HotelRegistryGUI mainGUI, boolean modal) {
        super(mainGUI.getWindow(), modal);
        this.mainGUI = mainGUI;
        initComponents();
        addActions();
        mainGUI.centreWindow(this);
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tbOldPass = new javax.swing.JPasswordField();
        tbNewPass = new javax.swing.JPasswordField();
        tbConfirmNewPass = new javax.swing.JPasswordField();
        bOk = new javax.swing.JButton();
        lError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(mainGUI.getController().getLabel("ChangePasswordDialog.title"));
        setPreferredSize(new java.awt.Dimension(320, 220));

        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 10, 3, 3));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jLabel1.setText(mainGUI.getController().getLabel("ChangePasswordDialog.text"));
        jLabel1.setAlignmentX(1.0F);
        jLabel1.setAlignmentY(1.0F);
        jPanel2.add(jLabel1, java.awt.BorderLayout.NORTH);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel1.setPreferredSize(new java.awt.Dimension(400, 290));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel2.setText(mainGUI.getController().getLabel("ChangePasswordDialog.oldPasswordLabel"));
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(jLabel2, gridBagConstraints);

        jLabel3.setText(mainGUI.getController().getLabel("ChangePasswordDialog.newPasswordLabel"));
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(jLabel3, gridBagConstraints);

        jLabel4.setText(mainGUI.getController().getLabel("ChangePasswordDialog.confirmNewPasswordLabel"));
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(jLabel4, gridBagConstraints);

        tbOldPass.setPreferredSize(new java.awt.Dimension(120, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 0, 0);
        jPanel1.add(tbOldPass, gridBagConstraints);

        tbNewPass.setPreferredSize(new java.awt.Dimension(120, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 0, 0);
        jPanel1.add(tbNewPass, gridBagConstraints);

        tbConfirmNewPass.setPreferredSize(new java.awt.Dimension(120, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 0, 0);
        jPanel1.add(tbConfirmNewPass, gridBagConstraints);

        bOk.setText(mainGUI.getController().getLabel("ChangePasswordDialog.okButton"));
        bOk.setEnabled(false);
        bOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bOkActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 0);
        jPanel1.add(bOk, gridBagConstraints);

        lError.setForeground(new java.awt.Color(255, 102, 102));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        jPanel1.add(lError, gridBagConstraints);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bOkActionPerformed
        mainGUI.getController().changePassword(mainGUI.getCurrentUser().getId(), new String(tbOldPass.getPassword()), new String(tbNewPass.getPassword()));
        mainGUI.getCurrentUser().setPassword(new String(tbNewPass.getPassword()));
        dispose();
    }//GEN-LAST:event_bOkActionPerformed

    void addActions() {
        tbConfirmNewPass.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                isAllOk();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                isAllOk();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                isAllOk();
            }
        });
        
        tbNewPass.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                isAllOk();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                isAllOk();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                isAllOk();
            }
        });
        
        tbOldPass.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                isAllOk();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                isAllOk();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                isAllOk();
            }
        });
    }

    boolean isConfirmNewPassOk() {
        if(!(Arrays.equals(tbConfirmNewPass.getPassword(), tbNewPass.getPassword())))
        {
            lError.setText(mainGUI.getController().getLabel("ChangePasswordDialog.error.newPassMismach"));
            return false;
        }
        
        lError.setText("");
        return true;
        
    }
    
    boolean isNewPassOk(){
        if(tbNewPass.getPassword().equals(""))
        {
            lError.setText(mainGUI.getController().getLabel("ChangePasswordDialog.error.emptyNewPassField"));
            return false;
        }
        if (tbNewPass.getPassword().length < mainGUI.getController().getSettings().getPasswordMinLength()
                 || tbNewPass.getPassword().length > mainGUI.getController().getSettings().getPasswordMaxLength()) {
               
            lError.setText(mainGUI.getController().getLabel("ChangePasswordDialog.error.InvalidPassLength"));
            return false;
        }

        return true;
    }
    
    boolean isOldPassOk(){
        if(tbOldPass.getPassword().equals(""))
        {
            lError.setText(mainGUI.getController().getLabel("ChangePasswordDialog.error.emptyOldPassField"));
            return false;
        }
        if(!(Arrays.equals(tbOldPass.getPassword(), mainGUI.getCurrentUser().getPassword().toCharArray()))){
            lError.setText(mainGUI.getController().getLabel("ChangePasswordDialog.error.invalidOldPass"));
            return false;
        }
       
        return true;

    }

    void isAllOk() {
        if(isOldPassOk()) 
        {
            if(isNewPassOk()){
                
                if(isConfirmNewPassOk()){
                    bOk.setEnabled(true);
                }
                else{
                    bOk.setEnabled(false);
                }
            }
            else{
                bOk.setEnabled(false);
            }   
        }
        else{
            bOk.setEnabled(false);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bOk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lError;
    private javax.swing.JPasswordField tbConfirmNewPass;
    private javax.swing.JPasswordField tbNewPass;
    private javax.swing.JPasswordField tbOldPass;
    // End of variables declaration//GEN-END:variables

}
