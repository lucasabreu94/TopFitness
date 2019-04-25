
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
import modelo.bean.Treino_exercicio;


/**
 *
 * @author ldabr
 */
public class Treino_exercicioDAO {
    
    public void create(Treino_exercicio te){
        
        Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO tb_treino_exercicios (fk_id_treinos, fk_id_exercicio, exercicio, serie, repeticao, divisao) VALUES (?,?,?,?,?,?)");
            stmt.setInt(1, te.getFk_id_treinos());
            stmt.setInt(2, te.getFk_id_exercicio());
            stmt.setString(3, te.getExercicio());
            stmt.setString(4, te.getSerie());
            stmt.setString(5, te.getRepeticao());
            stmt.setString(6, te.getDivisao());
            
            stmt.executeUpdate();
              
        } catch (SQLException ex) {
            Logger.getLogger(ExercicioDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao Adcionar Exercicio"+ex);
        }finally{
 
            Conexao.closeConnection(con, stmt);
        }
        
        JOptionPane.showMessageDialog(null, "Adicionado com Sucesso!");
        
    }
    
    public List<Treino_exercicio> readA(){
        
        Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Treino_exercicio> treino_exercicios = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM tb_treino_exercicios WHERE divisao = 'A'");
            rs = stmt.executeQuery();
            
            
            while(rs.next()){
                
                Treino_exercicio treino_exercicio = new Treino_exercicio();
                
                treino_exercicio.setId(rs.getInt("id"));
                treino_exercicio.setFk_id_treinos(rs.getInt("fk_id_treinos"));
                treino_exercicio.setFk_id_exercicio(rs.getInt("fk_id_exercicio"));
                treino_exercicio.setExercicio(rs.getString("exercicio"));
                treino_exercicio.setSerie(rs.getString("serie"));
                treino_exercicio.setRepeticao(rs.getString("repeticao"));
                treino_exercicio.setDivisao(rs.getString("divisao"));
                
                
               
                treino_exercicios.add(treino_exercicio);
                
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ExercicioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            Conexao.closeConnection(con, stmt, rs);
        }
        
        return treino_exercicios;
        
    }
    
    public List<Treino_exercicio> readB(){
        
        
        
        Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Treino_exercicio> treino_exercicios = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM tb_treino_exercicios WHERE divisao = 'B'");
            rs = stmt.executeQuery();
            
            
            while(rs.next()){
                
                Treino_exercicio treino_exercicio = new Treino_exercicio();
                             
                treino_exercicio.setId(rs.getInt("id"));
                treino_exercicio.setFk_id_treinos(rs.getInt("fk_id_treinos"));
                treino_exercicio.setFk_id_exercicio(rs.getInt("fk_id_exercicio"));
                treino_exercicio.setExercicio(rs.getString("exercicio"));
                treino_exercicio.setSerie(rs.getString("serie"));
                treino_exercicio.setRepeticao(rs.getString("repeticao"));
                treino_exercicio.setDivisao(rs.getString("divisao"));
               
                treino_exercicios.add(treino_exercicio);
                
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ExercicioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            Conexao.closeConnection(con, stmt, rs);
        }
        
        return treino_exercicios;
        
    }
     
    public List<Treino_exercicio> readC(){
        
        
        
        Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Treino_exercicio> treino_exercicios = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM tb_treino_exercicios WHERE divisao = 'C'");
            rs = stmt.executeQuery();
            
            
            while(rs.next()){
                
                Treino_exercicio treino_exercicio = new Treino_exercicio();
                             
                treino_exercicio.setId(rs.getInt("id"));
                treino_exercicio.setFk_id_treinos(rs.getInt("fk_id_treinos"));
                treino_exercicio.setFk_id_exercicio(rs.getInt("fk_id_exercicio"));
                treino_exercicio.setExercicio(rs.getString("exercicio"));
                treino_exercicio.setSerie(rs.getString("serie"));
                treino_exercicio.setRepeticao(rs.getString("repeticao"));
                treino_exercicio.setDivisao(rs.getString("divisao"));
               
                treino_exercicios.add(treino_exercicio);
                
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ExercicioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            Conexao.closeConnection(con, stmt, rs);
        }
        
        return treino_exercicios;
        
    }
    
