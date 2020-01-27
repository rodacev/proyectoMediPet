package modelo;

public class Mascota {
    
    private int id_mascota;
    private String nom_mascota;
    private int edad_mascota;
    private String tipo_mascota;
    private boolean ate_hist_mascota;
    private int cant_ate_mascota;
    private boolean prop_mascota;
    private String nom_prop;
    private String desc_mascota;
    
    
    public Mascota() {
        
        this.id_mascota = 0;
        this.nom_mascota = "";
        this.edad_mascota = 0;
        this.tipo_mascota = "";
        this.ate_hist_mascota = false;
        this.cant_ate_mascota = 0;
        this.prop_mascota = false;
        this.nom_prop = "";
        this.desc_mascota = "";
    }

    public int getId_mascota() {
        return id_mascota;
    }

    public void setId_mascota(int id_mascota) {
        this.id_mascota = id_mascota;
    }

    public String getNom_mascota() {
        return nom_mascota;
    }

    public void setNom_mascota(String nom_mascota) {
        this.nom_mascota = nom_mascota;
    }

    public int getEdad_mascota() {
        return edad_mascota;
    }

    public void setEdad_mascota(int edad_mascota) {
        this.edad_mascota = edad_mascota;
    }

    public String getTipo_mascota() {
        return tipo_mascota;
    }

    public void setTipo_mascota(String tipo_mascota) {
        this.tipo_mascota = tipo_mascota;
    }

    public boolean isAte_hist_mascota() {
        return ate_hist_mascota;
    }

    public void setAte_hist_mascota(boolean ate_hist_mascota) {
        this.ate_hist_mascota = ate_hist_mascota;
    }

    public int getCant_ate_mascota() {
        return cant_ate_mascota;
    }

    public void setCant_ate_mascota(int cant_ate_mascota) {
        this.cant_ate_mascota = cant_ate_mascota;
    }

    public boolean isProp_mascota() {
        return prop_mascota;
    }

    public void setProp_mascota(boolean prop_mascota) {
        this.prop_mascota = prop_mascota;
    }

    public String getNom_prop() {
        return nom_prop;
    }

    public void setNom_prop(String nom_prop) {
        this.nom_prop = nom_prop;
    }

    public String getDesc_mascota() {
        return desc_mascota;
    }

    public void setDesc_mascota(String desc_mascota) {
        this.desc_mascota = desc_mascota;
    }
    
    
    

    
    
    
    

    
    
    
    
    
    
    
}
