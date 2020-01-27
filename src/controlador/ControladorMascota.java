package controlador;

import db.Conexion;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import modelo.Mascota;

public class ControladorMascota {
    
    public void mascotaAlmacenar(Mascota mascota){
        
        Conexion conexion = new Conexion();
        
        try {
            
            Connection conn = conexion.getConnection();
            Statement stmt = conn.createStatement();
            
            String consulta = "INSERT INTO MASCOTA VALUES ("
                    + "" + mascota.getId_mascota() + ", "
                    + "'" + mascota.getNom_mascota() + "', "
                    + "" + mascota.getEdad_mascota() + ", "
                    + "'" + mascota.getTipo_mascota() + "', "
                    + "" + mascota.isAte_hist_mascota() + ", "
                    + "" + mascota.getCant_ate_mascota() + ", "
                    + "" + mascota.isProp_mascota() + ", "
                    + "'" + mascota.getNom_prop() + "', "
                    + "'" + mascota.getDesc_mascota() + "');";
            
            stmt.executeUpdate(consulta);
            System.out.println("CONSULTA A INSERTAR: " + consulta);  
        }
        
        catch (Exception err) {
            System.out.println("ERROR: " + err.getMessage());
        }
    }
    
    
    public ArrayList<Mascota>mascotaListar(String nombre){
        
        ArrayList<Mascota>listaMascotas = new ArrayList<>();
        Conexion conexion = new Conexion();
        
        try {
            
            Connection conn = conexion.getConnection();
            Statement stmt = conn.createStatement();
            
            String consulta = "SELECT id_mascota, nom_mascota, edad_mascota, "
                    + "tipo_mascota, ate_hist_mascota, cant_ate_mascota, "
                    + "prop_mascota, nom_prop, desc_mascota FROM mascota "
                    + "WHERE nom_mascota LIKE '" + nombre + "%' ORDER BY id_mascota"
                    + ", nom_mascota;";
            
            System.out.println("CONSULTA A EJECUTAR: " + consulta);
            
            ResultSet rs = stmt.executeQuery(consulta);
            
            while (rs.next()){
                
                Mascota mascota = new Mascota();
                
                mascota.setId_mascota(rs.getInt("id_mascota"));
                mascota.setNom_mascota(rs.getString("nom_mascota"));
                mascota.setEdad_mascota(rs.getInt("edad_mascota"));
                mascota.setTipo_mascota(rs.getString("tipo_mascota"));
                mascota.setAte_hist_mascota(rs.getBoolean("ate_hist_mascota"));
                mascota.setCant_ate_mascota(rs.getInt("cant_ate_mascota"));
                mascota.setProp_mascota(rs.getBoolean("prop_mascota"));
                mascota.setNom_prop(rs.getString("nom_prop"));
                mascota.setDesc_mascota(rs.getString("desc_mascota"));
                
                listaMascotas.add(mascota);
                
                
            }
            return listaMascotas;    
        }
        
        catch (Exception err) {
            System.out.println("ERROR: " + err.getMessage());
            return new ArrayList<Mascota>();
        }   
    }
    
    
    public ArrayList<Mascota>mascotaListarCombo(String tipo){
        
        ArrayList<Mascota>listaMascotas = new ArrayList<>();
        Conexion conexion = new Conexion();
        
        try {
            
            Connection conn = conexion.getConnection();
            Statement stmt = conn.createStatement();
            
            String consulta = "SELECT id_mascota, nom_mascota, edad_mascota, "
                    + "tipo_mascota, ate_hist_mascota, cant_ate_mascota, "
                    + "prop_mascota, nom_prop, desc_mascota FROM mascota "
                    + "WHERE tipo_mascota = '" + tipo + "';";
            
            System.out.println("CONSULTA A EJECUTAR: " + consulta);
            
            ResultSet rs = stmt.executeQuery(consulta);
            
            while (rs.next()){
                
                Mascota mascota = new Mascota();
                
                mascota.setId_mascota(rs.getInt("id_mascota"));
                mascota.setNom_mascota(rs.getString("nom_mascota"));
                mascota.setEdad_mascota(rs.getInt("edad_mascota"));
                mascota.setTipo_mascota(rs.getString("tipo_mascota"));
                mascota.setAte_hist_mascota(rs.getBoolean("ate_hist_mascota"));
                mascota.setCant_ate_mascota(rs.getInt("cant_ate_mascota"));
                mascota.setProp_mascota(rs.getBoolean("prop_mascota"));
                mascota.setNom_prop(rs.getString("nom_prop"));
                mascota.setDesc_mascota(rs.getString("desc_mascota"));
                
                listaMascotas.add(mascota);
                
                
            }
            return listaMascotas;    
        }
        
        catch (Exception err) {
            System.out.println("ERROR: " + err.getMessage());
            return new ArrayList<Mascota>();
        }   
    }
    
    
    public void mascotaEliminar(String id) throws Exception {
        
        Conexion conexion = new Conexion();
        
        try {
            
            Connection conn = conexion.getConnection();
            Statement stmt = conn.createStatement();
            
            String consulta = "DELETE FROM mascota WHERE id_mascota = "
                    + "'" + id + "';";
            System.out.println("CONSULTA A EJECUTAR: " + consulta);
            stmt.executeUpdate(consulta);
            
            
        }
        
        catch (Exception err) {
            
            System.out.println("ERROR: " +err.getMessage());
            throw err;
            
        }   
    }
    
    
    public void mascotaModificar(Mascota mascota) throws Exception {
        
        Conexion conexion = new Conexion();
        
        try {
            
            Connection conn = conexion.getConnection();
            Statement stmt = conn.createStatement();
            
            String consulta = "UPDATE mascota SET "
                    + "nom_mascota = " + "'" + mascota.getNom_mascota() + "', "
                    + "edad_mascota = " + "" + mascota.getEdad_mascota() + ", "
                    + "tipo_mascota = " + "'" + mascota.getTipo_mascota() + "', "
                    + "ate_hist_mascota = " + "" + mascota.isAte_hist_mascota() + ", "
                    + "cant_ate_mascota = " + "" + mascota.getCant_ate_mascota() + ", "
                    + "prop_mascota = " + "" + mascota.isProp_mascota() + ", "
                    + "nom_prop = " + "'" + mascota.getNom_prop() + "', "
                    + "desc_mascota = " + "'" + mascota.getDesc_mascota() + "' "
                    + "WHERE id_mascota = " + mascota.getId_mascota() + ";";
            
            System.out.println("CONSULTA A EJECUTAR: " + consulta);
            stmt.executeUpdate(consulta);   
        }
        
        catch (Exception err) {
            
            System.out.println("ERROR: " + err.getMessage());
            throw err;
        }  
    }
    
    
    public Mascota mascotaObtenerPorId(int id) {
        
        Mascota mascota = new Mascota();
        Conexion conexion = new Conexion();
        
        try {
            
            Connection conn = conexion.getConnection();
            Statement stmt = conn.createStatement();
            
            String consulta = "SELECT id_mascota, nom_mascota, edad_mascota, "
                    + "tipo_mascota, ate_hist_mascota, cant_ate_mascota, "
                    + "prop_mascota, nom_prop, desc_mascota FROM mascota "
                    + "WHERE id_mascota = " + id + ";";
            
            System.out.println("CONSULTA A EJECUTAR: " + consulta);
            
            ResultSet rs = stmt.executeQuery(consulta);
            
            while (rs.next()){
                
                
                
                mascota.setId_mascota(rs.getInt("id_mascota"));
                mascota.setNom_mascota(rs.getString("nom_mascota"));
                mascota.setEdad_mascota(rs.getInt("edad_mascota"));
                mascota.setTipo_mascota(rs.getString("tipo_mascota"));
                mascota.setAte_hist_mascota(rs.getBoolean("ate_hist_mascota"));
                mascota.setCant_ate_mascota(rs.getInt("cant_ate_mascota"));
                mascota.setProp_mascota(rs.getBoolean("prop_mascota"));
                mascota.setNom_prop(rs.getString("nom_prop"));
                mascota.setDesc_mascota(rs.getString("desc_mascota"));
                
                
                
                
            }
            return mascota;     
        }
        
        catch (Exception err) {
            System.out.println("ERROR: " + err.getMessage());
            return new Mascota();
        }
                
        
    }
    
    
    
    
    
}
