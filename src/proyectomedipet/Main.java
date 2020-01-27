package proyectomedipet;

import java.awt.Image;
import java.awt.Toolkit;
import vista.VentanaPrincipal;


public class Main {

    public static void main(String[] args) {
        
        VentanaPrincipal vp = new VentanaPrincipal();
        vp.setVisible(true);
        vp.setTitle("MediPet");
        vp.setLocationRelativeTo(null);
        
        Toolkit miPantalla = Toolkit.getDefaultToolkit();
        Image iconoPet = miPantalla.getImage("src/img/iconpet.png");
        vp.setIconImage(iconoPet);
        
        
                
        
        
    }
    
}
