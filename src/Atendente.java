
import java.io.IOException;
import java.io.PrintWriter;



public class Atendente extends javax.swing.JFrame {
    


   
    public Atendente() {
        initComponents();
        
        setTitle("Atendente");
        setResizable(false);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNomePaciente = new javax.swing.JLabel();
        txtDescricaoPaciente = new javax.swing.JLabel();
        txtEnderecoPaciente = new javax.swing.JLabel();
        txtTelefonePaciente = new javax.swing.JLabel();
        edtEnderecoPaciente = new javax.swing.JTextField();
        edtTelefonePaciente = new javax.swing.JTextField();
        edtRgcpfPaciente = new javax.swing.JTextField();
        txtTituloPaciente = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaDescricaoPaciente = new javax.swing.JTextArea();
        btnSalvarPaciente = new javax.swing.JButton();
        btnMenuPrincipalPaciente = new javax.swing.JButton();
        txtAdvertenciaPaciente = new javax.swing.JLabel();
        edtNomePaciente = new javax.swing.JTextField();
        comboEscolhaDocumento = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtNomePaciente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtNomePaciente.setText("Nome:*");

        txtDescricaoPaciente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtDescricaoPaciente.setText("Descrição:*");

        txtEnderecoPaciente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtEnderecoPaciente.setText("Endereço:*");

        txtTelefonePaciente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtTelefonePaciente.setText("Telefone:*");

        edtEnderecoPaciente.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        edtTelefonePaciente.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        edtRgcpfPaciente.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        txtTituloPaciente.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtTituloPaciente.setText("Dados do Paciente");

        textAreaDescricaoPaciente.setColumns(20);
        textAreaDescricaoPaciente.setRows(5);
        jScrollPane1.setViewportView(textAreaDescricaoPaciente);

        btnSalvarPaciente.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnSalvarPaciente.setText("Salvar");
        btnSalvarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarPacienteActionPerformed(evt);
            }
        });

        btnMenuPrincipalPaciente.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnMenuPrincipalPaciente.setText("Menu Principal");
        btnMenuPrincipalPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuPrincipalPacienteActionPerformed(evt);
            }
        });

        txtAdvertenciaPaciente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        edtNomePaciente.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        comboEscolhaDocumento.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        comboEscolhaDocumento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "RG", "CPF" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtTituloPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(224, 224, 224))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNomePaciente)
                            .addComponent(txtEnderecoPaciente)
                            .addComponent(txtDescricaoPaciente, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtTelefonePaciente))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(edtNomePaciente)
                            .addComponent(txtAdvertenciaPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSalvarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnMenuPrincipalPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(edtEnderecoPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(edtTelefonePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(comboEscolhaDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(edtRgcpfPaciente)))
                        .addGap(54, 54, 54))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(txtTituloPaciente)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomePaciente)
                    .addComponent(edtNomePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtEnderecoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEnderecoPaciente))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtTelefonePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtRgcpfPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboEscolhaDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefonePaciente))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDescricaoPaciente))
                .addGap(43, 43, 43)
                .addComponent(txtAdvertenciaPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMenuPrincipalPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarPacienteActionPerformed
        
       String nome= edtNomePaciente.getText(); 
       String endereco= edtEnderecoPaciente.getText();
       String telefone= edtTelefonePaciente.getText();
       String rgcpf= edtRgcpfPaciente.getText();
       String descricao= textAreaDescricaoPaciente.getText();
       
       
       if(nome.isEmpty()){
           
           txtAdvertenciaPaciente.setText("Campos não podem estar vazios");
           edtNomePaciente.requestFocus();
           
       }else if(endereco.isEmpty()){
           
            txtAdvertenciaPaciente.setText("Campos não podem estar vazios");
            edtEnderecoPaciente.requestFocus();
           
       }else if(telefone.isEmpty()){
           
            txtAdvertenciaPaciente.setText("Campos não podem estar vazios");
            edtTelefonePaciente.requestFocus();
           
       }else if((comboEscolhaDocumento.getSelectedItem().toString().equals("RG"))&&(rgcpf.isEmpty())){ 
           
            txtAdvertenciaPaciente.setText("Campo RG não pode estar vazio!");
            edtRgcpfPaciente.requestFocus();
           
       }else if((comboEscolhaDocumento.getSelectedItem().toString().equals("CPF"))&&(rgcpf.isEmpty())){ 
           
            txtAdvertenciaPaciente.setText("Campo CPF não pode estar vazio!");
            edtRgcpfPaciente.requestFocus();
           
       }else if(descricao.isEmpty()){
           
            txtAdvertenciaPaciente.setText("Campos não podem estar vazios");
            textAreaDescricaoPaciente.requestFocus();
           
       }else{
           
            try {
			// Instância de um Objeto da Class Java(PrintWrite para Gravação do Arquivo").
			PrintWriter salvaPaciente = new PrintWriter("paciente.txt");
                         // Define o extensão do arquivo que deseja criar.
 
			// Captura o Texto dos JTextField.
			salvaPaciente.println(edtNomePaciente.getText());
			salvaPaciente.println(edtEnderecoPaciente.getText());
                        salvaPaciente.println(edtTelefonePaciente.getText());
                        salvaPaciente.println(edtRgcpfPaciente.getText());
                        salvaPaciente.println(textAreaDescricaoPaciente.getText());
                                               
                        //fecha arquivo
                        salvaPaciente.close();
                        
                        txtAdvertenciaPaciente.setText("Paciente cadastrado com Sucesso! ");
                        
                        // limpa campos
                        edtNomePaciente.setText("");
                        edtEnderecoPaciente.setText("");
                        edtTelefonePaciente.setText("");
                        edtRgcpfPaciente.setText("");
                        textAreaDescricaoPaciente.setText("");
                        
 
	        } catch (IOException Erro) {
						
                    txtAdvertenciaPaciente.setText("Erro ao salvar Paciente");
                    
		}
           
         
       }
     
    }//GEN-LAST:event_btnSalvarPacienteActionPerformed

    private void btnMenuPrincipalPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuPrincipalPacienteActionPerformed
       
        MenuPrincipal voltarP=new MenuPrincipal();
        voltarP.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_btnMenuPrincipalPacienteActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Atendente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMenuPrincipalPaciente;
    private javax.swing.JButton btnSalvarPaciente;
    private javax.swing.JComboBox<String> comboEscolhaDocumento;
    private javax.swing.JTextField edtEnderecoPaciente;
    private javax.swing.JTextField edtNomePaciente;
    private javax.swing.JTextField edtRgcpfPaciente;
    private javax.swing.JTextField edtTelefonePaciente;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea textAreaDescricaoPaciente;
    private javax.swing.JLabel txtAdvertenciaPaciente;
    private javax.swing.JLabel txtDescricaoPaciente;
    private javax.swing.JLabel txtEnderecoPaciente;
    private javax.swing.JLabel txtNomePaciente;
    private javax.swing.JLabel txtTelefonePaciente;
    private javax.swing.JLabel txtTituloPaciente;
    // End of variables declaration//GEN-END:variables
}
