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
import java.util.LinkedList;
import java.util.List;
import org.jdesktop.observablecollections.ObservableCollections;

/**
 *
 * @author Laboratorio
 */
public class CartaoDAO extends DAO<Cartao>{

    @Override
    public boolean inserir(Cartao element) {
        try{
            
            Integer last_id_cartao = 1;
            String comando = "SELECT max(idCartao) as last_id_cartao FROM cartao WHERE cartao_idPessoa = 1;";
            
            try{
                Statement stmta = conn.createStatement();
                ResultSet rsa = stmta.executeQuery(comando);
                
                
                if(rsa != null && rsa.next()){
                    last_id_cartao = rsa.getInt(1);
                }
                
            }catch(SQLException e){
                System.out.println("Erro ao Capturar ultimo Id de Cartao");
                e.printStackTrace();
                return false;
            }
            
            
            comando = "INSERT INTO cartao "
                    + "(cartao_idPessoa, idCartao, Numero, validade_mes, validade_ano, Titular, CodVerificador, cartao_idtipo_cartao ) VALUES "
                    + "(?, ?, ?, ?, ?, ?, ?, ?);";
            
            PreparedStatement stmt = conn.prepareStatement(comando);
            
            stmt.setInt(1, 1);
            stmt.setInt(2, last_id_cartao + 1 );
            stmt.setString(3, element.getNroCartao());
            stmt.setInt(4, element.getValMes());
            stmt.setInt(5, element.getValAno());
            stmt.setString(6, element.getNomeTitular());
            stmt.setString(7, Integer.toString( element.getCodSeguranca()));
            stmt.setInt(8, 1);
             
            int linhas = stmt.executeUpdate();
            if(linhas==1) {
                element.setIdCartao(last_id_cartao + 1);
                return true;
            }
        }catch(SQLException e){
            System.out.println("erro ao inserir Cartão: "+ e.getMessage());
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean alterar(Cartao element) {
        try{
            String comando = "UPDATE Cartao "
                    + "SET IdCliente = 1, "
                    + "Numero = ?, "
                    + "Validade = ?, "
                    + "Titular = ?, "
                    + "CodVerificador = ?, "
                    + "Tipo = ?,"
                    + "WHERE idCartao = " + element.getIdCartao().toString() + ";";
            
            PreparedStatement stmt = conn.prepareStatement(comando);
            
            stmt.setString(1, element.getNroCartao());
            stmt.setString(2, Integer.toString( element.getValMes()) + "/" + Integer.toString( element.getValAno()) );
            stmt.setString(3, element.getNomeTitular());
            stmt.setString(4, Integer.toString( element.getCodSeguranca()));
            stmt.setString(5, element.getTipoCartao());
             
            int linhas = stmt.executeUpdate();
            if(linhas==1) {
                return true;
            }
        }catch(SQLException e){
            System.out.println("Erro ao Atualizar Cartão: "+ e.getMessage());
        }
        return false;
        
    }

    @Override
    public boolean excluir(Cartao element) {
        try{
            String comando = "DELETE FROM Cartao "
                    + "WHERE IdCliente = 1 AND idCartao = ?;";
            
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
        List<Cartao> lstCartao = new LinkedList<>();
        lstCartao = ObservableCollections.observableList(lstCartao);
        
        String sql = "SELECT * from Cartao;";
        
        try{
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                Cartao c = new Cartao();
                
                c.setIdCliente( rs.getInt("IdCliente") );
                c.setIdCartao( rs.getInt("idCartao") );
                c.setNroCartao(rs.getString("Numero") );
                String dataVal[] = new String[2];
                dataVal = rs.getString("Validade").split("/");
                c.setValMes(Integer.parseInt( dataVal[0] ));
                c.setValAno(Integer.parseInt( dataVal[1] ));
                c.setCodSeguranca(Integer.parseInt( rs.getString("CodVerificador")));
                c.setTipoCartao( rs.getString("Tipo") );
                c.setNomeTitular( rs.getString("Titular") );
                lstCartao.add(c);
            }
            
        }catch(SQLException e){
            System.out.println("Erro ao listar");
        }
        return lstCartao;
    }
    
}
