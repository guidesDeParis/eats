/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * LookupPreferencesDialog.java
 *
 * Created on Oct 5, 2010, 3:50:05 PM
 */

package uk.ac.kcl.cch.eats.lookup;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

/**
 *
 * @author jvieira
 */
public class LookupPreferencesDialog extends javax.swing.JDialog {

    /** Creates new form LookupPreferencesDialog */
    public LookupPreferencesDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFieldsPanel = new JPanel();
        jUrlLabel = new JLabel();
        jUsernameLabel = new JLabel();
        jPasswordLabel = new JLabel();
        jUrlTextField = new JTextField();
        jUsernameTextField = new JTextField();
        jPasswordTextField = new JPasswordField();
        jButtonsPanel = new JPanel();
        jOkButton = new JButton();
        jCancelButton = new JButton();
        jProxyFieldsPanel = new JPanel();
        jProxyUsernameLabel = new JLabel();
        jProxyUsernameTextField = new JTextField();
        jProxyPasswordLabel = new JLabel();
        jProxyPasswordField = new JPasswordField();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Look Up Preferences");
        setModal(true);
        setResizable(false);

        jFieldsPanel.setBorder(BorderFactory.createTitledBorder(" EATS "));

        jUrlLabel.setText("URL:");

        jUsernameLabel.setText("Username:");

        jPasswordLabel.setText("Password:");

        GroupLayout jFieldsPanelLayout = new GroupLayout(jFieldsPanel);
        jFieldsPanel.setLayout(jFieldsPanelLayout);
        jFieldsPanelLayout.setHorizontalGroup(
            jFieldsPanelLayout.createParallelGroup(Alignment.LEADING)
            .addGroup(jFieldsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jFieldsPanelLayout.createParallelGroup(Alignment.LEADING)
                    .addGroup(jFieldsPanelLayout.createSequentialGroup()
                        .addComponent(jUrlLabel)
                        .addPreferredGap(ComponentPlacement.UNRELATED, 48, Short.MAX_VALUE)
                        .addComponent(jUrlTextField, GroupLayout.PREFERRED_SIZE, 285, GroupLayout.PREFERRED_SIZE))
                    .addGroup(Alignment.TRAILING, jFieldsPanelLayout.createSequentialGroup()
                        .addGroup(jFieldsPanelLayout.createParallelGroup(Alignment.LEADING)
                            .addComponent(jUsernameLabel)
                            .addComponent(jPasswordLabel))
                        .addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jFieldsPanelLayout.createParallelGroup(Alignment.LEADING, false)
                            .addComponent(jPasswordTextField)
                            .addComponent(jUsernameTextField, GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE))))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jFieldsPanelLayout.linkSize(SwingConstants.HORIZONTAL, new Component[] {jUrlTextField, jUsernameTextField});

