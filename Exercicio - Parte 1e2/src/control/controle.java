/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.SQLException;
import model.model;
import modelDAO.modelDAO;

/**
 *
 * @author aluno
 */
public class controle {
    
    public void cadastrarLivro(int Codigo,String Nome,String Categoria ) throws SQLException{
        model m1 = new model(Codigo,Nome,Categoria);
       modelDAO md = new modelDAO();
        
        try{
            md.inserirLivro(m1);
        }
        catch(SQLException ex)
        {
        }
    }
    
    public void excluirLivro(int Codigo) throws SQLException {
        modelDAO md = new modelDAO();
        md.excluirLivro(Codigo);
    }
    
}
