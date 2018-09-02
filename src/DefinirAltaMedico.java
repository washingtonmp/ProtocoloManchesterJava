
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DefinirAltaMedico extends javax.swing.JFrame {

    private String nomePaciente, enderecoPaciente, telefonePaciente, rgcpfPaciente, descricaoPaciente, protocolo;
    
 
    public DefinirAltaMedico() {
        initComponents();
        
        setTitle("Definir Alta");
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
 
                advertAlta.setText("Paciente não cadastrado! ");
            
	}
        
         
        txtNomePacienteAlta.setText(nomePaciente);
        txtEnderecoPacienteAlta.setText(enderecoPaciente);
        txtTelefonePacienteAlta.setText(telefonePaciente);
        txtRgcpfPacienteAlta.setText(rgcpfPaciente);
        txtSituacaoPaciente.setText("Após tratamento hospitalar, paciente "+nomePaciente+" encontra-se estável e liberado dos cuidados médicos. \n "+getDateTime());
        
    }
    
        private String getDateTime() { 
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); 
        Date date = new Date(); 
        return dateFormat.format(date); 
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNomePaciente = new javax.swing.JLabel();
        txtNomePacienteAlta = new javax.swing.JTextField();
        txtTelefonePaciente = new javax.swing.JLabel();
        txtDescricaoPaciente = new javax.swing.JLabel();
        txtAdvertenciaPaciente = new javax.swing.JLabel();
        txtEnderecoPacienteAlta = new javax.swing.JTextField();
        txtEnderecoPaciente = new javax.swing.JLabel();
        txtTelefonePacienteAlta = new javax.swing.JTextField();
        txtDocumentoPacienteAlta = new javax.swing.JLabel();
        txtRgcpfPacienteAlta = new javax.swing.JTextField();
        txtTituloPaciente = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtSituacaoPaciente = new javax.swing.JTextArea();
        advertAlta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtNomePaciente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtNomePaciente.setText("Nome:");

        txtNomePacienteAlta.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        txtTelefonePaciente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtTelefonePaciente.setText("Telefone:");

        txtDescricaoPaciente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtDescricaoPaciente.setText("Situação:");

        txtAdvertenciaPaciente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        txtEnderecoPacienteAlta.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        txtEnderecoPaciente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtEnderecoPaciente.setText("Endereço:");

        txtTelefonePacienteAlta.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        txtDocumentoPacienteAlta.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtDocumentoPacienteAlta.setText("Documento:");

        txtRgcpfPacienteAlta.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        txtTituloPaciente.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtTituloPaciente.setText("Dados do Paciente");

        txtSituacaoPaciente.setColumns(20);
        txtSituacaoPaciente.setRows(5);
        jScrollPane1.setViewportView(txtSituacaoPaciente);

        advertAlta.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                            .addComponent(advertAlta, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNomePacienteAlta)
                                .addComponent(txtAdvertenciaPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
                                .addComponent(txtEnderecoPacienteAlta, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
                                .addComponent(jScrollPane1)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtTelefonePacienteAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtDocumentoPacienteAlta)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtRgcpfPacienteAlta))))
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
                    .addComponent(txtNomePacienteAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEnderecoPacienteAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEnderecoPaciente))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefonePacienteAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRgcpfPacienteAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefonePaciente)
                    .addComponent(txtDocumentoPacienteAlta))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDescricaoPaciente)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(advertAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAdvertenciaPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(DefinirAltaMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DefinirAltaMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DefinirAltaMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DefinirAltaMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DefinirAltaMedico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel advertAlta;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel txtAdvertenciaPaciente;
    private javax.swing.JLabel txtDescricaoPaciente;
    private javax.swing.JLabel txtDocumentoPacienteAlta;
    private javax.swing.JLabel txtEnderecoPaciente;
    private javax.swing.JTextField txtEnderecoPacienteAlta;
    private javax.swing.JLabel txtNomePaciente;
    private javax.swing.JTextField txtNomePacienteAlta;
    private javax.swing.JTextField txtRgcpfPacienteAlta;
    private javax.swing.JTextArea txtSituacaoPaciente;
    private javax.swing.JLabel txtTelefonePaciente;
    private javax.swing.JTextField txtTelefonePacienteAlta;
    private javax.swing.JLabel txtTituloPaciente;
    // End of variables declaration//GEN-END:variables
}
