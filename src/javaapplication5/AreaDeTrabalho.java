package javaapplication5;

import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

public class AreaDeTrabalho extends  JDesktopPane{
    private JInternalFrame cadCliente;
    public void abrirCadastroCliente(){
        if(cadCliente == null){
            cadCliente = new CadCliente();
            cadCliente.setVisible(true);
            add(cadCliente);
        }
    }
    public void fecharCadastroCliente(){
        cadCliente = null;
    }
}
