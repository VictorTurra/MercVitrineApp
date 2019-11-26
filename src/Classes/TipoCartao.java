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
public class TipoCartao {

    @Override
    public String toString() {
        return descricao;
    }
    
    private Integer idTipoCartao;

    public static final String PROP_IDTIPOCARTAO = "idTipoCartao";

    public Integer getIdTipoCartao() {
        return idTipoCartao;
    }

    public void setIdTipoCartao(Integer idTipoCartao) {
        Integer oldIdTipoCartao = this.idTipoCartao;
        this.idTipoCartao = idTipoCartao;
        propertyChangeSupport.firePropertyChange(PROP_IDTIPOCARTAO, oldIdTipoCartao, idTipoCartao);
    }

    private transient final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }

        private String descricao;

    public static final String PROP_DESCRICAO = "descricao";

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        String oldDescricao = this.descricao;
        this.descricao = descricao;
        propertyChangeSupport.firePropertyChange(PROP_DESCRICAO, oldDescricao, descricao);
    }

    
}
