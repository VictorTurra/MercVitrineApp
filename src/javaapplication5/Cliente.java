package javaapplication5;

public class Cliente extends Pessoa{
    
    private String Entrega_padrao;
    private int idCarrinho;
    private String PagamentoPadrao;
    
    public Cliente(String nome, String cpf, String data, String ep, int c, String pp) {
        super(nome, cpf, data);
        setEntrega_padrao(ep);
        setIdCarrinho(c);
        setPagamentoPadrao(pp);
    }

    public String getPagamentoPadrao() {
        return PagamentoPadrao;
    }

    public void setPagamentoPadrao(String PagamentoPadrao) {
        this.PagamentoPadrao = PagamentoPadrao;
    }

    public String getEntrega_padrao() {
        return Entrega_padrao;
    }

    public void setEntrega_padrao(String idEntrega_padrao) {
        this.Entrega_padrao = idEntrega_padrao;
    }

    public int getIdCarrinho() {
        return idCarrinho;
    }

    public void setIdCarrinho(int idCarrinho) {
        this.idCarrinho = idCarrinho;
    }
    
}
