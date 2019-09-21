/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

/**
 *
 * @author Everton-PC
 */
public class CadCliente extends javax.swing.JInternalFrame {

    /**
     * Creates new form CadCliente
     */
    public CadCliente() {
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

        NomeCliente = new javax.swing.JLabel();
        txtNomeCliente = new javax.swing.JTextField();
        CPF = new javax.swing.JLabel();
        txtCPF = new javax.swing.JTextField();
        Email = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        Telefone = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        EnderecoPadrao = new javax.swing.JLabel();
        txtEnderecoPadrao = new javax.swing.JTextField();
        PagPadrao = new javax.swing.JLabel();
        txtPagPadrao = new javax.swing.JTextField();
        PagCad = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstPagCad = new javax.swing.JList<>();
        btnConsultaPg = new javax.swing.JButton();
        EnderecoCad = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstEnderecoCad = new javax.swing.JList<>();
        btnConsultaEnd = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstClientCad = new javax.swing.JList<>();
        btnNovo = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();

        setTitle("Cadastro de Cliente");
        getContentPane().setLayout(null);

        NomeCliente.setText("Nome:");
        getContentPane().add(NomeCliente);
        NomeCliente.setBounds(10, 20, 32, 14);

        txtNomeCliente.setEnabled(false);
        getContentPane().add(txtNomeCliente);
        txtNomeCliente.setBounds(50, 20, 330, 20);

        CPF.setText("CPF:");
        getContentPane().add(CPF);
        CPF.setBounds(10, 50, 23, 14);

        txtCPF.setEnabled(false);
        getContentPane().add(txtCPF);
        txtCPF.setBounds(50, 50, 130, 20);

        Email.setText("E-mail:");
        getContentPane().add(Email);
        Email.setBounds(10, 80, 35, 14);

        txtEmail.setEnabled(false);
        getContentPane().add(txtEmail);
        txtEmail.setBounds(50, 80, 230, 20);

        Telefone.setText("Telefone:");
        getContentPane().add(Telefone);
        Telefone.setBounds(210, 50, 47, 14);

        txtTelefone.setEnabled(false);
        getContentPane().add(txtTelefone);
        txtTelefone.setBounds(260, 50, 120, 20);

        EnderecoPadrao.setText("Endereço de entrega padrão:");
        getContentPane().add(EnderecoPadrao);
        EnderecoPadrao.setBounds(10, 110, 142, 14);

        txtEnderecoPadrao.setEnabled(false);
        getContentPane().add(txtEnderecoPadrao);
        txtEnderecoPadrao.setBounds(160, 110, 220, 20);

        PagPadrao.setText("Forma de Pagamento  Padrão:");
        getContentPane().add(PagPadrao);
        PagPadrao.setBounds(10, 140, 148, 14);

        txtPagPadrao.setEnabled(false);
        getContentPane().add(txtPagPadrao);
        txtPagPadrao.setBounds(160, 140, 220, 20);

        PagCad.setText("Formas de Pagamento Cadastrados:");
        getContentPane().add(PagCad);
        PagCad.setBounds(10, 190, 180, 14);

        lstPagCad.setEnabled(false);
        jScrollPane2.setViewportView(lstPagCad);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(10, 210, 180, 130);

        btnConsultaPg.setText("Consultar");
        btnConsultaPg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaPgActionPerformed(evt);
            }
        });
        getContentPane().add(btnConsultaPg);
        btnConsultaPg.setBounds(60, 350, 79, 23);

        EnderecoCad.setText("Endereços de Entrega Cadastrados:");
        getContentPane().add(EnderecoCad);
        EnderecoCad.setBounds(220, 190, 180, 14);

        lstEnderecoCad.setEnabled(false);
        jScrollPane1.setViewportView(lstEnderecoCad);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(220, 210, 170, 130);

        btnConsultaEnd.setText("Consultar");
        btnConsultaEnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaEndActionPerformed(evt);
            }
        });
        getContentPane().add(btnConsultaEnd);
        btnConsultaEnd.setBounds(270, 350, 81, 23);

        jScrollPane3.setViewportView(lstClientCad);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(410, 10, 190, 330);

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        getContentPane().add(btnNovo);
        btnNovo.setBounds(410, 350, 81, 23);

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluir);
        btnExcluir.setBounds(520, 350, 81, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnConsultaPgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaPgActionPerformed
        //Abrir Cadastro de Formas de pagamento
    }//GEN-LAST:event_btnConsultaPgActionPerformed

    private void btnConsultaEndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaEndActionPerformed
        //Abrir Cadastro de Endereços de entrega
    }//GEN-LAST:event_btnConsultaEndActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        // Habilitar Campos em branco e mudar novo -> salvar e Excluir -> Cancelar
    }//GEN-LAST:event_btnNovoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CPF;
    private javax.swing.JLabel Email;
    private javax.swing.JLabel EnderecoCad;
    private javax.swing.JLabel EnderecoPadrao;
    private javax.swing.JLabel NomeCliente;
    private javax.swing.JLabel PagCad;
    private javax.swing.JLabel PagPadrao;
    private javax.swing.JLabel Telefone;
    private javax.swing.JButton btnConsultaEnd;
    private javax.swing.JButton btnConsultaPg;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<String> lstClientCad;
    private javax.swing.JList<String> lstEnderecoCad;
    private javax.swing.JList<String> lstPagCad;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEnderecoPadrao;
    private javax.swing.JTextField txtNomeCliente;
    private javax.swing.JTextField txtPagPadrao;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
