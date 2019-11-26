/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Classes.TipoCartao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;
import org.jdesktop.observablecollections.ObservableCollections;

/**
 *
 * @author Victor Turra
 */
public class TipoCartaoDAO extends DAO<TipoCartao>{

    @Override
    public boolean inserir(TipoCartao element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean alterar(TipoCartao element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean excluir(TipoCartao element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<TipoCartao> listar() {
        List<TipoCartao> lstTipoCartao = new LinkedList<>();
        lstTipoCartao = ObservableCollections.observableList(lstTipoCartao);
        
        String sql = "SELECT * from TipoCartao;";
        
        try{
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                TipoCartao c = new TipoCartao();
                
                c.setIdTipoCartao( rs.getInt("idtipo_cartao") );
                c.setDescricao( rs.getString("descricao") );
                lstTipoCartao.add(c);
            }
            
        }catch(SQLException e){
            System.out.println("Erro ao listar");
        }
        return lstTipoCartao;
    }
    
    
    
}
