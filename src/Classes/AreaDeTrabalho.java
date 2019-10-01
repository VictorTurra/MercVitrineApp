package Classes;

import Janelas.CadCartao;
import Janelas.CadCliente;
import Janelas.CadProduto;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

public class AreaDeTrabalho extends  JDesktopPane{
    private JInternalFrame cadCliente;
    private JInternalFrame cadCartao;
    public void abrirCadastroCliente(){
        if(cadCliente == null){
            cadCliente = new CadCliente();
            cadCliente.setSize(500, 600);
            cadCliente.setVisible(true);
            add(cadCliente);
        }
    }
    public void fecharCadastroCliente(){
        cadCliente = null;
    }
    public void abrirCadastroCartao(){
        if(cadCartao==null){
            cadCartao = new CadCartao();
            cadCartao.setVisible(true);
            add(cadCartao);
        }
    }
    
    public void fecharCadastroCartao(){
        cadCartao = null;
    }
    
    private JInternalFrame cadProduto;
    public void abrirCadastroProduto(){
        if(cadProduto == null){
            cadProduto = new CadProduto();
            cadProduto.setVisible(true);
            add(cadProduto);
        }
    }
    public void fecharCadastroProduto(){
        cadProduto = null;
    }
    
}
