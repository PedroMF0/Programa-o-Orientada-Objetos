/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author 182210051
 */
public class ConexaoBanco {
    
    private static String URL = "jdbc:mysql://localhost:3306/cadproduto";
    private static String USUARIO = "root";
    private static String SENHA = "";
    
    //Método que efetua a Conexão com o MySQL
    public static Connection getConexao() throws SQLException{
        Connection c = null;
        try{
            c = DriverManager.getConnection(URL, USUARIO, SENHA);
        }catch (SQLException se){
            throw new SQLException("Erro ao conectar!" + se.getMessage());
        }//fim do catch
        return c;
    }//fim do método

   
}
