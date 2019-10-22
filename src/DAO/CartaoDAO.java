/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Classes.Cartao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 *
 * @author Laboratorio
 */
public class CartaoDAO extends DAO<Cartao>{

    @Override
    public boolean inserir(Cartao element) {
        try{
            String comando = "INSERT INTO Cartao "
                    + "(IdCliente, Numero, Validade, Titular, CodVerificador, Tipo ) VALUES "
                    + "(?, ?, ?, ?, ?, ?);";
            
            PreparedStatement stmt = conn.prepareStatement(
                                comando,Statement.RETURN_GENERATED_KEYS);
            
            stmt.setInt(1, 1);
            stmt.setString(2, element.getNroCartao());
            stmt.setString(3, element.getValMes() + "/" + element.getValAno());
            stmt.setString(4, element.getNomeTitular());
            stmt.setString(5, Integer.toString( element.getCodSeguranca()));
            stmt.setString(6, element.getTipoCartao());
             
            int linhas = stmt.executeUpdate();
            if(linhas==1) {
                return true;
            }
        }catch(SQLException e){
            System.out.println("erro ao inserir Cartão: "+ e.getMessage());
        }
        return false;
    }

    @Override
    public boolean alterar(Cartao element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean excluir(Cartao element) {
        try{
            String comando = "DELETE FROM Cartao "
                    + "WHERE IdCliente = ? AND idCartao = ?;";
            
            PreparedStatement stmt = conn.prepareStatement(comando);
            
            stmt.setInt(1, 1);
            stmt.setInt(2, element.getIdCartao());
             
            int linhas = stmt.executeUpdate();
            if(linhas==1) {
                return true;
            }
        }catch(SQLException e){
            System.out.println("Erro ao Deletar Cartão: "+ e.getMessage());
        }
        return false;
    }

    @Override
    public List<Cartao> listar() {
       
    }
    
}
