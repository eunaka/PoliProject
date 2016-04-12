package br.poli.polijunior.poliproject.dao;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Wanessa
 */
public class ConectaBD {
    
    public static Connection conectabd()throws ClassNotFoundException, SQLException{
        
       try{
            Class.forName("com.mysql.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/polijr","root","root");            
JOptionPane.showMessageDialog(null, "Conectado ao Banco de Dados com sucesso!");
            return con;
            
        }catch(SQLException error){
            JOptionPane.showMessageDialog(null, "Conexão sem sucesso. Banco de Dados não existe! ");
            JOptionPane.showMessageDialog(null, error);
            System.exit(0);
            return null;            
        }
        
    }
}

