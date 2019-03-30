
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
import modelo.bean.Exercicio;


public class ExercicioDAO {
    
    public void create(Exercicio e){
        
        Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO tb_exercicio (nome, descricao, categoria) VALUES (?,?,?)");
            stmt.setString(1, e.getNome());
            stmt.setString(2, e.getDescricao());
            stmt.setString(3, e.getCategoria());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Exercicio Cadastrado com Sucesso!");
            
        } catch (SQLException ex) {
            Logger.getLogger(ExercicioDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao Cadastrar Exercicio"+ex);
        }finally{
            Conexao.closeConnection(con, stmt);
        }
    }
    
    public List<Exercicio> read(){
        
        Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Exercicio> exercicios = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM tb_exercicio ORDER BY nome ASC");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                Exercicio exercicio = new Exercicio();
                
                exercicio.setId(rs.getInt("id"));
                exercicio.setNome(rs.getString("nome"));
                exercicio.setDescricao(rs.getString("descricao"));
                exercicio.setCategoria(rs.getString("categoria"));
               
                exercicios.add(exercicio);
                
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ExercicioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            Conexao.closeConnection(con, stmt, rs);
        }
        
        return exercicios;
        
    }
    
    public void update(Exercicio e){
        
        Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE tb_exercicio SET nome = ?, descricao = ?, categoria = ? WHERE id = ?");  
            stmt.setString(1, e.getNome());
            stmt.setString(2, e.getDescricao());
            stmt.setString(3, e.getCategoria());
            stmt.setInt(4, e.getId());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Exercicio Atualizado com Sucesso!");
            
        } catch (SQLException ex) {
            Logger.getLogger(ExercicioDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao Atualizado Exercicio"+ex);
        }finally{
            Conexao.closeConnection(con, stmt);
        }
    }
        
    public void delete(Exercicio e){
        
        Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("DELETE FROM tb_exercicio WHERE id = ?");  
            stmt.setInt(1, e.getId());
            
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
