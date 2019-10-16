/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 *
 * @author Laboratorio
 */
public class Endereco {
    
    private String logradouro;

    public static final String PROP_LOGRADOURO = "logradouro";

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        String oldLogradouro = this.logradouro;
        this.logradouro = logradouro;
        propertyChangeSupport.firePropertyChange(PROP_LOGRADOURO, oldLogradouro, logradouro);
    }

    private transient final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }
    
        private int numero;

    public static final String PROP_NUMERO = "numero";

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        int oldNumero = this.numero;
        this.numero = numero;
        propertyChangeSupport.firePropertyChange(PROP_NUMERO, oldNumero, numero);
    }
    
        private String bairro;

    public static final String PROP_BAIRRO = "bairro";

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        String oldBairro = this.bairro;
        this.bairro = bairro;
        propertyChangeSupport.firePropertyChange(PROP_BAIRRO, oldBairro, bairro);
    }
    
        private String cep;

    public static final String PROP_CEP = "cep";

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        String oldCep = this.cep;
        this.cep = cep;
        propertyChangeSupport.firePropertyChange(PROP_CEP, oldCep, cep);
    }
    
        private String complemento;

    public static final String PROP_COMPLEMENTO = "complemento";

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        String oldComplemento = this.complemento;
        this.complemento = complemento;
        propertyChangeSupport.firePropertyChange(PROP_COMPLEMENTO, oldComplemento, complemento);
    }



    


}
