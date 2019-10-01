//@author SAMUEL DOS SANTOS SILVA 577588
package Janelas;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;


public class Produto {

    private String nomeProduto;

    public static final String PROP_NOMEPRODUTO = "nomeProduto";

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        String oldNomeProduto = this.nomeProduto;
        this.nomeProduto = nomeProduto;
        propertyChangeSupport.firePropertyChange(PROP_NOMEPRODUTO, oldNomeProduto, nomeProduto);
    }

    
    private String tipoProduto;

    public static final String PROP_TIPOPRODUTO = "tipoProduto";

    public String getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(String tipoProduto) {
        String oldTipoProduto = this.tipoProduto;
        this.tipoProduto = tipoProduto;
        propertyChangeSupport.firePropertyChange(PROP_TIPOPRODUTO, oldTipoProduto, tipoProduto);
    }

    
    private int quantidadeProduto;

    public static final String PROP_QUANTIDADEPRODUTO = "quantidadeProduto";

    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void setQuantidadeProduto(int quantidadeProduto) {
        int oldQuantidadeProduto = this.quantidadeProduto;
        this.quantidadeProduto = quantidadeProduto;
        propertyChangeSupport.firePropertyChange(PROP_QUANTIDADEPRODUTO, oldQuantidadeProduto, quantidadeProduto);
    }

    
    private int codigoProduto;

    public static final String PROP_CODIGOPRODUTO = "codigoProduto";

    public int getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(int codigoProduto) {
        int oldCodigoProduto = this.codigoProduto;
        this.codigoProduto = codigoProduto;
        propertyChangeSupport.firePropertyChange(PROP_CODIGOPRODUTO, oldCodigoProduto, codigoProduto);
    }

    private transient final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }


    
   
}
