package Janelas;

import Classes.Cliente;
import Classes.ConversorDateString;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.jdesktop.beansbinding.AutoBinding;
import org.jdesktop.beansbinding.BeanProperty;
import org.jdesktop.beansbinding.Binding;
import org.jdesktop.beansbinding.BindingGroup;
import org.jdesktop.beansbinding.Bindings;
import org.jdesktop.observablecollections.ObservableCollections;
import org.jdesktop.swingbinding.JTableBinding;
import org.jdesktop.swingbinding.JTableBinding.ColumnBinding;
import org.jdesktop.swingbinding.SwingBindings;


public class CadCliente extends javax.swing.JInternalFrame {
    private List<Cliente> lstClientes;
    private void HabilitaCampos(boolean a){
        txtEmail.setEnabled(a);
        txtEnderecoPadrao.setEnabled(a);
        txtPagPadrao.setEnabled(a);
        txtNomeCliente.setEnabled(a);
        txtCpf.setEnabled(a);
        txtDataNasc.setEnabled(a);
        txtTelefone.setEnabled(a);
    }
    private void SalvarBTM(boolean a, boolean b){
        btnNovo.setVisible(a);
        btnEditar.setVisible(a);
        btnExcluir.setVisible(a);
        btnSalvar.setVisible(b);
        btnCancelar.setVisible(b);
    }
    private void LimpaCampos(){
        txtEmail.setText("");
        txtEnderecoPadrao.setText("");
        txtPagPadrao.setText("");
        txtNomeCliente.setText("");
        txtCpf.setText("");
        txtDataNasc.setText("");
        txtTelefone.setText("");
    }
    public CadCliente(){
      lstClientes = new ArrayList<>();
        lstClientes = ObservableCollections.observableList(lstClientes);
        initComponents();
        HabilitaCampos(false);
        SalvarBTM(true, false);
        
        BindingGroup bg = new BindingGroup();
        
       JTableBinding tb = SwingBindings.createJTableBinding(
       AutoBinding.UpdateStrategy.READ_WRITE,
               lstClientes, tbCadCliente);
       ColumnBinding cb = tb.addColumnBinding(BeanProperty.create("nome"));
       cb.setColumnName("Nome");
       cb = tb.addColumnBinding(BeanProperty.create("email"));
       cb.setColumnName("Email");
       cb = tb.addColumnBinding(BeanProperty.create("cpf"));
       cb.setColumnName("CPF");
       cb = tb.addColumnBinding(BeanProperty.create("data"));
       cb.setColumnName("DataNascimento");
       cb = tb.addColumnBinding(BeanProperty.create("tell"));
       cb.setColumnName("Telefone");
       cb = tb.addColumnBinding(BeanProperty.create("pag"));
       cb.setColumnName("PagPadrao");
       cb = tb.addColumnBinding(BeanProperty.create("eentrega"));
       cb.setColumnName("EndEntreaga");
       
       bg.addBinding(tb);
       
       Binding b = Bindings.createAutoBinding(
                AutoBinding.UpdateStrategy.READ_WRITE,
                tbCadCliente, BeanProperty.create("selectedElement.nome"),
                txtNomeCliente, BeanProperty.create("text"));
        bg.addBinding(b);
            
        b = Bindings.createAutoBinding(
                AutoBinding.UpdateStrategy.READ_WRITE,
                tbCadCliente, BeanProperty.create("selectedElement.email"),
                txtEmail, BeanProperty.create("text"));
        bg.addBinding(b);
       
        b = Bindings.createAutoBinding(
                AutoBinding.UpdateStrategy.READ_WRITE,
                tbCadCliente, BeanProperty.create("selectedElement.cpf"),
                txtCpf, BeanProperty.create("text"));
        bg.addBinding(b);
        
        ConversorDateString conv = new ConversorDateString();
        b = Bindings.createAutoBinding(
                AutoBinding.UpdateStrategy.READ_WRITE,
                tbCadCliente, BeanProperty.create("selectedElement.dataNasc"),
                txtDataNasc, BeanProperty.create("text")
            );
        b.setConverter(conv);
        bg.addBinding(b);
        
        b = Bindings.createAutoBinding(
                AutoBinding.UpdateStrategy.READ_WRITE,
                tbCadCliente, BeanProperty.create("selectedElement.tell"),
                txtTelefone, BeanProperty.create("text")
            );
        bg.addBinding(b);
        
         b = Bindings.createAutoBinding(
                AutoBinding.UpdateStrategy.READ_WRITE,
                tbCadCliente, BeanProperty.create("selectedElement.entrega"),
                txtEnderecoPadrao, BeanProperty.create("text"));
        bg.addBinding(b);
        
         b = Bindings.createAutoBinding(
                AutoBinding.UpdateStrategy.READ_WRITE,
                tbCadCliente, BeanProperty.create("selectedElement.pag"),
                txtPagPadrao, BeanProperty.create("text"));
        bg.addBinding(b);        
       bg.bind();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NomeCliente = new javax.swing.JLabel();
        txtNomeCliente = new javax.swing.JTextField();
        Email = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        Telefone = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        CPF = new javax.swing.JLabel();
        txtCpf = new javax.swing.JTextField();
        DataNasc = new javax.swing.JLabel();
        txtDataNasc = new javax.swing.JTextField();
        PagPadrao = new javax.swing.JLabel();
        txtPagPadrao = new javax.swing.JTextField();
        EnderecoPadrao = new javax.swing.JLabel();
        txtEnderecoPadrao = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbCadCliente = new javax.swing.JTable();
        btnNovo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();

        setTitle("Cadastro de Cliente");
        getContentPane().setLayout(null);

        NomeCliente.setText("Nome:");
        getContentPane().add(NomeCliente);
        NomeCliente.setBounds(10, 20, 40, 14);

        txtNomeCliente.setEnabled(false);
        getContentPane().add(txtNomeCliente);
        txtNomeCliente.setBounds(60, 20, 330, 20);

        Email.setText("E-mail:");
        getContentPane().add(Email);
        Email.setBounds(10, 50, 40, 14);

        txtEmail.setEnabled(false);
        getContentPane().add(txtEmail);
        txtEmail.setBounds(60, 50, 150, 20);

        Telefone.setText("Telefone:");
        getContentPane().add(Telefone);
        Telefone.setBounds(230, 50, 70, 14);

        txtTelefone.setEnabled(false);
        getContentPane().add(txtTelefone);
        txtTelefone.setBounds(290, 50, 100, 20);

        CPF.setText("CPF:");
        getContentPane().add(CPF);
        CPF.setBounds(10, 80, 40, 14);

        txtCpf.setEnabled(false);
        getContentPane().add(txtCpf);
        txtCpf.setBounds(60, 80, 80, 20);

        DataNasc.setText("Data Nascimento:");
        getContentPane().add(DataNasc);
        DataNasc.setBounds(180, 80, 110, 20);

        txtDataNasc.setEnabled(false);
        getContentPane().add(txtDataNasc);
        txtDataNasc.setBounds(290, 80, 100, 20);

        PagPadrao.setText("Forma de Pagamento Padrão:");
        getContentPane().add(PagPadrao);
        PagPadrao.setBounds(410, 10, 190, 14);

        txtPagPadrao.setEnabled(false);
        getContentPane().add(txtPagPadrao);
        txtPagPadrao.setBounds(410, 30, 200, 20);

        EnderecoPadrao.setText("Endereço de entrega padrão:");
        getContentPane().add(EnderecoPadrao);
        EnderecoPadrao.setBounds(410, 60, 210, 14);

        txtEnderecoPadrao.setEnabled(false);
        getContentPane().add(txtEnderecoPadrao);
        txtEnderecoPadrao.setBounds(410, 80, 200, 20);

        tbCadCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbCadCliente.setCellSelectionEnabled(true);
        jScrollPane4.setViewportView(tbCadCliente);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(10, 130, 600, 120);

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        getContentPane().add(btnNovo);
        btnNovo.setBounds(20, 260, 81, 23);

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditar);
        btnEditar.setBounds(120, 260, 81, 23);

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvar);
        btnSalvar.setBounds(230, 260, 81, 23);

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar);
        btnCancelar.setBounds(330, 260, 90, 23);

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluir);
        btnExcluir.setBounds(520, 260, 90, 23);

        setBounds(0, 0, 637, 326);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        SalvarBTM(false, true);
        LimpaCampos();
        HabilitaCampos(true);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
         Cliente c = new Cliente("","", "", "", 0, "");
        if(tbCadCliente.getSelectedRows().length==0){
            c.setNome(txtNomeCliente.getText());
            c.setCpf(txtCpf.getText());
            c.setEmail(txtEmail.getText());
            c.setTelefone(txtTelefone.getText());
            c.setEntrega_padrao(txtEnderecoPadrao.getText());
            c.setPagamentoPadrao(txtPagPadrao.getText());
            lstClientes.add(c);
        }else{
            lstClientes.add(c);
            tbCadCliente.getSelectionModel().setSelectionInterval(
                    lstClientes.size()-1,
                    lstClientes.size()-1);
        }
        LimpaCampos();
        HabilitaCampos(false);
        SalvarBTM(true, false);
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        LimpaCampos();
        HabilitaCampos(false);
        SalvarBTM(true, false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        HabilitaCampos(true);
        SalvarBTM(false, true);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int v[] = tbCadCliente.getSelectedRows();
        List<Cliente> c = new LinkedList<>();
        
        for(int i=0;i<v.length;i++) 
        {
            int idxTabela = v[i];
            int idxList = tbCadCliente.convertRowIndexToModel(idxTabela);
            c.add(lstClientes.get(idxList));
        }
        
        lstClientes.removeAll(c);
    }//GEN-LAST:event_btnExcluirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CPF;
    private javax.swing.JLabel DataNasc;
    private javax.swing.JLabel Email;
    private javax.swing.JLabel EnderecoPadrao;
    private javax.swing.JLabel NomeCliente;
    private javax.swing.JLabel PagPadrao;
    private javax.swing.JLabel Telefone;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tbCadCliente;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtDataNasc;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEnderecoPadrao;
    private javax.swing.JTextField txtNomeCliente;
    private javax.swing.JTextField txtPagPadrao;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