        jFieldsPanelLayout.setVerticalGroup(
            jFieldsPanelLayout.createParallelGroup(Alignment.LEADING)
            .addGroup(jFieldsPanelLayout.createSequentialGroup()
                .addGroup(jFieldsPanelLayout.createParallelGroup(Alignment.BASELINE)
                    .addComponent(jUrlLabel)
                    .addComponent(jUrlTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(ComponentPlacement.RELATED)
                .addGroup(jFieldsPanelLayout.createParallelGroup(Alignment.BASELINE)
                    .addComponent(jUsernameTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jUsernameLabel))
                .addPreferredGap(ComponentPlacement.RELATED)
                .addGroup(jFieldsPanelLayout.createParallelGroup(Alignment.BASELINE)
                    .addComponent(jPasswordTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordLabel))
                .addContainerGap(6, Short.MAX_VALUE))
        );

        jOkButton.setText("OK");

        jCancelButton.setText("Cancel");

        GroupLayout jButtonsPanelLayout = new GroupLayout(jButtonsPanel);
        jButtonsPanel.setLayout(jButtonsPanelLayout);
        jButtonsPanelLayout.setHorizontalGroup(
            jButtonsPanelLayout.createParallelGroup(Alignment.LEADING)
            .addGroup(Alignment.TRAILING, jButtonsPanelLayout.createSequentialGroup()
                .addContainerGap(224, Short.MAX_VALUE)
                .addComponent(jCancelButton)
                .addPreferredGap(ComponentPlacement.UNRELATED)
                .addComponent(jOkButton)
                .addContainerGap())
        );

        jButtonsPanelLayout.linkSize(SwingConstants.HORIZONTAL, new Component[] {jCancelButton, jOkButton});

        jButtonsPanelLayout.setVerticalGroup(
            jButtonsPanelLayout.createParallelGroup(Alignment.LEADING)
            .addGroup(jButtonsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jButtonsPanelLayout.createParallelGroup(Alignment.BASELINE)
                    .addComponent(jCancelButton)
                    .addComponent(jOkButton))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jProxyFieldsPanel.setBorder(BorderFactory.createTitledBorder(" Remote Proxy Authentication "));

        jProxyUsernameLabel.setText("Username:");

        jProxyUsernameTextField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jProxyUsernameTextFieldActionPerformed(evt);
            }
        });

        jProxyPasswordLabel.setText("Password:");

        GroupLayout jProxyFieldsPanelLayout = new GroupLayout(jProxyFieldsPanel);
        jProxyFieldsPanel.setLayout(jProxyFieldsPanelLayout);
        jProxyFieldsPanelLayout.setHorizontalGroup(
            jProxyFieldsPanelLayout.createParallelGroup(Alignment.LEADING)
            .addGroup(jProxyFieldsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jProxyFieldsPanelLayout.createParallelGroup(Alignment.LEADING)
                    .addComponent(jProxyUsernameLabel)
                    .addComponent(jProxyPasswordLabel))
                .addPreferredGap(ComponentPlacement.RELATED)
                .addGroup(jProxyFieldsPanelLayout.createParallelGroup(Alignment.LEADING)
                    .addComponent(jProxyUsernameTextField, GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                    .addComponent(jProxyPasswordField, GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE))
                .addContainerGap())
        );
        jProxyFieldsPanelLayout.setVerticalGroup(
            jProxyFieldsPanelLayout.createParallelGroup(Alignment.LEADING)
            .addGroup(jProxyFieldsPanelLayout.createSequentialGroup()
                .addGroup(jProxyFieldsPanelLayout.createParallelGroup(Alignment.LEADING)
                    .addGroup(jProxyFieldsPanelLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jProxyFieldsPanelLayout.createParallelGroup(Alignment.BASELINE)
                            .addComponent(jProxyUsernameLabel)
                            .addComponent(jProxyUsernameTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jProxyFieldsPanelLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jProxyFieldsPanelLayout.createParallelGroup(Alignment.BASELINE)
                            .addComponent(jProxyPasswordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jProxyPasswordLabel))))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(Alignment.LEADING)
            .addComponent(jFieldsPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jProxyFieldsPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButtonsPanel, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jFieldsPanel, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addComponent(jProxyFieldsPanel, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addComponent(jButtonsPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jProxyUsernameTextFieldActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jProxyUsernameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jProxyUsernameTextFieldActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                LookupPreferencesDialog dialog = new LookupPreferencesDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public JPanel jButtonsPanel;
    public JButton jCancelButton;
    public JPanel jFieldsPanel;
    public JButton jOkButton;
    public JLabel jPasswordLabel;
    public JPasswordField jPasswordTextField;
    public JPanel jProxyFieldsPanel;
    public JPasswordField jProxyPasswordField;
    public JLabel jProxyPasswordLabel;
    public JLabel jProxyUsernameLabel;
    public JTextField jProxyUsernameTextField;
    public JLabel jUrlLabel;
    public JTextField jUrlTextField;
    public JLabel jUsernameLabel;
    public JTextField jUsernameTextField;
    // End of variables declaration//GEN-END:variables

}
