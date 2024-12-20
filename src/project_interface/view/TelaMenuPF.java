/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project_interface.view;

import javax.swing.JOptionPane;
import project_interface.model.Produto;
import project_interface.util.BDprodutoPJ;

/**
 *
 * @author samueldouglasdossantos
 */
public class TelaMenuPF extends javax.swing.JFrame {

    /**
     * Creates new form TelaMenuPF
     */
    public TelaMenuPF() {
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

        TextPreço = new javax.swing.JPanel();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        javax.swing.JButton btnComprarProdutoDaListaPF = new javax.swing.JButton();
        btnDeADDProdutoNaListaPF = new javax.swing.JButton();
        javax.swing.JLabel textenomeproduto = new javax.swing.JLabel();
        javax.swing.JLabel texquantidade = new javax.swing.JLabel();
        campoTelaProdutoVendaDeNomeDoProdutoPF = new javax.swing.JTextField();
        campoTelaVendaProdutoQuantidadeDoProdutoPF = new javax.swing.JTextField();
        javax.swing.JButton btnAPagarProdutoDaListaPF = new javax.swing.JButton();
        javax.swing.JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
        javax.swing.JTable TelaDeVendatabelaDeComprarDaPessoaFisica = new javax.swing.JTable();
        javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel3 = new javax.swing.JLabel();
        javax.swing.JScrollPane jScrollPane2 = new javax.swing.JScrollPane();
        javax.swing.JTable tabelaDeProdutosNoEstoqueParaVendaPF = new javax.swing.JTable();
        javax.swing.JMenuBar jMenuBar1 = new javax.swing.JMenuBar();
        javax.swing.JMenu jMenu1 = new javax.swing.JMenu();
        javax.swing.JMenuItem jMenuItem1 = new javax.swing.JMenuItem();
        javax.swing.JMenuItem jMenuItem9 = new javax.swing.JMenuItem();
        javax.swing.JMenuItem sairTelaMenuPF = new javax.swing.JMenuItem();
        javax.swing.JMenu jMenu5 = new javax.swing.JMenu();
        javax.swing.JMenuItem jMenuItem11 = new javax.swing.JMenuItem();
        javax.swing.JMenuItem jMenuItem12 = new javax.swing.JMenuItem();
        javax.swing.JMenu jMenu2 = new javax.swing.JMenu();
        javax.swing.JMenuItem jMenuItem3 = new javax.swing.JMenuItem();
        javax.swing.JMenuItem jMenuItem4 = new javax.swing.JMenuItem();
        javax.swing.JMenuItem jMenuItem5 = new javax.swing.JMenuItem();
        javax.swing.JMenu jMenu4 = new javax.swing.JMenu();
        javax.swing.JMenuItem jMenuItem6 = new javax.swing.JMenuItem();
        javax.swing.JMenuItem jMenuItem7 = new javax.swing.JMenuItem();
        javax.swing.JMenuItem jMenuItem8 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        TextPreço.setBackground(new java.awt.Color(19, 20, 39));
        TextPreço.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sua Lista:");

        btnComprarProdutoDaListaPF.setBackground(new java.awt.Color(0, 255, 0));
        btnComprarProdutoDaListaPF.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        btnComprarProdutoDaListaPF.setText("Comprar");
        btnComprarProdutoDaListaPF.setMaximumSize(new java.awt.Dimension(75, 25));
        btnComprarProdutoDaListaPF.setMinimumSize(new java.awt.Dimension(75, 25));
        btnComprarProdutoDaListaPF.setPreferredSize(new java.awt.Dimension(125, 30));
        btnComprarProdutoDaListaPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarProdutoDaListaPFActionPerformed(evt);
            }
        });

        btnDeADDProdutoNaListaPF.setBackground(new java.awt.Color(0, 255, 0));
        btnDeADDProdutoNaListaPF.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        btnDeADDProdutoNaListaPF.setText("Adicionor Produto ");
        btnDeADDProdutoNaListaPF.setMaximumSize(new java.awt.Dimension(125, 25));
        btnDeADDProdutoNaListaPF.setMinimumSize(new java.awt.Dimension(125, 25));
        btnDeADDProdutoNaListaPF.setPreferredSize(new java.awt.Dimension(125, 30));
        btnDeADDProdutoNaListaPF.setSelected(true);
        btnDeADDProdutoNaListaPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeADDProdutoNaListaPFActionPerformed(evt);
            }
        });

        textenomeproduto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textenomeproduto.setForeground(new java.awt.Color(255, 255, 255));
        textenomeproduto.setText("Nome do Produto:");

        texquantidade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        texquantidade.setForeground(new java.awt.Color(255, 255, 255));
        texquantidade.setText("Quantidade:");

        campoTelaProdutoVendaDeNomeDoProdutoPF.setText("Informe o nome do produto:");
        campoTelaProdutoVendaDeNomeDoProdutoPF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoTelaProdutoVendaDeNomeDoProdutoPFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoTelaProdutoVendaDeNomeDoProdutoPFFocusLost(evt);
            }
        });
        campoTelaProdutoVendaDeNomeDoProdutoPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTelaProdutoVendaDeNomeDoProdutoPFActionPerformed(evt);
            }
        });

        campoTelaVendaProdutoQuantidadeDoProdutoPF.setText("Informe a quantidade:");
        campoTelaVendaProdutoQuantidadeDoProdutoPF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoTelaVendaProdutoQuantidadeDoProdutoPFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoTelaVendaProdutoQuantidadeDoProdutoPFFocusLost(evt);
            }
        });

        btnAPagarProdutoDaListaPF.setBackground(new java.awt.Color(204, 102, 0));
        btnAPagarProdutoDaListaPF.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        btnAPagarProdutoDaListaPF.setText("Apagar produto");
        btnAPagarProdutoDaListaPF.setMaximumSize(new java.awt.Dimension(75, 25));
        btnAPagarProdutoDaListaPF.setMinimumSize(new java.awt.Dimension(75, 25));
        btnAPagarProdutoDaListaPF.setPreferredSize(new java.awt.Dimension(125, 30));
        btnAPagarProdutoDaListaPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAPagarProdutoDaListaPFActionPerformed(evt);
            }
        });

        TelaDeVendatabelaDeComprarDaPessoaFisica.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Produto:", "Preço:"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TelaDeVendatabelaDeComprarDaPessoaFisica);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Produtos a venda:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Produtos a venda:");

        tabelaDeProdutosNoEstoqueParaVendaPF.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Empresa:", "Produto:", "Preço:"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabelaDeProdutosNoEstoqueParaVendaPF);

        javax.swing.GroupLayout TextPreçoLayout = new javax.swing.GroupLayout(TextPreço);
        TextPreço.setLayout(TextPreçoLayout);
        TextPreçoLayout.setHorizontalGroup(
            TextPreçoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TextPreçoLayout.createSequentialGroup()
                .addGroup(TextPreçoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TextPreçoLayout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addGroup(TextPreçoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textenomeproduto)
                            .addComponent(texquantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TextPreçoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(TextPreçoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDeADDProdutoNaListaPF, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(76, 76, 76)))
                .addGroup(TextPreçoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TextPreçoLayout.createSequentialGroup()
                        .addGroup(TextPreçoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoTelaProdutoVendaDeNomeDoProdutoPF, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoTelaVendaProdutoQuantidadeDoProdutoPF, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(TextPreçoLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(btnComprarProdutoDaListaPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addComponent(btnAPagarProdutoDaListaPF, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TextPreçoLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(124, 124, 124))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TextPreçoLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
            .addGroup(TextPreçoLayout.createSequentialGroup()
                .addGap(370, 370, 370)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TextPreçoLayout.setVerticalGroup(
            TextPreçoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TextPreçoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(TextPreçoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textenomeproduto, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoTelaProdutoVendaDeNomeDoProdutoPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(TextPreçoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(texquantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoTelaVendaProdutoQuantidadeDoProdutoPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(TextPreçoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnComprarProdutoDaListaPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeADDProdutoNaListaPF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAPagarProdutoDaListaPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(TextPreçoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(TextPreçoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_interface/images/loginicon(1).png"))); // NOI18N
        jMenu1.setText("Usuário");

        jMenuItem1.setText("Cadastre-se");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem9.setText("Esqueci minha senha");
        jMenu1.add(jMenuItem9);

        sairTelaMenuPF.setText("Sair");
        sairTelaMenuPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairTelaMenuPFActionPerformed(evt);
            }
        });
        jMenu1.add(sairTelaMenuPF);

        jMenuBar1.add(jMenu1);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_interface/images/P.J.png"))); // NOI18N
        jMenu5.setText("Pessoa Jurídica");

        jMenuItem11.setText("Cadastre-se");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem11);

        jMenuItem12.setText("Login");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem12);

        jMenuBar1.add(jMenu5);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_interface/images/contact(1).png"))); // NOI18N
        jMenu2.setText("Contato");

        jMenuItem3.setText("Telefone");
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("WhatsApp");
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("Email");
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_interface/images/sobreicon.png"))); // NOI18N
        jMenu4.setText("Sobre");

        jMenuItem6.setText("Atualizações");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem6);

        jMenuItem7.setText("Descontos");
        jMenu4.add(jMenuItem7);

        jMenuItem8.setText("Novas integrações");
        jMenu4.add(jMenuItem8);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TextPreço, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TextPreço, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnComprarProdutoDaListaPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarProdutoDaListaPFActionPerformed

    }//GEN-LAST:event_btnComprarProdutoDaListaPFActionPerformed

    private void btnDeADDProdutoNaListaPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeADDProdutoNaListaPFActionPerformed
        try {
                String nome = campoTelaProdutoVendaDeNomeDoProdutoPF.getText();
                double preco = Double.parseDouble(precoField.getText());
                int quantidade = Integer.parseInt(quantidadeField.getText());

                Produto produto = new Produto(nome, preco, quantidade);
                produtoDAO.inserirProduto(produto);

                JOptionPane.showMessageDialog(frame, "Produto adicionado com sucesso!");
                atualizarTabela(tabela);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Por favor, insira valores válidos.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
    }//GEN-LAST:event_btnDeADDProdutoNaListaPFActionPerformed

    private void campoTelaProdutoVendaDeNomeDoProdutoPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTelaProdutoVendaDeNomeDoProdutoPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTelaProdutoVendaDeNomeDoProdutoPFActionPerformed

    private void btnAPagarProdutoDaListaPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAPagarProdutoDaListaPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAPagarProdutoDaListaPFActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void sairTelaMenuPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairTelaMenuPFActionPerformed
        this.dispose();
    }//GEN-LAST:event_sairTelaMenuPFActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void campoTelaProdutoVendaDeNomeDoProdutoPFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoTelaProdutoVendaDeNomeDoProdutoPFFocusGained
        if (campoTelaProdutoVendaDeNomeDoProdutoPF.getText().equals("Informe o nome do produto:")){
            campoTelaProdutoVendaDeNomeDoProdutoPF.setText("");
        }
    }//GEN-LAST:event_campoTelaProdutoVendaDeNomeDoProdutoPFFocusGained

    private void campoTelaVendaProdutoQuantidadeDoProdutoPFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoTelaVendaProdutoQuantidadeDoProdutoPFFocusGained
        if (campoTelaVendaProdutoQuantidadeDoProdutoPF.getText().equals("Informe a quantidade:")){
            campoTelaVendaProdutoQuantidadeDoProdutoPF.setText("");
        }
    }//GEN-LAST:event_campoTelaVendaProdutoQuantidadeDoProdutoPFFocusGained

    private void campoTelaProdutoVendaDeNomeDoProdutoPFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoTelaProdutoVendaDeNomeDoProdutoPFFocusLost
        if (campoTelaProdutoVendaDeNomeDoProdutoPF.getText().isEmpty()){
            campoTelaProdutoVendaDeNomeDoProdutoPF.setText("Informe o nome do produto:");
        }
    }//GEN-LAST:event_campoTelaProdutoVendaDeNomeDoProdutoPFFocusLost

    private void campoTelaVendaProdutoQuantidadeDoProdutoPFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoTelaVendaProdutoQuantidadeDoProdutoPFFocusLost
        if (campoTelaVendaProdutoQuantidadeDoProdutoPF.getText().isEmpty()){
            campoTelaVendaProdutoQuantidadeDoProdutoPF.setText("Informe a quantidade:");
        }
    }//GEN-LAST:event_campoTelaVendaProdutoQuantidadeDoProdutoPFFocusLost

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
            java.util.logging.Logger.getLogger(TelaMenuPF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMenuPF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMenuPF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMenuPF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMenuPF().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JPanel TextPreço;
    javax.swing.JButton btnDeADDProdutoNaListaPF;
    javax.swing.JTextField campoTelaProdutoVendaDeNomeDoProdutoPF;
    javax.swing.JTextField campoTelaVendaProdutoQuantidadeDoProdutoPF;
    // End of variables declaration//GEN-END:variables
}
