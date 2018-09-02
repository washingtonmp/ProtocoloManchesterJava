
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Login extends javax.swing.JFrame {

    
    // instanciando variaveis
    
    private String entrarLogin;
    private String senhaLogin;
    
     // Atributos atendente
    private String usuarioAtendente, senhaAtendente, nomeAtendente, enderecoAtendente, emailAtendente, telefoneAtendente, rgAtendente,cpfAtendente, funcaoAtendente;
    

    // Atributos Enfermeiro
    private String usuarioEnfermeiro, senhaEnfermeiro, nomeEnfermeiro, enderecoEnfermeiro, emailEnfermeiro, telefoneEnfermeiro, rgEnfermeiro, cpfEnfermeiro, funcaoEnfermeiro, corenEnfermeiro;


    // Atributos médico
    private String usuarioMedico, senhaMedico, nomeMedico, enderecoMedico, emailMedico, telefoneMedico, rgMedico, cpfMedico,  funcaoMedico, crmMedico;
    
    // Atributos Administrador
    
    private String usuarioAdministrador;
    private String senhaAdministrador; 
    
    
    public Login() {
        initComponents();
        
        setTitle("Acesso");
        setResizable(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtUsuario = new javax.swing.JLabel();
        txtSenha = new javax.swing.JLabel();
        edtSenhaUsuario = new javax.swing.JTextField();
        btnLoginVoltar = new javax.swing.JButton();
        btnLoginAcessar = new javax.swing.JButton();
        imagen = new javax.swing.JLabel();
        comboBoxEscolhaFuncao = new javax.swing.JComboBox<>();
        txtfuncao = new javax.swing.JLabel();
        edtLoginUsuario = new javax.swing.JTextField();
        advertLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtUsuario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtUsuario.setText("Usuário:");

        txtSenha.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtSenha.setText("Senha:");

        edtSenhaUsuario.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        btnLoginVoltar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnLoginVoltar.setText("Menu Principal");
        btnLoginVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginVoltarActionPerformed(evt);
            }
        });

        btnLoginAcessar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnLoginAcessar.setText("Entrar");
        btnLoginAcessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginAcessarActionPerformed(evt);
            }
        });

        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login.jpg"))); // NOI18N

        comboBoxEscolhaFuncao.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        comboBoxEscolhaFuncao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione a função", "Atendente", "Médico", "Enfermeiro" }));
        comboBoxEscolhaFuncao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxEscolhaFuncaoActionPerformed(evt);
            }
        });

        txtfuncao.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtfuncao.setText("Função:");

        edtLoginUsuario.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        advertLogin.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(imagen)
                .addGap(220, 220, 220))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSenha)
                            .addComponent(txtfuncao)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(txtUsuario)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(advertLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(edtLoginUsuario)
                    .addComponent(edtSenhaUsuario)
                    .addComponent(comboBoxEscolhaFuncao, 0, 399, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnLoginAcessar, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLoginVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(128, 128, 128))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsuario)
                    .addComponent(edtLoginUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtSenhaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSenha))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtfuncao)
                    .addComponent(comboBoxEscolhaFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLoginAcessar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLoginVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(advertLogin)
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginVoltarActionPerformed
        
        MenuPrincipal loginVoltar=new MenuPrincipal();
        loginVoltar.setVisible(true);
        this.setVisible(false);
       
    }//GEN-LAST:event_btnLoginVoltarActionPerformed

    private void btnLoginAcessarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginAcessarActionPerformed
       
        usuarioAdministrador="Administrador";
        senhaAdministrador="dmkw-aspi";
        
        entrarLogin=edtLoginUsuario.getText();
        senhaLogin= edtSenhaUsuario.getText();
        
        if((entrarLogin.isEmpty())||(senhaLogin.isEmpty())){
            
            advertLogin.setText("Campos não podem estar vazios");
            
        }else{
            
            switch(comboBoxEscolhaFuncao.getSelectedItem().toString()){
                case "Atendente":
                    recuperaDadosCadastradosAtendente();
                break;
                case "Enfermeiro":
                     recuperaDadosCadastradosEnfermeiro();
                break;
                case "Médico":
                    recuperaDadosCadastradosMedico();
                break;
                default:
                    advertLogin.setText("Escolha uma função!");
            }
            
        }
    }//GEN-LAST:event_btnLoginAcessarActionPerformed

    private void comboBoxEscolhaFuncaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxEscolhaFuncaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxEscolhaFuncaoActionPerformed

 
    public static void main(String args[]) {
        
        
    
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel advertLogin;
    private javax.swing.JButton btnLoginAcessar;
    private javax.swing.JButton btnLoginVoltar;
    private javax.swing.JComboBox<String> comboBoxEscolhaFuncao;
    private javax.swing.JTextField edtLoginUsuario;
    private javax.swing.JTextField edtSenhaUsuario;
    private javax.swing.JLabel imagen;
    private javax.swing.JLabel txtSenha;
    private javax.swing.JLabel txtUsuario;
    private javax.swing.JLabel txtfuncao;
    // End of variables declaration//GEN-END:variables

    public void recuperaDadosCadastradosAtendente(){
        
        try {
					
 		// Instância de um Objeto da Class java(BufferedReader Para Leitura do Arquivo"), que Instância um Objeto da
		// Class java(FileReader) referenciando o arquivo a ser aberto.
		BufferedReader recoverAtendente = new BufferedReader(new FileReader(edtLoginUsuario.getText()+ ".txt"));
 
		// Ler o conteúdo do arquivo e exibe nos JTextField.
					 // limpa campos
                                                     
                usuarioAtendente= recoverAtendente.readLine();
                senhaAtendente= recoverAtendente.readLine();
                nomeAtendente= recoverAtendente.readLine();
                enderecoAtendente= recoverAtendente.readLine();
                telefoneAtendente= recoverAtendente.readLine();
                emailAtendente= recoverAtendente.readLine();
                rgAtendente= recoverAtendente.readLine();
                cpfAtendente= recoverAtendente.readLine();
                funcaoAtendente=recoverAtendente.readLine();
                
                if((entrarLogin.equals(usuarioAtendente))&&(senhaLogin.equals(senhaAtendente))&&(comboBoxEscolhaFuncao.getSelectedItem().equals(funcaoAtendente))){
                    
                     Atendente atend= new Atendente();
                     atend.setVisible(true);
                     this.setVisible(false);
                     
                }else{
                    
                    advertLogin.setText("Usuário inválido!");
                    
                }       
                       
                                                         
 
        } catch (IOException Erro) {
 
                advertLogin.setText("Usuario não cadastrado");
            
	}
        
    }
    
    public void recuperaDadosCadastradosEnfermeiro(){
        
        try {
					
 		// Instância de um Objeto da Class java(BufferedReader
		// "Para Leitura do Arquivo"), que Instância um Objeto da
		// Class java(FileReader) referenciando o arquivo a ser
		// aberto.
		BufferedReader recoverEnfermeiro = new BufferedReader(new FileReader(edtLoginUsuario.getText()+ ".txt"));
 
		// Ler o conteúdo do arquivo e exibe nos JTextField.
					 // limpa campos
                usuarioEnfermeiro= recoverEnfermeiro.readLine();
                senhaEnfermeiro= recoverEnfermeiro.readLine();
                nomeEnfermeiro= recoverEnfermeiro.readLine();
                enderecoEnfermeiro= recoverEnfermeiro.readLine();
                telefoneEnfermeiro= recoverEnfermeiro.readLine();
                emailEnfermeiro= recoverEnfermeiro.readLine();
                rgEnfermeiro= recoverEnfermeiro.readLine();
                cpfEnfermeiro= recoverEnfermeiro.readLine();
                funcaoEnfermeiro=recoverEnfermeiro.readLine();
                corenEnfermeiro= recoverEnfermeiro.readLine();
                
                if((entrarLogin.equals(usuarioEnfermeiro))&&(senhaLogin.equals(senhaEnfermeiro))&&(comboBoxEscolhaFuncao.getSelectedItem().equals(funcaoEnfermeiro))){
                    
                     Enfermeiro enf= new Enfermeiro();
                     enf.setVisible(true);
                     this.setVisible(false);
                     
                }else{
                    
                    advertLogin.setText("Usuário inválido!");
                    
                }   
                                      
                                      
 
        } catch (IOException Erro) {
 
                advertLogin.setText("Usuário não cadastrado! ");
            
	}
        
    }
    
    public void recuperaDadosCadastradosMedico(){
        
        try {
					
 		// Instância de um Objeto da Class java(BufferedReader
		// "Para Leitura do Arquivo"), que Instância um Objeto da
		// Class java(FileReader) referenciando o arquivo a ser
		// aberto.
		BufferedReader recoverMedico = new BufferedReader(new FileReader(edtLoginUsuario.getText()+ ".txt"));
 
	        usuarioMedico= recoverMedico.readLine();
                senhaMedico= recoverMedico.readLine();
                nomeMedico= recoverMedico.readLine();
                enderecoMedico= recoverMedico.readLine();
                telefoneMedico= recoverMedico.readLine();
                emailMedico= recoverMedico.readLine();
                rgMedico= recoverMedico.readLine();
                cpfMedico= recoverMedico.readLine();
                funcaoMedico=recoverMedico.readLine();
                crmMedico= recoverMedico.readLine();
                
                if((entrarLogin.equals(usuarioMedico))&&(senhaLogin.equals(senhaMedico))&&(comboBoxEscolhaFuncao.getSelectedItem().equals(funcaoMedico))){
                    
                     Medico med= new Medico();
                     med.setVisible(true);
                     this.setVisible(false);
                     
                }else{
                    
                    advertLogin.setText("Usuário inválido!");
                    
                }   
                                      
                                      
 
        } catch (IOException Erro) {
 
                advertLogin.setText("Usuário não cadastrado! ");
            
	}
        
    }
    
}
