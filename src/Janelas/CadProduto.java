/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Janelas;
import Classes.ConversorIntString;
import Classes.Produto;
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

/**
 *
 * @author SAMUEL DOS SANTOS SILVA 577588
 */
public class CadProduto extends javax.swing.JInternalFrame {

    private List<Produto> lstProdutos;
     
    
    public CadProduto() {
        ConversorIntString conv = new ConversorIntString();
        lstProdutos = new ArrayList<>();
        lstProdutos = ObservableCollections.observableList(lstProdutos);
        
        initComponents();
        
        BindingGroup bg = new BindingGroup();
        
       JTableBinding tb = SwingBindings.createJTableBinding(AutoBinding.UpdateStrategy.READ_WRITE,
               lstProdutos, tbProdutos);
       ColumnBinding cb = tb.addColumnBinding(BeanProperty.create("nomeProduto"));
       cb.setColumnName("Nome do Produto:");
       cb = tb.addColumnBinding(BeanProperty.create("tipoProduto"));
       cb.setColumnName("Tipo:");
       cb = tb.addColumnBinding(BeanProperty.create("quantidadeProduto"));
       cb.setColumnName("Quantidade:");
       cb = tb.addColumnBinding(BeanProperty.create("codigoProduto"));
       cb.setColumnName("Codigo:");
       
       bg.addBinding(tb);
       
       Binding b = Bindings.createAutoBinding(AutoBinding.UpdateStrategy.READ_WRITE,
               tbProdutos, BeanProperty.create("selectedElement.NomeProduto"),
               txtNomeProduto, BeanProperty.create("text"));
       bg.addBinding(b);
       
       b = Bindings.createAutoBinding(AutoBinding.UpdateStrategy.READ_WRITE,
               tbProdutos, BeanProperty.create("selectedElement.Tipo"),
               txtTipo, BeanProperty.create("text"));
       bg.addBinding(b); 
       
       b = Bindings.createAutoBinding(AutoBinding.UpdateStrategy.READ_WRITE,
               tbProdutos, BeanProperty.create("selectedElement.Quantidade"),
               txtQuantidade, BeanProperty.create("text"));
       b.setConverter(conv);
       bg.addBinding(b);
       
        b = Bindings.createAutoBinding(AutoBinding.UpdateStrategy.READ_WRITE,
               tbProdutos, BeanProperty.create("selectedElement.Codigo"),
               txtCodigo, BeanProperty.create("text"));
        b.setConverter(conv);
       bg.addBinding(b); 
       
    
  
       
       bg.bind();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NomeDoProduto = new javax.swing.JLabel();
        txtNomeProduto = new javax.swing.JTextField();
        Quantidade = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        Tipo = new javax.swing.JLabel();
        txtTipo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbProdutos = new javax.swing.JTable();
        btnAdicionar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Codigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();

        NomeDoProduto.setText("Nome do produto:");

        Quantidade.setText("Quantidade:");

        Tipo.setText("Tipo:");

        txtTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoActionPerformed(evt);
            }
        });

        tbProdutos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbProdutos);

        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        jButton2.setText("Excluir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        Codigo.setText("Código:");

        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(NomeDoProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNomeProduto))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Quantidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtQuantidade))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Tipo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTipo))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(btnAdicionar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(84, 84, 84))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Codigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCodigo)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomeDoProduto)
                    .addComponent(txtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Quantidade)
                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tipo)
                    .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Codigo)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionar)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoActionPerformed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
      Produto p = new Produto();
        if(tbProdutos.getSelectedRows().length==0){
            p.setNomeProduto(txtNomeProduto.getText());
            p.setTipoProduto(txtTipo.getText());
            p.setQuantidadeProduto(Integer.parseInt(txtQuantidade.getText()));
            p.setCodigoProduto(Integer.parseInt( txtCodigo.getText()));
            
            lstProdutos.add(p);
            
            txtNomeProduto.setText("");
            txtTipo.setText("");
            txtQuantidade.setText("");
            txtCodigo.setText("");
            
        }else{
            lstProdutos.add(p);
            tbProdutos.getSelectionModel().setSelectionInterval(
                    lstProdutos.size()-1, 
                    lstProdutos.size()-1);
        }
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
           int v[] = tbProdutos.getSelectedRows();
        List<Produto> c = new LinkedList<>();
        for(int i = 0; i< v.length; i++){
            int idxTabela = v[i];
            int idxList = tbProdutos.convertRowIndexToModel(idxTabela);
            c.add(lstProdutos.get(idxList));
        }
        lstProdutos.removeAll(c);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Codigo;
    private javax.swing.JLabel NomeDoProduto;
    private javax.swing.JLabel Quantidade;
    private javax.swing.JLabel Tipo;
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbProdutos;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNomeProduto;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables
}
