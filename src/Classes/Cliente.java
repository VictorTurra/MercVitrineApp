package Classes;

public class Cliente extends Pessoa{
    
    private String Entrega;
    private int idCarrinho;
    private String PagamentoPadrao;
    
    public Cliente(String nome, String cpf, String data, String ep, int c, String pp) {
        super(nome, cpf, data);
        setEntrega(ep);
        setIdCarrinho(c);
        setPagamentoPadrao(pp);
    }

    public String getPagamentoPadrao() {
        return PagamentoPadrao;
    }

    public void setPagamentoPadrao(String PagamentoPadrao) {
        this.PagamentoPadrao = PagamentoPadrao;
    }

    public String getEntrega() {
        return Entrega;
    }

    public void setEntrega(String idEntrega_padrao) {
        this.Entrega = idEntrega_padrao;
    }

    public int getIdCarrinho() {
        return idCarrinho;
    }

    public void setIdCarrinho(int idCarrinho) {
        this.idCarrinho = idCarrinho;
    }
    
}
