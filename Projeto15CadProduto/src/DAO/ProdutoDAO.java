/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Persistencia.ConexaoBanco;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.ProdutoVO;

/**
 *
 * @author 182210051
 */
public class ProdutoDAO {
    
    public void cadastrarProduto (ProdutoVO pVO)throws SQLException{
            
            Connection con = ConexaoBanco.getConexao();
            
            Statement stat = (Statement) con.createStatement();
            
            
            try{
                String sql;
                
                sql="insert into produto(idproduto, nomepro, valorcusto, quantidade)"
                        + "values(null, '"+ pVO.getNome() + "',"
                        + pVO.getValorCusto() + ","
                        + pVO.getQuantidade() + " )";
                
                stat.execute(sql);
                
            }catch(SQLException e) {
                throw new SQLException (" Erro ao inserir produto");
            }finally{
                con.close();
                stat.close();
            }
    
    }
    
  }
