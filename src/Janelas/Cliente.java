package Janelas;

public class Cliente extends Pessoa{
    
    private int idEntrega_padrao;
    private int idCartao_padrao;
    private int idCarrinho;
    private String PagamentoPadrao;

    public Cliente(String nome, String cpf, int ep, int cp, int c, String pp) {
        super(nome, cpf);
        setIdEntrega_padrao(ep);
        setIdCartao_padrao(cp);
        setIdCarrinho(c);
        setPagamentoPadrao(pp);
    }

    public String getPagamentoPadrao() {
        return PagamentoPadrao;
    }

    public void setPagamentoPadrao(String PagamentoPadrao) {
        this.PagamentoPadrao = PagamentoPadrao;
    }

    public int getIdEntrega_padrao() {
        return idEntrega_padrao;
    }

    public void setIdEntrega_padrao(int idEntrega_padrao) {
        this.idEntrega_padrao = idEntrega_padrao;
    }

    public int getIdCartao_padrao() {
        return idCartao_padrao;
    }

    public void setIdCartao_padrao(int idCartao_padrao) {
        this.idCartao_padrao = idCartao_padrao;
    }

    public int getIdCarrinho() {
        return idCarrinho;
    }

    public void setIdCarrinho(int idCarrinho) {
        this.idCarrinho = idCarrinho;
    }
    
}
