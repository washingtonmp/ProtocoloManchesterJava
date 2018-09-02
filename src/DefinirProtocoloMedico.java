
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;


public class DefinirProtocoloMedico extends javax.swing.JFrame {
    
    private String nomePacientepm, enderecoPacientepm, telefonePacientepm, rgcpfPacientepm, descricaoPacientepm, protocolopm;  

 
    public DefinirProtocoloMedico() {
        initComponents();
        
        setTitle("Definir Protocolo");
        setResizable(false);
        
        try {
					
 		// Instância de um Objeto da Class java(BufferedReader
		// "Para Leitura do Arquivo"), que Instância um Objeto da
		// Class java(FileReader) referenciando o arquivo a ser
		// aberto.
		BufferedReader recoverPacientepm = new BufferedReader(new FileReader("paciente.txt"));
 
	        nomePacientepm= recoverPacientepm.readLine();
                enderecoPacientepm= recoverPacientepm.readLine();
                telefonePacientepm= recoverPacientepm.readLine();
                rgcpfPacientepm= recoverPacientepm.readLine();
                descricaoPacientepm= recoverPacientepm.readLine();    
                                      
 
        } catch (IOException Erro) {
 
                advertenciaMedico.setText("Paciente não cadastrado! ");
            
	}
        
         
        txtNomePaciente.setText(nomePacientepm);
        txtAreaDescricaoPaciente.setText(descricaoPacientepm);
                
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNomepm = new javax.swing.JLabel();
        advertenciaMedico = new javax.swing.JLabel();
        txtDescricaoPacientepm = new javax.swing.JLabel();
        txtTituloEnfermeiro = new javax.swing.JLabel();
        btnDefinirProtocolopm = new javax.swing.JButton();
        imagemEnfermeiro = new javax.swing.JLabel();
        comboboxTipoProtocolopm = new javax.swing.JComboBox<>();
        txtNomePaciente = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaDescricaoPaciente = new javax.swing.JTextArea();
        btnCadastrarPacientepm = new javax.swing.JButton();
        btnMenupm = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        protocoloVermelho = new javax.swing.JPanel();
        protocoloLaranja = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        protocoloAmarelo = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        protocoloVerde = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        protocoloAzul = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtNomepm.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtNomepm.setText("Nome:");

        advertenciaMedico.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        txtDescricaoPacientepm.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtDescricaoPacientepm.setText("Descrição:");

        txtTituloEnfermeiro.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtTituloEnfermeiro.setText("Dados do Paciente");

        btnDefinirProtocolopm.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnDefinirProtocolopm.setText("Definir Protocolo");
        btnDefinirProtocolopm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDefinirProtocolopmActionPerformed(evt);
            }
        });

        imagemEnfermeiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/protocolo.jpg"))); // NOI18N

        comboboxTipoProtocolopm.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comboboxTipoProtocolopm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Definir Protocolo", "Vermelho", "Amarelo", "Azul", "Verde", "Laranja" }));

        txtNomePaciente.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        txtAreaDescricaoPaciente.setColumns(20);
        txtAreaDescricaoPaciente.setRows(5);
        jScrollPane1.setViewportView(txtAreaDescricaoPaciente);

        btnCadastrarPacientepm.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnCadastrarPacientepm.setText("Cadastrar Paciente");
        btnCadastrarPacientepm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarPacientepmActionPerformed(evt);
            }
        });

        btnMenupm.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnMenupm.setText("Voltar");
        btnMenupm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenupmActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Apresenta Hemorragia / Perda de consiência / A criança apresenta febre / Dor intensa ");

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

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("Respiração comprometida / A pessoa está em choque / A criança não responde ");

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

        jLabel16.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel16.setText("Dor moderada / Pequena hemorragia / Vômitos persistentes / Apresenta febre");

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

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setText("Dor leve / Paciente em estado febril / Vômitos");

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

        jLabel21.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel21.setText("Problema recente");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(imagemEnfermeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(162, 162, 162))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtNomepm)
                                            .addComponent(protocoloVermelho, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(protocoloLaranja, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(protocoloAmarelo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(protocoloVerde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(protocoloAzul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(40, 40, 40))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtDescricaoPacientepm)
                                        .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel21)
                                    .addComponent(jScrollPane1)
                                    .addComponent(txtNomePaciente)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(advertenciaMedico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnCadastrarPacientepm, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(comboboxTipoProtocolopm, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnDefinirProtocolopm, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnMenupm, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(22, 22, 22))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addComponent(txtTituloEnfermeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(imagemEnfermeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtTituloEnfermeiro)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(txtNomePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtNomepm))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtDescricaoPacientepm)
                                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(45, 45, 45)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel2)
                                                    .addComponent(protocoloVermelho, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(30, 30, 30)
                                                .addComponent(jLabel8))
                                            .addComponent(protocoloLaranja, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(30, 30, 30)
                                        .addComponent(jLabel16))
                                    .addComponent(protocoloAmarelo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addComponent(jLabel12))
                            .addComponent(protocoloVerde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(jLabel21))
                    .addComponent(protocoloAzul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(advertenciaMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(comboboxTipoProtocolopm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrarPacientepm, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMenupm, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDefinirProtocolopm, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDefinirProtocolopmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDefinirProtocolopmActionPerformed

        switch(comboboxTipoProtocolopm.getSelectedItem().toString()){
            case "Vermelho":

            advertenciaMedico.setText("Situação Emergente. Necessário atendimento imediato! ");
            protocolopm="Situação Emergente. Necessário atendimento imediato! ";

            try {
                // Instância de um Objeto da Class Java(PrintWrite para Gravação do Arquivo").
                    PrintWriter salvaPacienteProtocoloVermelho = new PrintWriter("pacienteProtocolo.txt");
                    // Define o extensão do arquivo que deseja criar.

                    // Captura o Texto dos JTextField.
                    salvaPacienteProtocoloVermelho.println(nomePacientepm);
                    salvaPacienteProtocoloVermelho.println(enderecoPacientepm);
                    salvaPacienteProtocoloVermelho.println(telefonePacientepm);
                    salvaPacienteProtocoloVermelho.println(rgcpfPacientepm);
                    salvaPacienteProtocoloVermelho.println(descricaoPacientepm);
                    salvaPacienteProtocoloVermelho.println(protocolopm);

                    //fecha arquivo
                    salvaPacienteProtocoloVermelho.close();

                } catch (IOException Erro) {

                    advertenciaMedico.setText("Erro ao salvar protocolo!");

                }

                break;
                case "Amarelo":

                advertenciaMedico.setText("Situação urgente. Atendimento em 60 minutos! ");
                protocolopm="Situação urgente. Atendimento em 60 minutos! ";

                try {
                    // Instância de um Objeto da Class Java(PrintWrite para Gravação do Arquivo").
                        PrintWriter salvaPacienteProtocoloAmarelo = new PrintWriter("pacienteProtocolo.txt");
                        // Define o extensão do arquivo que deseja criar.

                        // Captura o Texto dos JTextField.
                        salvaPacienteProtocoloAmarelo.println(nomePacientepm);
                        salvaPacienteProtocoloAmarelo.println(enderecoPacientepm);
                        salvaPacienteProtocoloAmarelo.println(telefonePacientepm);
                        salvaPacienteProtocoloAmarelo.println(rgcpfPacientepm);
                        salvaPacienteProtocoloAmarelo.println(descricaoPacientepm);
                        salvaPacienteProtocoloAmarelo.println(protocolopm);

                        //fecha arquivo
                        salvaPacienteProtocoloAmarelo.close();

                    } catch (IOException Erro) {

                        advertenciaMedico.setText("Erro ao salvar protocolo!");

                    }

                    break;
                    case "Laranja":

                    advertenciaMedico.setText("Situação muito urgente. Atendimento em 10 minutos! ");
                    protocolopm="Situação muito urgente. Atendimento em 10 minutos! ";

                    try {
                        // Instância de um Objeto da Class Java(PrintWrite para Gravação do Arquivo").
                            PrintWriter salvaPacienteProtocoloLaranja = new PrintWriter("pacienteProtocolo.txt");
                            // Define o extensão do arquivo que deseja criar.

                            // Captura o Texto dos JTextField.
                            salvaPacienteProtocoloLaranja.println(nomePacientepm);
                            salvaPacienteProtocoloLaranja.println(enderecoPacientepm);
                            salvaPacienteProtocoloLaranja.println(telefonePacientepm);
                            salvaPacienteProtocoloLaranja.println(rgcpfPacientepm);
                            salvaPacienteProtocoloLaranja.println(descricaoPacientepm);
                            salvaPacienteProtocoloLaranja.println(protocolopm);

                            //fecha arquivo
                            salvaPacienteProtocoloLaranja.close();

                        } catch (IOException Erro) {

                            advertenciaMedico.setText("Erro ao salvar protocolo!");

                        }

                        break;
                        case "Azul":

                        advertenciaMedico.setText("Situação não urgente. Atendimento em 240 minutos! ");
                        protocolopm="Situação não urgente. Atendimento em 240 minutos! ";

                        try {
                            // Instância de um Objeto da Class Java(PrintWrite para Gravação do Arquivo").
                                PrintWriter salvaPacienteProtocoloAzul = new PrintWriter("pacienteProtocolo.txt");
                                // Define o extensão do arquivo que deseja criar.

                                // Captura o Texto dos JTextField.
                                salvaPacienteProtocoloAzul.println(nomePacientepm);
                                salvaPacienteProtocoloAzul.println(enderecoPacientepm);
                                salvaPacienteProtocoloAzul.println(telefonePacientepm);
                                salvaPacienteProtocoloAzul.println(rgcpfPacientepm);
                                salvaPacienteProtocoloAzul.println(descricaoPacientepm);
                                salvaPacienteProtocoloAzul.println(protocolopm);

                                //fecha arquivo
                                salvaPacienteProtocoloAzul.close();

                            } catch (IOException Erro) {

                                advertenciaMedico.setText("Erro ao salvar protocolo!");

                            }

                            break;
                            case "Verde":

                            advertenciaMedico.setText("Situação pouco urgente. Atendimento em 120 minutos! ");
                            protocolopm="Situação pouco urgente. Atendimento em 120 minutos!  ";

                            try {
                                // Instância de um Objeto da Class Java(PrintWrite para Gravação do Arquivo").
                                    PrintWriter salvaPacienteProtocoloVerde = new PrintWriter("pacienteProtocolo.txt");
                                    // Define o extensão do arquivo que deseja criar.

                                    // Captura o Texto dos JTextField.
                                    salvaPacienteProtocoloVerde.println(nomePacientepm);
                                    salvaPacienteProtocoloVerde.println(enderecoPacientepm);
                                    salvaPacienteProtocoloVerde.println(telefonePacientepm);
                                    salvaPacienteProtocoloVerde.println(rgcpfPacientepm);
                                    salvaPacienteProtocoloVerde.println(descricaoPacientepm);
                                    salvaPacienteProtocoloVerde.println(protocolopm);

                                    //fecha arquivo
                                    salvaPacienteProtocoloVerde.close();

                                } catch (IOException Erro) {

                                    advertenciaMedico.setText("Erro ao salvar protocolo!");

                                }

                                break;
                                default:

                                advertenciaMedico.setText("Selecione o tipo de protocolo! ");
                                comboboxTipoProtocolopm.requestFocus();
                            }
    }//GEN-LAST:event_btnDefinirProtocolopmActionPerformed

    private void btnCadastrarPacientepmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarPacientepmActionPerformed

        CadastroPacienteUrgencia cpu= new CadastroPacienteUrgencia();
        cpu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCadastrarPacientepmActionPerformed

    private void btnMenupmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenupmActionPerformed

        Medico med=new Medico();
        med.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnMenupmActionPerformed

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
            java.util.logging.Logger.getLogger(DefinirProtocoloMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DefinirProtocoloMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DefinirProtocoloMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DefinirProtocoloMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DefinirProtocoloMedico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel advertenciaMedico;
    private javax.swing.JButton btnCadastrarPacientepm;
    private javax.swing.JButton btnDefinirProtocolopm;
    private javax.swing.JButton btnMenupm;
    private javax.swing.JComboBox<String> comboboxTipoProtocolopm;
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
    private javax.swing.JTextArea txtAreaDescricaoPaciente;
    private javax.swing.JLabel txtDescricaoPacientepm;
    private javax.swing.JTextField txtNomePaciente;
    private javax.swing.JLabel txtNomepm;
    private javax.swing.JLabel txtTituloEnfermeiro;
    // End of variables declaration//GEN-END:variables
}
