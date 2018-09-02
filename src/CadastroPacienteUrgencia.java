
import java.io.IOException;
import java.io.PrintWriter;


public class CadastroPacienteUrgencia extends javax.swing.JFrame {

    public CadastroPacienteUrgencia() {
        initComponents();
       
        setTitle("Cadastro de Paciente");
        setResizable(false); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnMenuPrincipalPacienteE = new javax.swing.JButton();
        txtEnderecoPacienteE = new javax.swing.JLabel();
        txtAdvertenciaPacienteE = new javax.swing.JLabel();
        txtTelefonePacienteE = new javax.swing.JLabel();
        edtEnderecoPacienteE = new javax.swing.JTextField();
        edtTelefonePacienteE = new javax.swing.JTextField();
        comboEscolhaDocumentoE = new javax.swing.JComboBox<>();
        edtRgcpfPacienteE = new javax.swing.JTextField();
        txtTituloPacienteE = new javax.swing.JLabel();
        jScrollPane1E = new javax.swing.JScrollPane();
        textAreaDescricaoPaciente = new javax.swing.JTextArea();
        txtNomePacienteE = new javax.swing.JLabel();
        txtDescricaoPacienteE = new javax.swing.JLabel();
        btnSalvarPacienteE = new javax.swing.JButton();
        edtNomePacienteE = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnMenuPrincipalPacienteE.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnMenuPrincipalPacienteE.setText("Voltar");
        btnMenuPrincipalPacienteE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuPrincipalPacienteEActionPerformed(evt);
            }
        });

        txtEnderecoPacienteE.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtEnderecoPacienteE.setText("Endereço:*");

        txtAdvertenciaPacienteE.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        txtTelefonePacienteE.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtTelefonePacienteE.setText("Telefone:*");

        edtEnderecoPacienteE.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        edtTelefonePacienteE.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        comboEscolhaDocumentoE.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        comboEscolhaDocumentoE.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "RG", "CPF" }));

        edtRgcpfPacienteE.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        txtTituloPacienteE.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtTituloPacienteE.setText("Dados do Paciente");

        textAreaDescricaoPaciente.setColumns(20);
        textAreaDescricaoPaciente.setRows(5);
        jScrollPane1E.setViewportView(textAreaDescricaoPaciente);

        txtNomePacienteE.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtNomePacienteE.setText("Nome:*");

        txtDescricaoPacienteE.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtDescricaoPacienteE.setText("Descrição:*");

        btnSalvarPacienteE.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnSalvarPacienteE.setText("Salvar");
        btnSalvarPacienteE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarPacienteEActionPerformed(evt);
            }
        });

        edtNomePacienteE.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtTituloPacienteE, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(224, 224, 224))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNomePacienteE)
                            .addComponent(txtEnderecoPacienteE)
                            .addComponent(txtDescricaoPacienteE, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtTelefonePacienteE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(edtNomePacienteE)
                            .addComponent(txtAdvertenciaPacienteE, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSalvarPacienteE, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnMenuPrincipalPacienteE, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(edtEnderecoPacienteE, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
                            .addComponent(jScrollPane1E)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(edtTelefonePacienteE, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(comboEscolhaDocumentoE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(edtRgcpfPacienteE)))
                        .addGap(54, 54, 54))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(txtTituloPacienteE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomePacienteE)
                    .addComponent(edtNomePacienteE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtEnderecoPacienteE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEnderecoPacienteE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtTelefonePacienteE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtRgcpfPacienteE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboEscolhaDocumentoE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefonePacienteE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1E, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDescricaoPacienteE))
                .addGap(43, 43, 43)
                .addComponent(txtAdvertenciaPacienteE, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvarPacienteE, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMenuPrincipalPacienteE, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuPrincipalPacienteEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuPrincipalPacienteEActionPerformed

        Login menu=new Login();
        menu.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btnMenuPrincipalPacienteEActionPerformed

    private void btnSalvarPacienteEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarPacienteEActionPerformed

        String nome= edtNomePacienteE.getText();
        String endereco= edtEnderecoPacienteE.getText();
        String telefone= edtTelefonePacienteE.getText();
        String rgcpf= edtRgcpfPacienteE.getText();
        String descricao= textAreaDescricaoPaciente.getText();

        if(nome.isEmpty()){

            txtAdvertenciaPacienteE.setText("Campos não podem estar vazios");
            edtNomePacienteE.requestFocus();

        }else if(endereco.isEmpty()){

            txtAdvertenciaPacienteE.setText("Campos não podem estar vazios");
            edtEnderecoPacienteE.requestFocus();

        }else if(telefone.isEmpty()){

            txtAdvertenciaPacienteE.setText("Campos não podem estar vazios");
            edtTelefonePacienteE.requestFocus();

        }else if((comboEscolhaDocumentoE.getSelectedItem().toString().equals("RG"))&&(rgcpf.isEmpty())){

            txtAdvertenciaPacienteE.setText("Campo RG não pode estar vazio!");
            edtRgcpfPacienteE.requestFocus();

        }else if((comboEscolhaDocumentoE.getSelectedItem().toString().equals("CPF"))&&(rgcpf.isEmpty())){

            txtAdvertenciaPacienteE.setText("Campo CPF não pode estar vazio!");
            edtRgcpfPacienteE.requestFocus();

        }else if(descricao.isEmpty()){

            txtAdvertenciaPacienteE.setText("Campos não podem estar vazios");
            textAreaDescricaoPaciente.requestFocus();

        }else{

            try {
                // Instância de um Objeto da Class Java(PrintWrite para Gravação do Arquivo").
                    PrintWriter salvaPaciente = new PrintWriter("paciente.txt");
                    // Define o extensão do arquivo que deseja criar.

                    // Captura o Texto dos JTextField.
                    salvaPaciente.println(edtNomePacienteE.getText());
                    salvaPaciente.println(edtEnderecoPacienteE.getText());
                    salvaPaciente.println(edtTelefonePacienteE.getText());
                    salvaPaciente.println(edtRgcpfPacienteE.getText());
                    salvaPaciente.println(textAreaDescricaoPaciente.getText());

                    //fecha arquivo
                    salvaPaciente.close();

                    txtAdvertenciaPacienteE.setText("Paciente cadastrado com Sucesso! ");

                    // limpa campos
                    edtNomePacienteE.setText("");
                    edtEnderecoPacienteE.setText("");
                    edtTelefonePacienteE.setText("");
                    edtRgcpfPacienteE.setText("");
                    textAreaDescricaoPaciente.setText("");

                } catch (IOException Erro) {

                    txtAdvertenciaPacienteE.setText("Erro ao salvar Paciente");

                }

            }

    }//GEN-LAST:event_btnSalvarPacienteEActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroPacienteUrgencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroPacienteUrgencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroPacienteUrgencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroPacienteUrgencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroPacienteUrgencia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMenuPrincipalPacienteE;
    private javax.swing.JButton btnSalvarPacienteE;
    private javax.swing.JComboBox<String> comboEscolhaDocumentoE;
    private javax.swing.JTextField edtEnderecoPacienteE;
    private javax.swing.JTextField edtNomePacienteE;
    private javax.swing.JTextField edtRgcpfPacienteE;
    private javax.swing.JTextField edtTelefonePacienteE;
    private javax.swing.JScrollPane jScrollPane1E;
    private javax.swing.JTextArea textAreaDescricaoPaciente;
    private javax.swing.JLabel txtAdvertenciaPacienteE;
    private javax.swing.JLabel txtDescricaoPacienteE;
    private javax.swing.JLabel txtEnderecoPacienteE;
    private javax.swing.JLabel txtNomePacienteE;
    private javax.swing.JLabel txtTelefonePacienteE;
    private javax.swing.JLabel txtTituloPacienteE;
    // End of variables declaration//GEN-END:variables
}
