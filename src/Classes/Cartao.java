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
 * @author Victor Turra
 */
public class Cartao {

    private Integer idCliente;

    public static final String PROP_IDCLIENTE = "idCliente";

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        Integer oldIdCliente = this.idCliente;
        this.idCliente = idCliente;
        propertyChangeSupport.firePropertyChange(PROP_IDCLIENTE, oldIdCliente, idCliente);
    }

    private Integer idCartao;

    public static final String PROP_IDCARTAO = "idCartao";

    public Integer getIdCartao() {
        return idCartao;
    }

    public void setIdCartao(Integer idCartao) {
        Integer oldIdCartao = this.idCartao;
        this.idCartao = idCartao;
        propertyChangeSupport.firePropertyChange(PROP_IDCARTAO, oldIdCartao, idCartao);
    }

    private String tipoCartao;

    public static final String PROP_TIPOCARTAO = "tipoCartao";

    public String getTipoCartao() {
        return tipoCartao;
    }

    public void setTipoCartao(String tipoCartao) {
        String oldTipoCartao = this.tipoCartao;
        this.tipoCartao = tipoCartao;
        propertyChangeSupport.firePropertyChange(PROP_TIPOCARTAO, oldTipoCartao, tipoCartao);
    }

    
    private int valAno;

    public static final String PROP_VALANO = "valAno";

    public int getValAno() {
        return valAno;
    }

    public void setValAno(int valAno) {
        int oldValAno = this.valAno;
        this.valAno = valAno;
        propertyChangeSupport.firePropertyChange(PROP_VALANO, oldValAno, valAno);
    }

    private int valMes;

    public static final String PROP_VALMES = "valMes";

    public int getValMes() {
        return valMes;
    }

    public void setValMes(int valMes) {
        int oldValMes = this.valMes;
        this.valMes = valMes;
        propertyChangeSupport.firePropertyChange(PROP_VALMES, oldValMes, valMes);
    }

    
    private int codSeguranca;

    public static final String PROP_CODSEGURANCA = "codSeguranca";

    public int getCodSeguranca() {
        return codSeguranca;
    }

    public void setCodSeguranca(int codSeguranca) {
        int oldCodSeguranca = this.codSeguranca;
        this.codSeguranca = codSeguranca;
        propertyChangeSupport.firePropertyChange(PROP_CODSEGURANCA, oldCodSeguranca, codSeguranca);
    }

    
    private String nomeTitular;

    public static final String PROP_NOMETITULAR = "nomeTitular";

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        String oldNomeTitular = this.nomeTitular;
        this.nomeTitular = nomeTitular;
        propertyChangeSupport.firePropertyChange(PROP_NOMETITULAR, oldNomeTitular, nomeTitular);
    }

    
    private String nroCartao;

    public static final String PROP_NROCARTAO = "nroCartao";

    public String getNroCartao() {
        return nroCartao;
    }

    public void setNroCartao(String nroCartao) {
        String oldNroCartao = this.nroCartao;
        this.nroCartao = nroCartao;
        propertyChangeSupport.firePropertyChange(PROP_NROCARTAO, oldNroCartao, nroCartao);
    }

    private transient final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }

}
