/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao;

import Conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.bean.Treino;

/**
 *
 * @author ldabr
 */
public class TreinoDAO {
    public void create(Treino t){
        
        Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO tb_treinos (nome) VALUES (?)");
            stmt.setString(1, t.getNome());
            
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Treino Cadastrado com Sucesso!");
            
        } catch (SQLException ex) {
            Logger.getLogger(ExercicioDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao Cadastrar Treino"+ex);
        }finally{
            Conexao.closeConnection(con, stmt);
        }
    }
    
    public List<Treino> read(){
        
        Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Treino> treinos = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM tb_treinos");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                Treino treino = new Treino();
                
                treino.setId(rs.getInt("id"));
                treino.setNome(rs.getString("nome"));
                
               
                treinos.add(treino);
                
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ExercicioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            Conexao.closeConnection(con, stmt, rs);
        }
        
        return treinos;
        
    }
    
    public void update(Treino t){
        
        Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE tb_treinos SET nome = ? WHERE id = ?");  
            stmt.setString(1, t.getNome());
            stmt.setInt(2, t.getId());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Treino alterado com sucesso!");
            
        } catch (SQLException ex) {
            Logger.getLogger(ExercicioDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao alterar treino"+ex);
        }finally{
            Conexao.closeConnection(con, stmt);
        }
    }
        
    public void delete(Treino t){
        
        Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("DELETE FROM tb_treinos WHERE id = ?");  
            stmt.setInt(1, t.getId());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Treino excluido com sucesso!");
            
        } catch (SQLException ex) {
            Logger.getLogger(ExercicioDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao excluir treino..."+ex);
        }finally{
            Conexao.closeConnection(con, stmt);
        }
    }
    
    
}
