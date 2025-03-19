/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author const
 */
public class ConsultasUsuario extends Conexion{
    
    //Insertar
    public boolean registrar (Usuario usu){
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "INSERT INTO usuarios (nombre,email) values (?,?)";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, usu.getNombre());
            ps.setString(2, usu.getEmail());
            ps.execute();
            return true;
        }catch (SQLException e){
            System.err.println(e);
            return false;
        }
        
    }
    
    public boolean modificar (Usuario usu){
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "UPDATE usuarios SET  nombre = ?, email = ? WHERE id=? ";
        
        try{
            ps = con.prepareStatement(sql);
            
            ps.setString(1, usu.getNombre());
            ps.setString(2, usu.getEmail());
            ps.setInt(3, usu.getId());
            ps.execute();
            return true;
        }catch (SQLException e){
            System.err.println(e);
            return false;
        }
        
    }
    public boolean eliminar (Usuario usu){
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "DELETE FROM usuarios WHERE id=? ";
        
        try{
            ps = con.prepareStatement(sql);
            
            ps.setInt(1, usu.getId());
            ps.execute();
            return true;
        }catch (SQLException e){
            System.err.println(e);
            return false;
        }
    }
    
    public List<Usuario> buscar() {
        List<Usuario> lista = new ArrayList<>();
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();

        String sql = "SELECT * FROM usuarios ";

        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Usuario usu = new Usuario();
                usu.setId(rs.getInt("id"));
                usu.setNombre(rs.getString("nombre"));
                usu.setEmail(rs.getString("email"));
                lista.add(usu);
            }
        } catch (SQLException e) {
            System.err.println(e);
            
        }
        return lista;
    }
}
