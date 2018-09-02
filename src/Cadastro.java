
import java.io.IOException;
import java.io.PrintWriter;


public class Cadastro extends javax.swing.JFrame {

    //--------------------------------------------------------------------------------------------------------------------
    
    //Atibutos 
    
    String usuario, senha, nome, endereco, telefone, email, rg, cpf, funcao, coren, crm;
    
    //---------------------------------------------------------------------------------------------------------------------
    
    // construtor
    public Cadastro() {
        initComponents();
        
        setTitle("Cadastro");
        setResizable(false);
    }
    
    //------------------------------------------------------------------------------------------------------------------------
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        edtCadastroSenha = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        edtCadastroEndereco = new javax.swing.JTextField();
        edtCadastroTelefone = new javax.swing.JTextField();
        edtCadastroEmail = new javax.swing.JTextField();
        edtCadastroCpf = new javax.swing.JTextField();
        edtCadastroCrm = new javax.swing.JTextField();
        btnMenuPrincipal = new javax.swing.JButton();
        btnCadastrarPrincipal = new javax.swing.JButton();
        txtAdvertenciaCadastro = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        edtCadastroCoren = new javax.swing.JTextField();
        comboBoxCadastroFuncao = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        edtCadastroRg = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        edtCadastroUsuario = new javax.swing.JTextField();
        edtCadastroNome = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("Usuário:*");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Senha:*");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Nome:*");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("E-mail:");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("CPF:*");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setText("Função:*");

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setText("CRM:*");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel9.setText("Endereço:*");

        jLabel10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel10.setText("Telefone:*");

        btnMenuPrincipal.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnMenuPrincipal.setText("Menu Principal");
        btnMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuPrincipalActionPerformed(evt);
            }
        });

        btnCadastrarPrincipal.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnCadastrarPrincipal.setText("Salvar");
        btnCadastrarPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarPrincipalActionPerformed(evt);
            }
        });

        txtAdvertenciaCadastro.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel11.setText("Campo obrigatório apenas para função Enfermeiro ou médico");

        jLabel12.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel12.setText("COREN:*");

        comboBoxCadastroFuncao.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        comboBoxCadastroFuncao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Médico", "Enfermeiro", "Atendente" }));

        jLabel13.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel13.setText("RG:*");

        jLabel14.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel14.setText("Cadastro de Usuários");

        edtCadastroUsuario.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        edtCadastroNome.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(229, 229, 229))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(30, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel9)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(edtCadastroEmail)
                    .addComponent(edtCadastroEndereco)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCadastrarPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(edtCadastroCrm, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(comboBoxCadastroFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(edtCadastroCpf, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel10)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(edtCadastroCoren, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                            .addComponent(edtCadastroTelefone)
                            .addComponent(edtCadastroRg)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(edtCadastroUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(edtCadastroSenha))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(486, 486, 486)
                        .addComponent(jLabel7))
                    .addComponent(jLabel11)
                    .addComponent(txtAdvertenciaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtCadastroNome))
                .addGap(0, 67, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel7)
                .addGap(21, 21, 21)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtCadastroSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(edtCadastroUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(edtCadastroNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtCadastroEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtCadastroEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtCadastroCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel13)
                    .addComponent(edtCadastroRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel10)
                                .addComponent(edtCadastroTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(edtCadastroCrm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12)
                                .addComponent(edtCadastroCoren, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addGap(17, 17, 17)
                        .addComponent(txtAdvertenciaCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCadastrarPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(comboBoxCadastroFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //---------------------------------------------------------------------------------------------------------------------
    // Botão para returno ao menu principal
    private void btnMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuPrincipalActionPerformed
        MenuPrincipal voltar=new MenuPrincipal();
        voltar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnMenuPrincipalActionPerformed
    //---------------------------------------------------------------------------------------------------------------------
    
    //------------------------------------------------------------------------------------------------------------------------
    // Botão para salvar dados do cadastro de usuário
    private void btnCadastrarPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarPrincipalActionPerformed
        
                usuario = edtCadastroUsuario.getText().toUpperCase();
                senha = edtCadastroSenha.getText().toUpperCase();
                nome = edtCadastroNome.getText().toUpperCase();
                endereco = edtCadastroEndereco.getText().toUpperCase();
                telefone = edtCadastroTelefone.getText().toUpperCase();
                email = edtCadastroEmail.getText().toUpperCase();
                rg = edtCadastroRg.getText().toUpperCase();
                cpf = edtCadastroCpf.getText().toUpperCase();
                crm = edtCadastroCrm.getText().toUpperCase();
                coren = edtCadastroCoren.getText().toUpperCase();
                
                
                // validação campos vazios
                
                 if (usuario.isEmpty()) {
                     
                    txtAdvertenciaCadastro.setText("Certifique-se que os campos de preenchimento obrigatório não estejam vazios!");
                    edtCadastroUsuario.requestFocus();
                    
                } else if (senha.isEmpty()) {
					
                    txtAdvertenciaCadastro.setText("Certifique-se que os campos de preenchimento obrigatório não estejam vazios!");
                    edtCadastroSenha.requestFocus();
                    
		} else if (nome.isEmpty()) {
					
                    txtAdvertenciaCadastro.setText("Certifique-se que os campos de preenchimento obrigatório não estejam vazios!");
                    edtCadastroNome.requestFocus();
                    
		} else if (endereco.isEmpty()) {
					
                    txtAdvertenciaCadastro.setText("Certifique-se que os campos de preenchimento obrigatório não estejam vazios!");
                    edtCadastroEndereco.requestFocus();
                    
                } else if (telefone.isEmpty()) {
					
                    txtAdvertenciaCadastro.setText("Certifique-se que os campos de preenchimento obrigatório não estejam vazios!");
                    edtCadastroTelefone.requestFocus();
                    
                }else if (rg.isEmpty()) {
					
                    txtAdvertenciaCadastro.setText("Certifique-se que os campos de preenchimento obrigatório não estejam vazios!");
                     edtCadastroRg.requestFocus();
                    
                }else if (cpf.isEmpty()) {
					
                    txtAdvertenciaCadastro.setText("Certifique-se que os campos de preenchimento obrigatório não estejam vazios!");
                    edtCadastroCpf.requestFocus();
                    
                } else {

                    if(comboBoxCadastroFuncao.getSelectedItem().toString().equals("Atendente")){
                    
                         if ((crm.isEmpty())&&(coren.isEmpty())) {
							
                           autenticacaoUsuarioCadastrado();
                        
			} else {
							
                            txtAdvertenciaCadastro.setText("Campo CRM e COREN não pode ser preenchido para esta função!");
							
                        }
                
                    }else if(comboBoxCadastroFuncao.getSelectedItem().toString().equals("Enfermeiro")){
                    
                         if ((crm.isEmpty())&&((coren.isEmpty())==false)) {
							
                           autenticacaoUsuarioCadastrado();
                        
			} else {
							
                            txtAdvertenciaCadastro.setText("Certifique-se que o COREN esteja preenchido e que o CRM não esteja!");
							
                        }
                
                    }else if(comboBoxCadastroFuncao.getSelectedItem().toString().equals("Médico")){
                    
                         if (((crm.isEmpty())==false)&&(coren.isEmpty())) {
							
                           autenticacaoUsuarioCadastrado();
                        
			} else {
							
                            txtAdvertenciaCadastro.setText("Certifique-se que o CRM esteja preenchido e que o COREN não esteja!");
							
                        }
                
                    } 
                    

               }  
                      
        
    }//GEN-LAST:event_btnCadastrarPrincipalActionPerformed

    //--------------------------------------------------------------------------------------------------------------------------------
    
    //--------------------------------------------------------------------------------------------------------------------------
    // Método principal
      public static void main(String args[]) {
          
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro().setVisible(true);
                
            }
           
        });
    }
     
    //----------------------------------------------------------------------------------------------------------------------------  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarPrincipal;
    private javax.swing.JButton btnMenuPrincipal;
    private javax.swing.JComboBox<String> comboBoxCadastroFuncao;
    private javax.swing.JTextField edtCadastroCoren;
    private javax.swing.JTextField edtCadastroCpf;
    private javax.swing.JTextField edtCadastroCrm;
    private javax.swing.JTextField edtCadastroEmail;
    private javax.swing.JTextField edtCadastroEndereco;
    private javax.swing.JTextField edtCadastroNome;
    private javax.swing.JTextField edtCadastroRg;
    private javax.swing.JTextField edtCadastroSenha;
    private javax.swing.JTextField edtCadastroTelefone;
    private javax.swing.JTextField edtCadastroUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel txtAdvertenciaCadastro;
    // End of variables declaration//GEN-END:variables

    //------------------------------------------------------------------------------------------------------------------------
    // Método para autenticação de cadastro 
    public void autenticacaoUsuarioCadastrado()
    {
        
        
        if(comboBoxCadastroFuncao.getSelectedItem().toString().equals("Atendente")){  ////Atendente
            
            try {
			// Instância de um Objeto da Class Java(PrintWrite para Gravação do Arquivo").
			PrintWriter salvaAtendente = new PrintWriter(edtCadastroUsuario.getText()+".txt");
                         // Define o extensão do arquivo que deseja criar.
 
			// Captura o Texto dos JTextField.
			salvaAtendente.println(edtCadastroUsuario.getText());
			salvaAtendente.println(edtCadastroSenha.getText());
                        salvaAtendente.println(edtCadastroNome.getText());
                        salvaAtendente.println(edtCadastroEndereco.getText());
                        salvaAtendente.println(edtCadastroTelefone.getText());
                        salvaAtendente.println(edtCadastroEmail.getText());
                        salvaAtendente.println(edtCadastroRg.getText());
                        salvaAtendente.println(edtCadastroCpf.getText());
                        salvaAtendente.println(comboBoxCadastroFuncao.getSelectedItem().toString());
                       
                        //fecha arquivo
                        salvaAtendente.close();
                        
                        txtAdvertenciaCadastro.setText("Usuário cadastrado com Sucesso! ");
                        
                        // limpa campos
                        edtCadastroUsuario.setText("");
                        edtCadastroSenha.setText("");
                        edtCadastroNome.setText("");
                        edtCadastroEndereco.setText("");
                        edtCadastroTelefone.setText("");
                        edtCadastroEmail.setText("");
                        edtCadastroRg.setText("");
                        edtCadastroCpf.setText("");
                        
 
	        } catch (IOException Erro) {
						
                    txtAdvertenciaCadastro.setText("Erro ao salvar usuário");
                    
		}
            
        }else if(comboBoxCadastroFuncao.getSelectedItem().toString().equals("Enfermeiro")){  // Enfermeiro
            
            try {
			// Instância de um Objeto da Class Java(PrintWrite para Gravação do Arquivo").
			PrintWriter salvaEnfermeiro = new PrintWriter(edtCadastroUsuario.getText()+ ".txt");
                         // Define o extensão do arquivo que deseja criar.
 
			// Captura o Texto dos JTextField.
			salvaEnfermeiro.println(edtCadastroUsuario.getText());
			salvaEnfermeiro.println(edtCadastroSenha.getText());
                        salvaEnfermeiro.println(edtCadastroNome.getText());
                        salvaEnfermeiro.println(edtCadastroEndereco.getText());
                        salvaEnfermeiro.println(edtCadastroTelefone.getText());
                        salvaEnfermeiro.println(edtCadastroEmail.getText());
                        salvaEnfermeiro.println(edtCadastroRg.getText());
                        salvaEnfermeiro.println(edtCadastroCpf.getText());
                        salvaEnfermeiro.println(comboBoxCadastroFuncao.getSelectedItem().toString());
                        salvaEnfermeiro.println(edtCadastroCoren.getText());
                        
                       
                        //fecha arquivo
                        salvaEnfermeiro.close();
                        
                        txtAdvertenciaCadastro.setText("Usuário cadastrado com Sucesso! ");
                        
                        // limpa campos
                        edtCadastroUsuario.setText("");
                        edtCadastroSenha.setText("");
                        edtCadastroNome.setText("");
                        edtCadastroEndereco.setText("");
                        edtCadastroTelefone.setText("");
                        edtCadastroEmail.setText("");
                        edtCadastroRg.setText("");
                        edtCadastroCpf.setText("");
                        edtCadastroCoren.setText("");
                        
                        
 
	        } catch (IOException Erro) {
						
                    txtAdvertenciaCadastro.setText("Erro ao salvar usuário!");
                    
		}
            
        }else if(comboBoxCadastroFuncao.getSelectedItem().toString().equals("Médico")){  /// Medico
            
            try {
			// Instância de um Objeto da Class Java(PrintWrite para Gravação do Arquivo").
			PrintWriter salvaMedico = new PrintWriter(edtCadastroUsuario.getText()+ ".txt");
                         // Define o extensão do arquivo que deseja criar.
 
			// Captura o Texto dos JTextField.
			salvaMedico.println(edtCadastroUsuario.getText());
			salvaMedico.println(edtCadastroSenha.getText());
                        salvaMedico.println(edtCadastroNome.getText());
                        salvaMedico.println(edtCadastroEndereco.getText());
                        salvaMedico.println(edtCadastroTelefone.getText());
                        salvaMedico.println(edtCadastroEmail.getText());
                        salvaMedico.println(edtCadastroRg.getText());
                        salvaMedico.println(edtCadastroCpf.getText());
                        salvaMedico.println(comboBoxCadastroFuncao.getSelectedItem().toString());
                        salvaMedico.println(edtCadastroCrm.getText());
                        
                       
                        //fecha arquivo
                        salvaMedico.close();
                        
                        txtAdvertenciaCadastro.setText("Usuário cadastrado com Sucesso! ");
                        
                        // limpa campos
                        edtCadastroUsuario.setText("");
                        edtCadastroSenha.setText("");
                        edtCadastroNome.setText("");
                        edtCadastroEndereco.setText("");
                        edtCadastroTelefone.setText("");
                        edtCadastroEmail.setText("");
                        edtCadastroRg.setText("");
                        edtCadastroCpf.setText("");
                        edtCadastroCrm.setText("");
                        
                        
 
	        } catch (IOException Erro) {
						
                    txtAdvertenciaCadastro.setText("Erro ao salvar usuário! ");
                    
		}
            
        }      
           
                
    }
    
          
            
}
   
