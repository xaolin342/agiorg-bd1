/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package forms;

import dao.UsuarioDAO;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import mapper.Usuario;

public class Usuario_form extends javax.swing.JFrame {

    /**
     * Creates new form Usuario_form
     */
    Usuario usuario = new Usuario();

    public Usuario_form(Usuario u) {
        initComponents();
        preencherTabela();
        jB_atualizar.setVisible(false);
        jB_salvar.setVisible(true);
        usuario = u;
    }

//    private Usuario_form() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    public Usuario_form() {
        initComponents();
        preencherTabela();
        jB_atualizar.setVisible(false);
        jB_salvar.setVisible(true);
    }

    public JButton getjB_voltar1() {
        return jB_voltar1;
    }

    public void setjB_voltar1(JButton jB_voltar1) {
        this.jB_voltar1 = jB_voltar1;
    }

    public JButton getjB_voltar2() {
        return jB_voltar2;
    }

    public void setjB_voltar2(JButton jB_voltar2) {
        this.jB_voltar2 = jB_voltar2;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jT_id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jT_nome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jF_cpf = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jT_email = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jF_celular = new javax.swing.JFormattedTextField();
        jB_salvar = new javax.swing.JButton();
        jB_atualizar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jP_senha = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jT_saldo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jB_voltar1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jT_pesquisa = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableUsuario = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jB_voltar2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1200, 700));

        jPanel6.setBackground(new java.awt.Color(0, 102, 51));
        jPanel6.setForeground(new java.awt.Color(0, 153, 0));
        jPanel6.setPreferredSize(new java.awt.Dimension(1200, 66));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Cadastro de Usuários");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(802, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("ID:");

        jT_id.setEditable(false);
        jT_id.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jT_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_idActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Nome:");

        jT_nome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jT_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_nomeActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("CPF:");

        try {
            jF_cpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jF_cpf.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jF_cpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jF_cpfActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("E-mail:");

        jT_email.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jT_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_emailActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Celular:");

        try {
            jF_celular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jF_celular.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jB_salvar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jB_salvar.setText("Salvar");
        jB_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_salvarActionPerformed(evt);
            }
        });

        jB_atualizar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jB_atualizar.setText("Atualizar");
        jB_atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_atualizarActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setText("Cancelar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Senha:");

        jP_senha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Saldo:");

        jT_saldo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jT_saldo.setToolTipText("");
        jT_saldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_saldoActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Sair");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jB_voltar1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jB_voltar1.setText("Voltar ao Menu");
        jB_voltar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_voltar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jB_salvar)
                        .addGap(32, 32, 32)
                        .addComponent(jB_atualizar)
                        .addGap(28, 28, 28)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jB_voltar1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel4))
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jT_saldo, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jT_email, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jF_cpf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                                        .addComponent(jT_nome, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jF_celular, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jT_id, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jP_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel9))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jT_id, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jT_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jF_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jT_email, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jF_celular, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jT_saldo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jP_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB_salvar)
                    .addComponent(jB_atualizar)
                    .addComponent(jButton3)
                    .addComponent(jButton1)
                    .addComponent(jB_voltar1))
                .addGap(86, 86, 86))
        );

        jTabbedPane1.addTab("Cadastro", jPanel1);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Pesquisar nome:");

        jT_pesquisa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jT_pesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_pesquisaActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pesquisar_1.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTableUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTableUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NOME", "CPF", "EMAIL", "CELULAR", "SALDO", "SENHA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableUsuario);

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton5.setText("Novo");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton6.setText("Editar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton7.setText("Excluir");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("Sair");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jB_voltar2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jB_voltar2.setText("Voltar ao Menu");
        jB_voltar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_voltar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6)
                        .addGap(18, 18, 18)
                        .addComponent(jButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jB_voltar2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jT_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 823, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 335, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jT_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton6)
                    .addComponent(jButton7)
                    .addComponent(jButton2)
                    .addComponent(jB_voltar2))
                .addGap(73, 73, 73))
        );

        jTabbedPane1.addTab("Lista de Usuarios", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jT_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_idActionPerformed

    private void jT_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_nomeActionPerformed

    private void jT_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_emailActionPerformed

    //BOTAO SALVAR USUARIO
    private void jB_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_salvarActionPerformed
        Usuario u = new Usuario();
        u.setNome(jT_nome.getText());
        u.setCpf(jF_cpf.getText());
        u.setEmail(jT_email.getText());
        u.setCelular(jF_celular.getText());
        u.setSaldoTotal(Double.parseDouble(jT_saldo.getText()));
        u.setSenha(jP_senha.getText());
        UsuarioDAO udao = new UsuarioDAO();
        udao.cadastrar(u);
        preencherTabela();
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_jB_salvarActionPerformed

    //BOTAO ATUALIZAR
    private void jB_atualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_atualizarActionPerformed
        Usuario u = new Usuario();
        u.setId_usuario(Integer.parseInt(jT_id.getText()));
        u.setNome(jT_nome.getText());
        u.setCpf(jF_cpf.getText());
        u.setEmail(jT_email.getText());
        u.setCelular(jF_celular.getText());
        u.setSaldoTotal(Double.parseDouble(jT_saldo.getText()));
        if (this.getUsuario().getId_usuario() == Integer.parseInt(jT_id.getText())) {
            UsuarioDAO udao = new UsuarioDAO();
            udao.atualizar(u);
            preencherTabela();
            jTabbedPane1.setSelectedIndex(1);
            jB_atualizar.setVisible(false);
            jB_salvar.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Não é possível atualizar cadastro de outro usuário.");
        }
    }//GEN-LAST:event_jB_atualizarActionPerformed

    private void jT_pesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_pesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_pesquisaActionPerformed

    private void jF_cpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jF_cpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jF_cpfActionPerformed

    //BOTAO EDITAR
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        int opcao = jTableUsuario.getSelectedRow();
        //-1 caso nao selecione nada
        if (opcao >= 0) {
            jT_id.setText(jTableUsuario.getValueAt(opcao, 0).toString());
            jT_nome.setText(jTableUsuario.getValueAt(opcao, 1).toString());
            jF_cpf.setText(jTableUsuario.getValueAt(opcao, 2).toString());
            jT_email.setText(jTableUsuario.getValueAt(opcao, 3).toString());
            jF_celular.setText(jTableUsuario.getValueAt(opcao, 4).toString());
            jT_saldo.setText(jTableUsuario.getValueAt(opcao, 5).toString());
            jP_senha.setText(jTableUsuario.getValueAt(opcao, 6).toString());
            jTabbedPane1.setSelectedIndex(0);
            jB_atualizar.setVisible(true);
            jB_salvar.setVisible(false);
            jP_senha.setEditable(false);
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma linha.");
        }

    }//GEN-LAST:event_jButton6ActionPerformed

    //BOTAO EXCLUIR
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        int opcao = jTableUsuario.getSelectedRow();
        //-1 caso nao selecione nada
        if (opcao >= 0) {
            Usuario u = new Usuario();
            u.setId_usuario(Integer.parseInt(jTableUsuario.getValueAt(opcao, 0).toString()));
            u.setNome(jTableUsuario.getValueAt(opcao, 1).toString());
            u.setCpf(jTableUsuario.getValueAt(opcao, 2).toString());
            u.setEmail(jTableUsuario.getValueAt(opcao, 3).toString());
            u.setCelular(jTableUsuario.getValueAt(opcao, 4).toString());
            u.setSaldoTotal(Double.parseDouble(jTableUsuario.getValueAt(opcao, 5).toString()));
            u.setSenha(jTableUsuario.getValueAt(opcao, 6).toString());

            if (this.getUsuario().getId_usuario() == (Integer.parseInt(jTableUsuario.getValueAt(opcao, 0).toString()))) {
                UsuarioDAO udao = new UsuarioDAO();
                udao.excluir(u);
                preencherTabela();
            } else {
                JOptionPane.showMessageDialog(null, "Não é possível excluir outro usuário.");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma linha.");
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    //BOTAO CANCELAR
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jT_id.setText("");
        jT_nome.setText("");
        jF_cpf.setText("");
        jT_email.setText("");
        jF_celular.setText("");
        jT_saldo.setText("");
        jP_senha.setText("");

        jB_atualizar.setVisible(false);
        jB_salvar.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    //BOTAO NOVO
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jT_id.setText("");
        jT_nome.setText("");
        jF_cpf.setText("");
        jT_email.setText("");
        jF_celular.setText("");
        jT_saldo.setText("");
        jP_senha.setText("");
        jP_senha.setEditable(true);

        jB_atualizar.setVisible(false);
        jB_salvar.setVisible(true);
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jT_saldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_saldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_saldoActionPerformed

    //BOTAO SAIR USUARIO
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    //BOTAO VOLTAR AO MENU USUARIO
    private void jB_voltar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_voltar1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jB_voltar1ActionPerformed

    //BOTAO VOLTAR AO MENU LISTA DE USUARIOS
    private void jB_voltar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_voltar2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jB_voltar2ActionPerformed

    //BOTAO SAIR LISTA DE USUARIO
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    //BOTAO PESQUISAR USUARIO
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        preencherTabelaNome(jT_pesquisa.getText());
    }//GEN-LAST:event_jButton4ActionPerformed

    public void preencherTabela() {
        UsuarioDAO udao = new UsuarioDAO();
        List<Usuario> lista = udao.listarTodos();
        DefaultTableModel modeloTabela = (DefaultTableModel) jTableUsuario.getModel();
        modeloTabela.setRowCount(0);
        for (Usuario u : lista) {
            modeloTabela.addRow(new Object[]{u.getId_usuario(), u.getNome(), u.getCpf(), u.getEmail(), u.getCelular(), u.getSaldoTotal(), u.getSenha()});
        }
    }

    public void preencherTabelaNome(String nome) {
        UsuarioDAO udao = new UsuarioDAO();
        List<Usuario> lista = udao.pesquisar(nome);
        DefaultTableModel modeloTabela = (DefaultTableModel) jTableUsuario.getModel();
        modeloTabela.setRowCount(0);
        for (Usuario u : lista) {
            modeloTabela.addRow(new Object[]{u.getId_usuario(), u.getNome(), u.getCpf(), u.getEmail(), u.getCelular(), u.getSaldoTotal(), u.getSenha()});
        }
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

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
            java.util.logging.Logger.getLogger(ContasPagar_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ContasPagar_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ContasPagar_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ContasPagar_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Usuario_form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_atualizar;
    private javax.swing.JButton jB_salvar;
    private javax.swing.JButton jB_voltar1;
    private javax.swing.JButton jB_voltar2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JFormattedTextField jF_celular;
    private javax.swing.JFormattedTextField jF_cpf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jP_senha;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jT_email;
    private javax.swing.JTextField jT_id;
    private javax.swing.JTextField jT_nome;
    private javax.swing.JTextField jT_pesquisa;
    private javax.swing.JTextField jT_saldo;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableUsuario;
    // End of variables declaration//GEN-END:variables
}