/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


/**
 *
 * @author JENG-PC
 */
public class SuperheroeDAO {
    
    public void ListarSuperheroe (Connection conn, JComboBox nom_superheroe){
        PreparedStatement pst;
        String tabla = "superheroe";        
        String sql = "select nom_super from " +tabla;
        try {
            pst = conn.prepareStatement(sql);
            ResultSet result = pst.executeQuery();
            while (result.next()) {             
                
                nom_superheroe.addItem(result.getString("nom_super"));
            }
        } catch (SQLException | NullPointerException e) {
            System.out.println("No se pudo listar el nombre del superheroe" + e.getMessage());
        }   
    }
    
     
     public int consultaVidaHeroe (Connection conn, String sel_heroe){
         int vida = 0;
         PreparedStatement pst = null;
         String tabla = "superheroe";         
         String sql = "select vida_super from " + tabla + " where nom_super =  ? ";        
         try{
             pst = conn.prepareStatement(sql);             
             pst.setString(1,sel_heroe);             
             ResultSet rs = pst.executeQuery();
             while(rs.next()){
                  vida = rs.getInt("vida_super");
             }             
             pst.execute();
             pst.close();
         }catch(SQLException | NullPointerException e){
             System.out.print("Error no hay vida: " + e.getMessage());
         }
           return vida;    
     }
     public void InsertarSuper(Connection conn,JTextField name,JTextField salud){
           try{
            PreparedStatement pst = null;
            String insertar = "insert into SUPERHEROE.SUPERHEROE (nom_super,vida_super,id_super) values (?,?,id_super.nextval);";
            pst = conn.prepareStatement(insertar);
            pst.setString(1, name.getText().trim());
            pst.setInt(2, Integer.parseInt(salud.getText().trim()));           
            pst.executeQuery();
        }catch(Exception error){
            JOptionPane.showMessageDialog(null, error);
        }
     
     
     }
    
}
