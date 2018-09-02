
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;


public class Medico extends javax.swing.JFrame {
    
    private String nomePaciente, enderecoPaciente, telefonePaciente, rgcpfPaciente, descricaoPaciente, protocolo;

   
    public Medico() {
        initComponents();
        
        setTitle("Médico");
        setResizable(false);
        
         try {
					
 		// Instância de um Objeto da Class java(BufferedReader
		// "Para Leitura do Arquivo"), que Instância um Objeto da
		// Class java(FileReader) referenciando o arquivo a ser
		// aberto.
		BufferedReader recoverPaciente = new BufferedReader(new FileReader("pacienteProtocolo.txt"));
 
	        nomePaciente= recoverPaciente.readLine();
                enderecoPaciente= recoverPaciente.readLine();
                telefonePaciente= recoverPaciente.readLine();
                rgcpfPaciente= recoverPaciente.readLine();
                descricaoPaciente= recoverPaciente.readLine();
                protocolo= recoverPaciente.readLine();
                
                                      
        } catch (IOException Erro) {
 
                advertenciaMedico.setText("Paciente não cadastrado! ");
            
	}
        
         
        txtNomePaciente.setText(nomePaciente);
        txtProtocoloPaciente.setText(protocolo);
        txtRgcpfPaciente.setText(rgcpfPaciente);
        txtTelefonePaciente.setText(telefonePaciente);
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNomePaciente = new javax.swing.JTextField();
        btnCadastrarPaciente = new javax.swing.JButton();
        btnMenuPrincipalEnfermeiro = new javax.swing.JButton();
        txtNomePacienteMedico = new javax.swing.JLabel();
        txtProtocoloPacienteMedico = new javax.swing.JLabel();
        txtTituloEnfermeiro = new javax.swing.JLabel();
        btnDefinirProtocolo = new javax.swing.JButton();
        imagemEnfermeiro = new javax.swing.JLabel();
        advertenciaMedico = new javax.swing.JLabel();
        txtProtocoloPaciente = new javax.swing.JTextField();
        txtRgcpfPaciente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtTelefonePaciente = new javax.swing.JTextField();
        txtTelefonePacienteMedico = new javax.swing.JLabel();
        btnDefinirAlta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtNomePaciente.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        btnCadastrarPaciente.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnCadastrarPaciente.setText("Cadastrar Paciente");
        btnCadastrarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarPacienteActionPerformed(evt);
            }
        });

        btnMenuPrincipalEnfermeiro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnMenuPrincipalEnfermeiro.setText("Menu Principal");
        btnMenuPrincipalEnfermeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuPrincipalEnfermeiroActionPerformed(evt);
            }
        });

        txtNomePacienteMedico.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtNomePacienteMedico.setText("Nome:");

        txtProtocoloPacienteMedico.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtProtocoloPacienteMedico.setText("Protocolo:");

        txtTituloEnfermeiro.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtTituloEnfermeiro.setText("Dados do Paciente");

        btnDefinirProtocolo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnDefinirProtocolo.setText("Definir Protocolo");
        btnDefinirProtocolo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDefinirProtocoloActionPerformed(evt);
            }
        });

        imagemEnfermeiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/protocolo.jpg"))); // NOI18N

        advertenciaMedico.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        txtProtocoloPaciente.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel1.setText("Documento:");

        txtTelefonePacienteMedico.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtTelefonePacienteMedico.setText("Telefone:");

        btnDefinirAlta.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnDefinirAlta.setText("Definir alta");
        btnDefinirAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDefinirAltaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(351, 351, 351)
                        .addComponent(txtTituloEnfermeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtProtocoloPacienteMedico)
                            .addComponent(txtNomePacienteMedico)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(advertenciaMedico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNomePaciente)
                            .addComponent(txtProtocoloPaciente)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtRgcpfPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtTelefonePacienteMedico)
                                .addGap(18, 18, 18)
                                .addComponent(txtTelefonePaciente))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCadastrarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 243, Short.MAX_VALUE)
                                .addComponent(btnDefinirAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnMenuPrincipalEnfermeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnDefinirProtocolo, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(85, 113, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 235, Short.MAX_VALUE)
                .addComponent(imagemEnfermeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(231, 231, 231))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(txtNomePacienteMedico))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(imagemEnfermeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtTituloEnfermeiro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtNomePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProtocoloPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProtocoloPacienteMedico))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRgcpfPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txtTelefonePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefonePacienteMedico))
                .addGap(18, 18, 18)
                .addComponent(advertenciaMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDefinirAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMenuPrincipalEnfermeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDefinirProtocolo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarPacienteActionPerformed

        CadastroPacienteUrgencia cpu= new CadastroPacienteUrgencia();
        cpu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCadastrarPacienteActionPerformed

    private void btnMenuPrincipalEnfermeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuPrincipalEnfermeiroActionPerformed

        MenuPrincipal home=new MenuPrincipal();
        home.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnMenuPrincipalEnfermeiroActionPerformed

    private void btnDefinirProtocoloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDefinirProtocoloActionPerformed

        DefinirProtocoloMedico pm= new DefinirProtocoloMedico();
        pm.setVisible(true);
        this.setVisible(false);
    
    }//GEN-LAST:event_btnDefinirProtocoloActionPerformed

    private void btnDefinirAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDefinirAltaActionPerformed
        
        DefinirAltaMedico dam= new DefinirAltaMedico();
        dam.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_btnDefinirAltaActionPerformed

    
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Medico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel advertenciaMedico;
    private javax.swing.JButton btnCadastrarPaciente;
    private javax.swing.JButton btnDefinirAlta;
    private javax.swing.JButton btnDefinirProtocolo;
    private javax.swing.JButton btnMenuPrincipalEnfermeiro;
    private javax.swing.JLabel imagemEnfermeiro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtNomePaciente;
    private javax.swing.JLabel txtNomePacienteMedico;
    private javax.swing.JTextField txtProtocoloPaciente;
    private javax.swing.JLabel txtProtocoloPacienteMedico;
    private javax.swing.JTextField txtRgcpfPaciente;
    private javax.swing.JTextField txtTelefonePaciente;
    private javax.swing.JLabel txtTelefonePacienteMedico;
    private javax.swing.JLabel txtTituloEnfermeiro;
    // End of variables declaration//GEN-END:variables
}
