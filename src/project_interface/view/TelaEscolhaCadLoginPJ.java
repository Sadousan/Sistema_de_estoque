/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project_interface.view;

import java.awt.event.WindowEvent;

/**
 *
 * @author samueldouglasdossantos
 */
public class TelaEscolhaCadLoginPJ extends javax.swing.JFrame {

    /**
     * Creates new form TelaEscolhaCadLoginPJ
     */
    public TelaEscolhaCadLoginPJ() {
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

        javax.swing.JPanel jPanel1 = new javax.swing.JPanel();
        TelaEscolhaLoginCadastre = new javax.swing.JPanel();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        javax.swing.JButton btn_JaPossuiLoginTelaPrincipal = new javax.swing.JButton();
        btn_CadastraSeTelaPrincipal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        TelaEscolhaLoginCadastre.setBackground(new java.awt.Color(19, 20, 39));
        TelaEscolhaLoginCadastre.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Escolha sua opção:");

        btn_JaPossuiLoginTelaPrincipal.setBackground(new java.awt.Color(0, 255, 0));
        btn_JaPossuiLoginTelaPrincipal.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        btn_JaPossuiLoginTelaPrincipal.setText("Acessar");
        btn_JaPossuiLoginTelaPrincipal.setMaximumSize(new java.awt.Dimension(75, 25));
        btn_JaPossuiLoginTelaPrincipal.setMinimumSize(new java.awt.Dimension(75, 25));
        btn_JaPossuiLoginTelaPrincipal.setPreferredSize(new java.awt.Dimension(125, 30));
        btn_JaPossuiLoginTelaPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_JaPossuiLoginTelaPrincipalActionPerformed(evt);
            }
        });

        btn_CadastraSeTelaPrincipal.setBackground(new java.awt.Color(255, 0, 0));
        btn_CadastraSeTelaPrincipal.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        btn_CadastraSeTelaPrincipal.setText("Cadastrar-se");
        btn_CadastraSeTelaPrincipal.setMaximumSize(new java.awt.Dimension(125, 25));
        btn_CadastraSeTelaPrincipal.setMinimumSize(new java.awt.Dimension(125, 25));
        btn_CadastraSeTelaPrincipal.setPreferredSize(new java.awt.Dimension(125, 30));
        btn_CadastraSeTelaPrincipal.setSelected(true);
        btn_CadastraSeTelaPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CadastraSeTelaPrincipalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TelaEscolhaLoginCadastreLayout = new javax.swing.GroupLayout(TelaEscolhaLoginCadastre);
        TelaEscolhaLoginCadastre.setLayout(TelaEscolhaLoginCadastreLayout);
        TelaEscolhaLoginCadastreLayout.setHorizontalGroup(
            TelaEscolhaLoginCadastreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaEscolhaLoginCadastreLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(btn_CadastraSeTelaPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(btn_JaPossuiLoginTelaPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TelaEscolhaLoginCadastreLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(80, 80, 80))
        );
        TelaEscolhaLoginCadastreLayout.setVerticalGroup(
            TelaEscolhaLoginCadastreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaEscolhaLoginCadastreLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addGroup(TelaEscolhaLoginCadastreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_CadastraSeTelaPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_JaPossuiLoginTelaPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(96, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TelaEscolhaLoginCadastre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TelaEscolhaLoginCadastre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_JaPossuiLoginTelaPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_JaPossuiLoginTelaPrincipalActionPerformed
        new LoginPJ_sdi().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_JaPossuiLoginTelaPrincipalActionPerformed

    private void btn_CadastraSeTelaPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CadastraSeTelaPrincipalActionPerformed
        new CadastroPJ_sdi().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_CadastraSeTelaPrincipalActionPerformed

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
            java.util.logging.Logger.getLogger(TelaEscolhaCadLoginPJ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEscolhaCadLoginPJ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEscolhaCadLoginPJ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEscolhaCadLoginPJ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEscolhaCadLoginPJ().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JPanel TelaEscolhaLoginCadastre;
    javax.swing.JButton btn_CadastraSeTelaPrincipal;
    // End of variables declaration//GEN-END:variables
}
