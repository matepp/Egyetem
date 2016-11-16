package hotelregistry.view.panels;

import hotelregistry.model.bean.User;

import hotelregistry.view.HotelRegistryGUI;
import hotelregistry.view.menubars.AdminMenuBar;
import hotelregistry.view.menubars.StatusBar;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;

public class HotelRegistryLogin extends javax.swing.JPanel {

    final private HotelRegistryGUI mainGUI;

    public HotelRegistryLogin(HotelRegistryGUI pGUI) {
        mainGUI = pGUI;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        bLogin = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        tbUsername = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tbPassword = new javax.swing.JPasswordField();
        lError = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(java.awt.Color.white);
        setLayout(new javax.swing.OverlayLayout(this));

        jPanel2.setBackground(java.awt.Color.white);
        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jPanel1.setBackground(new Color(171,159,160,123));
        jPanel1.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(280, 170));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        bLogin.setBackground(new java.awt.Color(204, 204, 204));
        bLogin.setForeground(new java.awt.Color(102, 102, 102));
        bLogin.setText(mainGUI.getController().getLabel("LOGIN.loginbutton"));
        bLogin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(153, 153, 153), null, null));
        bLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginButtonClicked(evt);
            }
        });
        bLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLoginActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.weightx = 2.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(bLogin, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText(mainGUI.getController().getLabel("LOGIN.username")
        );
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(jLabel3, gridBagConstraints);

        tbUsername.setMinimumSize(new java.awt.Dimension(120, 20));
        tbUsername.setPreferredSize(new java.awt.Dimension(120, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 5);
        jPanel1.add(tbUsername, gridBagConstraints);
        tbUsername.getAccessibleContext().setAccessibleName("");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText(mainGUI.getController().getLabel("LOGIN.password"));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(jLabel4, gridBagConstraints);

        tbPassword.setMinimumSize(new java.awt.Dimension(120, 20));
        tbPassword.setPreferredSize(new java.awt.Dimension(120, 20));
        tbPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbPasswordActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 5);
        jPanel1.add(tbPassword, gridBagConstraints);

        lError.setBackground(new Color(171,159,160,123));
        lError.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lError.setForeground(new java.awt.Color(255, 0, 0));
        lError.setToolTipText("");
        lError.setPreferredSize(new java.awt.Dimension(400, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.weightx = 1.0;
        jPanel1.add(lError, gridBagConstraints);

        jPanel2.add(jPanel1, new java.awt.GridBagConstraints());

        add(jPanel2);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/london-wallpaper-2.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(1920, 1080));
        jLabel1.setPreferredSize(new java.awt.Dimension(1920, 1080));
        add(jLabel1);
    }// </editor-fold>//GEN-END:initComponents

    void tryLogin(String email, String password) {
        try {
            //lError.setText("");
            if (email.isEmpty() || password.isEmpty()) {
                lError.setText(mainGUI.getController().getLabel("LOGIN.error.emptyfield"));
                jLabel1.repaint();
            } else {
                User u = mainGUI.getController().login(email, password);
                if (u == null) {
                    lError.setText(mainGUI.getController().getLabel("LOGIN.error.nouser"));
                    jLabel1.repaint();
                } else {
                    mainGUI.setCurrentUser(u);
                    mainGUI.getWindow().setJMenuBar(new StatusBar(mainGUI, u.getName()));
                    if (u.getAccessLevel() == 2) {
                        mainGUI.getWindow().add(new AdminMenuBar(mainGUI), BorderLayout.WEST);
                        JPanel p = new JPanel();
                        mainGUI.setActualContent(p);
                    }
                    if (u.getAccessLevel() == 1) {
                        mainGUI.getWindow().add(new AdminMenuBar(mainGUI), BorderLayout.WEST);
                        JPanel p = new JPanel();
                        mainGUI.setActualContent(p);
                    }
                    if (u.getAccessLevel() == 0) {
                        mainGUI.getWindow().add(new AdminMenuBar(mainGUI), BorderLayout.WEST);
                        JPanel p = new JPanel();
                        mainGUI.setActualContent(p);
                    }
                }
            }
        } catch (Exception e) {

        }
    }
    private void LoginButtonClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginButtonClicked
        tryLogin(tbUsername.getText(), tbPassword.getText());
    }//GEN-LAST:event_LoginButtonClicked

    private void tbPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbPasswordActionPerformed

    private void bLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bLoginActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lError;
    private javax.swing.JTextField tbPassword;
    private javax.swing.JTextField tbUsername;
    // End of variables declaration//GEN-END:variables

}