    public List<Treino_exercicio> readD(){
        
        
        
        Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Treino_exercicio> treino_exercicios = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM tb_treino_exercicios WHERE divisao = 'D'");
            rs = stmt.executeQuery();
            
            
            while(rs.next()){
                
                Treino_exercicio treino_exercicio = new Treino_exercicio();
                             
                treino_exercicio.setId(rs.getInt("id"));
                treino_exercicio.setFk_id_treinos(rs.getInt("fk_id_treinos"));
                treino_exercicio.setFk_id_exercicio(rs.getInt("fk_id_exercicio"));
                treino_exercicio.setExercicio(rs.getString("exercicio"));
                treino_exercicio.setSerie(rs.getString("serie"));
                treino_exercicio.setRepeticao(rs.getString("repeticao"));
                treino_exercicio.setDivisao(rs.getString("divisao"));
               
                treino_exercicios.add(treino_exercicio);
                
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ExercicioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            Conexao.closeConnection(con, stmt, rs);
        }
        
        return treino_exercicios;
        
    } 
    
    public List<Treino_exercicio> readE(){
        
        
        
        Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Treino_exercicio> treino_exercicios = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM tb_treino_exercicios WHERE divisao = 'E'");
            rs = stmt.executeQuery();
            
            
            while(rs.next()){
                
                Treino_exercicio treino_exercicio = new Treino_exercicio();
                             
                treino_exercicio.setId(rs.getInt("id"));
                treino_exercicio.setFk_id_treinos(rs.getInt("fk_id_treinos"));
                treino_exercicio.setFk_id_exercicio(rs.getInt("fk_id_exercicio"));
                treino_exercicio.setExercicio(rs.getString("exercicio"));
                treino_exercicio.setSerie(rs.getString("serie"));
                treino_exercicio.setRepeticao(rs.getString("repeticao"));
                treino_exercicio.setDivisao(rs.getString("divisao"));
               
                treino_exercicios.add(treino_exercicio);
                
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ExercicioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            Conexao.closeConnection(con, stmt, rs);
        }
        
        return treino_exercicios;
        
    } 
    
    public List<Treino_exercicio> readF(){
        
        
        
        Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Treino_exercicio> treino_exercicios = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM tb_treino_exercicios WHERE divisao = 'F'");
            rs = stmt.executeQuery();
            
            
            while(rs.next()){
                
                Treino_exercicio treino_exercicio = new Treino_exercicio();
                             
                treino_exercicio.setId(rs.getInt("id"));
                treino_exercicio.setFk_id_treinos(rs.getInt("fk_id_treinos"));
                treino_exercicio.setFk_id_exercicio(rs.getInt("fk_id_exercicio"));
                treino_exercicio.setExercicio(rs.getString("exercicio"));
                treino_exercicio.setSerie(rs.getString("serie"));
                treino_exercicio.setRepeticao(rs.getString("repeticao"));
                treino_exercicio.setDivisao(rs.getString("divisao"));
               
                treino_exercicios.add(treino_exercicio);
                
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ExercicioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            Conexao.closeConnection(con, stmt, rs);
        }
        
        return treino_exercicios;
        
    } 
        
    public void delete(Treino_exercicio te){
        
        Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("DELETE FROM tb_treino_exercicios WHERE id = ?");  
            stmt.setInt(1, te.getId());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Exercicio Excluido com Sucesso!");
            
        } catch (SQLException ex) {
            Logger.getLogger(ExercicioDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao Excluir Exercicio"+ex);
        }finally{
            Conexao.closeConnection(con, stmt);
        }
    }
}
