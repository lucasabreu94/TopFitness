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
import modelo.bean.Aluno;

/**
 *
 * @author ldabr
 */
public class AlunoDAO {
    
    public List<Aluno> read(){
        
        Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Aluno> alunos = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT id, nome, sexo, nasc, objetivo FROM tb_aluno");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                Aluno aluno = new Aluno();
                
                aluno.setId(rs.getInt("id"));
                aluno.setNome(rs.getString("nome"));
                aluno.setSexo(rs.getString("sexo"));
                aluno.setDatanasc(rs.getDate("nasc").toString());
                aluno.setObjetivo(rs.getString("objetivo"));
                
                alunos.add(aluno);
                
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ExercicioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            Conexao.closeConnection(con, stmt, rs);
        }
        
        return alunos;
        
    }
    
}
