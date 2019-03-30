
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
import modelo.bean.Treino_aluno;
import modelo.bean.Treino_exercicio;

public class Treino_alunoDAO {

    
    public void create(Treino_aluno ta){
        
        Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO tb_treino_aluno (fk_id_aluno, fk_id_exercicio, exercicio, serie, repeticao, divisao) VALUES (?,?,?,?,?,?)");
            stmt.setInt(1, ta.getFk_id_aluno());
            stmt.setInt(2, ta.getFk_id_exercicio());
            stmt.setString(3, ta.getExercicio());
            stmt.setString(4, ta.getSerie());
            stmt.setString(5, ta.getRepeticao());
            stmt.setString(6, ta.getDivisao());
            
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Adicionado com Sucesso!");
            
        } catch (SQLException ex) {
            Logger.getLogger(ExercicioDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao Adcionar Exercicio"+ex);
        }finally{
            Conexao.closeConnection(con, stmt);
        }
    }
    
    public List<Treino_aluno> readA(){
        
        
        
        Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Treino_aluno> treino_alunos = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM tb_treino_aluno WHERE divisao = 'A'");
            rs = stmt.executeQuery();
            
            
            while(rs.next()){
                
                Treino_aluno treino_aluno = new Treino_aluno();
                
                treino_aluno.setId(rs.getInt("id"));
                treino_aluno.setFk_id_aluno(rs.getInt("fk_id_aluno"));
                treino_aluno.setFk_id_exercicio(rs.getInt("fk_id_exercicio"));
                treino_aluno.setExercicio(rs.getString("exercicio"));
                treino_aluno.setSerie(rs.getString("serie"));
                treino_aluno.setRepeticao(rs.getString("repeticao"));
                treino_aluno.setDivisao(rs.getString("divisao"));
                
                
               
                treino_alunos.add(treino_aluno);
                
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ExercicioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            Conexao.closeConnection(con, stmt, rs);
        }
        
        return treino_alunos;
        
    }
    
    public List<Treino_aluno> readB(){
        
        
        
        Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Treino_aluno> treino_alunos = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM tb_treino_aluno WHERE divisao = 'B'");
            rs = stmt.executeQuery();
            
            
            while(rs.next()){
                
                Treino_aluno treino_aluno = new Treino_aluno();
                
                treino_aluno.setId(rs.getInt("id"));
                treino_aluno.setFk_id_aluno(rs.getInt("fk_id_aluno"));
                treino_aluno.setFk_id_exercicio(rs.getInt("fk_id_exercicio"));
                treino_aluno.setExercicio(rs.getString("exercicio"));
                treino_aluno.setSerie(rs.getString("serie"));
                treino_aluno.setRepeticao(rs.getString("repeticao"));
                treino_aluno.setDivisao(rs.getString("divisao"));
                
                
               
                treino_alunos.add(treino_aluno);
                
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ExercicioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            Conexao.closeConnection(con, stmt, rs);
        }
        
        return treino_alunos;
        
    }
    
    public List<Treino_aluno> readC(){
        
        
        
        Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Treino_aluno> treino_alunos = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM tb_treino_aluno WHERE divisao = 'C'");
            rs = stmt.executeQuery();
            
            
            while(rs.next()){
                
                Treino_aluno treino_aluno = new Treino_aluno();
                
                treino_aluno.setId(rs.getInt("id"));
                treino_aluno.setFk_id_aluno(rs.getInt("fk_id_aluno"));
                treino_aluno.setFk_id_exercicio(rs.getInt("fk_id_exercicio"));
                treino_aluno.setExercicio(rs.getString("exercicio"));
                treino_aluno.setSerie(rs.getString("serie"));
                treino_aluno.setRepeticao(rs.getString("repeticao"));
                treino_aluno.setDivisao(rs.getString("divisao"));
                
                
               
                treino_alunos.add(treino_aluno);
                
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ExercicioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            Conexao.closeConnection(con, stmt, rs);
        }
        
        return treino_alunos;
        
    }
    
    public List<Treino_aluno> readD(){
        
        
        
        Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Treino_aluno> treino_alunos = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM tb_treino_aluno WHERE divisao = 'D'");
            rs = stmt.executeQuery();
            
            
            while(rs.next()){
                
                Treino_aluno treino_aluno = new Treino_aluno();
                
                treino_aluno.setId(rs.getInt("id"));
                treino_aluno.setFk_id_aluno(rs.getInt("fk_id_aluno"));
                treino_aluno.setFk_id_exercicio(rs.getInt("fk_id_exercicio"));
                treino_aluno.setExercicio(rs.getString("exercicio"));
                treino_aluno.setSerie(rs.getString("serie"));
                treino_aluno.setRepeticao(rs.getString("repeticao"));
                treino_aluno.setDivisao(rs.getString("divisao"));
                
                
               
                treino_alunos.add(treino_aluno);
                
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ExercicioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            Conexao.closeConnection(con, stmt, rs);
        }
        
        return treino_alunos;
        
    }
    
    public List<Treino_aluno> readE(){
        
        
        
        Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Treino_aluno> treino_alunos = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM tb_treino_aluno WHERE divisao = 'E'");
            rs = stmt.executeQuery();
            
            
            while(rs.next()){
                
                Treino_aluno treino_aluno = new Treino_aluno();
                
                treino_aluno.setId(rs.getInt("id"));
                treino_aluno.setFk_id_aluno(rs.getInt("fk_id_aluno"));
                treino_aluno.setFk_id_exercicio(rs.getInt("fk_id_exercicio"));
                treino_aluno.setExercicio(rs.getString("exercicio"));
                treino_aluno.setSerie(rs.getString("serie"));
                treino_aluno.setRepeticao(rs.getString("repeticao"));
                treino_aluno.setDivisao(rs.getString("divisao"));
                
                
               
                treino_alunos.add(treino_aluno);
                
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ExercicioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            Conexao.closeConnection(con, stmt, rs);
        }
        
        return treino_alunos;
        
    }
    
    public List<Treino_aluno> readF(){
        
        
        
        Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Treino_aluno> treino_alunos = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM tb_treino_aluno WHERE divisao = 'F'");
            rs = stmt.executeQuery();
            
            
            while(rs.next()){
                
                Treino_aluno treino_aluno = new Treino_aluno();
                
                treino_aluno.setId(rs.getInt("id"));
                treino_aluno.setFk_id_aluno(rs.getInt("fk_id_aluno"));
                treino_aluno.setFk_id_exercicio(rs.getInt("fk_id_exercicio"));
                treino_aluno.setExercicio(rs.getString("exercicio"));
                treino_aluno.setSerie(rs.getString("serie"));
                treino_aluno.setRepeticao(rs.getString("repeticao"));
                treino_aluno.setDivisao(rs.getString("divisao"));
                
                
               
                treino_alunos.add(treino_aluno);
                
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ExercicioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            Conexao.closeConnection(con, stmt, rs);
        }
        
        return treino_alunos;
        
    }
    
    public List<Treino_exercicio> readTreino(){

        Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Treino_exercicio> treino_exercicios = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM tb_treino_exercicios");
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
    
    public void delete(Treino_aluno ta){
        
        Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("DELETE FROM tb_treino_aluno WHERE id = ?");  
            stmt.setInt(1, ta.getId());
            
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
