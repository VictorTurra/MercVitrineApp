/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Janelas;

/**
 *
 * @author Victor Turra
 */
public class Cartao {
    
    private String nroCartao;
    private String nomeTitular;
    private int codSeguranca;
    private int valMes;
    private int valAno;
    private String tipoCartao;

    public String getNroCartao() {
        return nroCartao;
    }

    public void setNroCartao(String nroCartao) {
        this.nroCartao = nroCartao;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public int getCodSeguranca() {
        return codSeguranca;
    }

    public void setCodSeguranca(int codSeguranca) {
        this.codSeguranca = codSeguranca;
    }

    public int getValMes() {
        return valMes;
    }

    public void setValMes(int valMes) {
        this.valMes = valMes;
    }

    public int getValAno() {
        return valAno;
    }

    public void setValAno(int valAno) {
        this.valAno = valAno;
    }

    public String getTipoCartao() {
        return tipoCartao;
    }

    public void setTipoCartao(String tipoCartao) {
        this.tipoCartao = tipoCartao;
    }
    
    
    
}
