
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;


public class Enfermeiro extends javax.swing.JFrame {
    
    private String nomePaciente, enderecoPaciente, telefonePaciente, rgcpfPaciente, descricaoPaciente, protocolo;      
    
    public Enfermeiro() {
        initComponents();
        
        setTitle("Enfermeiro");
        setResizable(false);
        
       
        
         try {
					
 		// Instância de um Objeto da Class java(BufferedReader
		// "Para Leitura do Arquivo"), que Instância um Objeto da
		// Class java(FileReader) referenciando o arquivo a ser
		// aberto.
		BufferedReader recoverPaciente = new BufferedReader(new FileReader("paciente.txt"));
 
	        nomePaciente= recoverPaciente.readLine();
                enderecoPaciente= recoverPaciente.readLine();
                telefonePaciente= recoverPaciente.readLine();
                rgcpfPaciente= recoverPaciente.readLine();
                descricaoPaciente= recoverPaciente.readLine();    
                                      
 
        } catch (IOException Erro) {
 
                advertenciaEnfermeiro.setText("Paciente não cadastrado! ");
            
	}
        
         
        txtNomePacienteEnfermeiro.setText(nomePaciente);
        txtAreaDescricaoPacienteEnfermeiro.setText(descricaoPaciente);
                
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaDescricaoPacienteEnfermeiro = new javax.swing.JTextArea();
        btnCadastrarPaciente = new javax.swing.JButton();
        btnMenuPrincipalEnfermeiro = new javax.swing.JButton();
        txtNomePaciente = new javax.swing.JLabel();
        txtDescricaoPaciente = new javax.swing.JLabel();
        txtTituloEnfermeiro = new javax.swing.JLabel();
        btnDefinirProtocolo = new javax.swing.JButton();
        protocoloVermelho = new javax.swing.JPanel();
        protocoloLaranja = new javax.swing.JPanel();
        protocoloAmarelo = new javax.swing.JPanel();
        protocoloVerde = new javax.swing.JPanel();
        protocoloAzul = new javax.swing.JPanel();
        imagemEnfermeiro = new javax.swing.JLabel();
        comboboxTipoProtocolo = new javax.swing.JComboBox<>();
        advertenciaEnfermeiro = new javax.swing.JLabel();
        txtNomePacienteEnfermeiro = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtAreaDescricaoPacienteEnfermeiro.setColumns(20);
        txtAreaDescricaoPacienteEnfermeiro.setRows(5);
        jScrollPane1.setViewportView(txtAreaDescricaoPacienteEnfermeiro);

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

        txtNomePaciente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtNomePaciente.setText("Nome:");

        txtDescricaoPaciente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtDescricaoPaciente.setText("Descrição:");

        txtTituloEnfermeiro.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtTituloEnfermeiro.setText("Dados do Paciente");

        btnDefinirProtocolo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnDefinirProtocolo.setText("Definir Protocolo");
        btnDefinirProtocolo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDefinirProtocoloActionPerformed(evt);
            }
        });

        protocoloVermelho.setBackground(new java.awt.Color(255, 0, 0));
        protocoloVermelho.setPreferredSize(new java.awt.Dimension(38, 38));

        javax.swing.GroupLayout protocoloVermelhoLayout = new javax.swing.GroupLayout(protocoloVermelho);
        protocoloVermelho.setLayout(protocoloVermelhoLayout);
        protocoloVermelhoLayout.setHorizontalGroup(
            protocoloVermelhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );
        protocoloVermelhoLayout.setVerticalGroup(
            protocoloVermelhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        protocoloLaranja.setBackground(new java.awt.Color(255, 153, 0));
        protocoloLaranja.setPreferredSize(new java.awt.Dimension(38, 38));

        javax.swing.GroupLayout protocoloLaranjaLayout = new javax.swing.GroupLayout(protocoloLaranja);
        protocoloLaranja.setLayout(protocoloLaranjaLayout);
        protocoloLaranjaLayout.setHorizontalGroup(
            protocoloLaranjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );
        protocoloLaranjaLayout.setVerticalGroup(
            protocoloLaranjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        protocoloAmarelo.setBackground(new java.awt.Color(255, 255, 0));
        protocoloAmarelo.setPreferredSize(new java.awt.Dimension(38, 38));

        javax.swing.GroupLayout protocoloAmareloLayout = new javax.swing.GroupLayout(protocoloAmarelo);
        protocoloAmarelo.setLayout(protocoloAmareloLayout);
        protocoloAmareloLayout.setHorizontalGroup(
            protocoloAmareloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );
        protocoloAmareloLayout.setVerticalGroup(
            protocoloAmareloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        protocoloVerde.setBackground(new java.awt.Color(51, 204, 0));

        javax.swing.GroupLayout protocoloVerdeLayout = new javax.swing.GroupLayout(protocoloVerde);
        protocoloVerde.setLayout(protocoloVerdeLayout);
        protocoloVerdeLayout.setHorizontalGroup(
            protocoloVerdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );
        protocoloVerdeLayout.setVerticalGroup(
            protocoloVerdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        protocoloAzul.setBackground(new java.awt.Color(0, 51, 255));
        protocoloAzul.setPreferredSize(new java.awt.Dimension(26, 26));

        javax.swing.GroupLayout protocoloAzulLayout = new javax.swing.GroupLayout(protocoloAzul);
        protocoloAzul.setLayout(protocoloAzulLayout);
        protocoloAzulLayout.setHorizontalGroup(
            protocoloAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );
        protocoloAzulLayout.setVerticalGroup(
            protocoloAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        imagemEnfermeiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/protocolo.jpg"))); // NOI18N

        comboboxTipoProtocolo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comboboxTipoProtocolo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Definir Protocolo", "Vermelho", "Laranja", "Amarelo", "Verde", "Azul" }));

        advertenciaEnfermeiro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        txtNomePacienteEnfermeiro.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Apresenta Hemorragia / Perda de consiência / A criança apresenta febre / Dor intensa ");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("Respiração comprometida / A pessoa está em choque / A criança não responde ");

        jLabel16.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel16.setText("Dor moderada / Pequena hemorragia / Vômitos persistentes / Apresenta febre");

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setText("Dor leve / Paciente em estado febril / Vômitos");

        jLabel21.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel21.setText("Problema recente");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(imagemEnfermeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(161, 161, 161))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtTituloEnfermeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(277, 277, 277))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDescricaoPaciente)
                            .addComponent(txtNomePaciente)
                            .addComponent(protocoloVermelho, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(protocoloLaranja, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(protocoloAmarelo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(protocoloVerde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(protocoloAzul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel2)
                            .addComponent(jLabel16)
                            .addComponent(jLabel12)
                            .addComponent(jLabel21)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtNomePacienteEnfermeiro, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 587, Short.MAX_VALUE))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(advertenciaEnfermeiro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(btnCadastrarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(comboboxTipoProtocolo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnDefinirProtocolo, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE))
                            .addGap(18, 18, 18)
                            .addComponent(btnMenuPrincipalEnfermeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(imagemEnfermeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtTituloEnfermeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtNomePacienteEnfermeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNomePaciente))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDescricaoPaciente)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(protocoloVermelho, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(protocoloLaranja, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addGap(29, 29, 29)
                                .addComponent(jLabel16))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(protocoloAmarelo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28)
                        .addComponent(jLabel12))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(protocoloVerde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(protocoloAzul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addGap(18, 18, 18)
                .addComponent(advertenciaEnfermeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(comboboxTipoProtocolo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDefinirProtocolo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMenuPrincipalEnfermeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
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
        
       
        
        
        switch(comboboxTipoProtocolo.getSelectedItem().toString()){
            case "Vermelho":
               
                advertenciaEnfermeiro.setText("Situação Emergente. Necessário atendimento imediato! ");
                protocolo="Situação Emergente. Necessário atendimento imediato! ";
                
                try {
                // Instância de um Objeto da Class Java(PrintWrite para Gravação do Arquivo").
                    PrintWriter salvaPacienteProtocolo = new PrintWriter("pacienteProtocolo.txt");
                    // Define o extensão do arquivo que deseja criar.

                    // Captura o Texto dos JTextField.
                    salvaPacienteProtocolo.println(nomePaciente);
                    salvaPacienteProtocolo.println(enderecoPaciente);
                    salvaPacienteProtocolo.println(telefonePaciente);
                    salvaPacienteProtocolo.println(rgcpfPaciente);
                    salvaPacienteProtocolo.println(descricaoPaciente);
                    salvaPacienteProtocolo.println(protocolo);

                    //fecha arquivo
                    salvaPacienteProtocolo.close();

                } catch (IOException Erro) {

                    advertenciaEnfermeiro.setText("Erro ao salvar protocolo!");

                }

            break;
            case "Amarelo":
                
                advertenciaEnfermeiro.setText("Situação urgente. Atendimento em 60 minutos! ");
                protocolo="Situação urgente. Atendimento em 60 minutos! ";
                
                try {
                // Instância de um Objeto da Class Java(PrintWrite para Gravação do Arquivo").
                    PrintWriter salvaPacienteProtocolo = new PrintWriter("pacienteProtocolo.txt");
                    // Define o extensão do arquivo que deseja criar.

                    // Captura o Texto dos JTextField.
                    salvaPacienteProtocolo.println(nomePaciente);
                    salvaPacienteProtocolo.println(enderecoPaciente);
                    salvaPacienteProtocolo.println(telefonePaciente);
                    salvaPacienteProtocolo.println(rgcpfPaciente);
                    salvaPacienteProtocolo.println(descricaoPaciente);
                    salvaPacienteProtocolo.println(protocolo);

                    //fecha arquivo
                    salvaPacienteProtocolo.close();

                } catch (IOException Erro) {

                    advertenciaEnfermeiro.setText("Erro ao salvar protocolo!");

                }
                
            break;
            case "Laranja":
                
                advertenciaEnfermeiro.setText("Situação muito urgente. Atendimento em 10 minutos! ");
                protocolo="Situação muito urgente. Atendimento em 10 minutos! ";
                
                try {
                // Instância de um Objeto da Class Java(PrintWrite para Gravação do Arquivo").
                    PrintWriter salvaPacienteProtocolo = new PrintWriter("pacienteProtocolo.txt");
                    // Define o extensão do arquivo que deseja criar.

                    // Captura o Texto dos JTextField.
                    salvaPacienteProtocolo.println(nomePaciente);
                    salvaPacienteProtocolo.println(enderecoPaciente);
                    salvaPacienteProtocolo.println(telefonePaciente);
                    salvaPacienteProtocolo.println(rgcpfPaciente);
                    salvaPacienteProtocolo.println(descricaoPaciente);
                    salvaPacienteProtocolo.println(protocolo);

                    //fecha arquivo
                    salvaPacienteProtocolo.close();

                } catch (IOException Erro) {

                    advertenciaEnfermeiro.setText("Erro ao salvar protocolo!");

                }
                
            break;
            case "Azul":
                
                advertenciaEnfermeiro.setText("Situação não urgente. Atendimento em 240 minutos! ");
                protocolo="Situação não urgente. Atendimento em 240 minutos! ";
                
                try {
                // Instância de um Objeto da Class Java(PrintWrite para Gravação do Arquivo").
                    PrintWriter salvaPacienteProtocolo = new PrintWriter("pacienteProtocolo.txt");
                    // Define o extensão do arquivo que deseja criar.

                    // Captura o Texto dos JTextField.
                    salvaPacienteProtocolo.println(nomePaciente);
                    salvaPacienteProtocolo.println(enderecoPaciente);
                    salvaPacienteProtocolo.println(telefonePaciente);
                    salvaPacienteProtocolo.println(rgcpfPaciente);
                    salvaPacienteProtocolo.println(descricaoPaciente);
                    salvaPacienteProtocolo.println(protocolo);

                    //fecha arquivo
                    salvaPacienteProtocolo.close();

                } catch (IOException Erro) {

                    advertenciaEnfermeiro.setText("Erro ao salvar protocolo!");

                }
                
            break;
            case "Verde":
                
                advertenciaEnfermeiro.setText("Situação pouco urgente. Atendimento em 120 minutos! ");
                protocolo="Situação pouco urgente. Atendimento em 120 minutos!  ";
                
                try {
                // Instância de um Objeto da Class Java(PrintWrite para Gravação do Arquivo").
                    PrintWriter salvaPacienteProtocolo = new PrintWriter("pacienteProtocolo.txt");
                    // Define o extensão do arquivo que deseja criar.

                    // Captura o Texto dos JTextField.
                    salvaPacienteProtocolo.println(nomePaciente);
                    salvaPacienteProtocolo.println(enderecoPaciente);
                    salvaPacienteProtocolo.println(telefonePaciente);
                    salvaPacienteProtocolo.println(rgcpfPaciente);
                    salvaPacienteProtocolo.println(descricaoPaciente);
                    salvaPacienteProtocolo.println(protocolo);

                    //fecha arquivo
                    salvaPacienteProtocolo.close();

                } catch (IOException Erro) {

                    advertenciaEnfermeiro.setText("Erro ao salvar protocolo!");

                }
                
            break;
            default:
                
                advertenciaEnfermeiro.setText("Selecione o tipo de protocolo! ");
                comboboxTipoProtocolo.requestFocus();
        }
    }//GEN-LAST:event_btnDefinirProtocoloActionPerformed

    
    public static void main(String args[]) {
        

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Enfermeiro().setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel advertenciaEnfermeiro;
    private javax.swing.JButton btnCadastrarPaciente;
    private javax.swing.JButton btnDefinirProtocolo;
    private javax.swing.JButton btnMenuPrincipalEnfermeiro;
    private javax.swing.JComboBox<String> comboboxTipoProtocolo;
    private javax.swing.JLabel imagemEnfermeiro;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel protocoloAmarelo;
    private javax.swing.JPanel protocoloAzul;
    private javax.swing.JPanel protocoloLaranja;
    private javax.swing.JPanel protocoloVerde;
    private javax.swing.JPanel protocoloVermelho;
    private javax.swing.JTextArea txtAreaDescricaoPacienteEnfermeiro;
    private javax.swing.JLabel txtDescricaoPaciente;
    private javax.swing.JLabel txtNomePaciente;
    private javax.swing.JTextField txtNomePacienteEnfermeiro;
    private javax.swing.JLabel txtTituloEnfermeiro;
    // End of variables declaration//GEN-END:variables
}
