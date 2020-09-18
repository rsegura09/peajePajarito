import java.util.List;
import java.util.ArrayList;

import udem.edu.co.vehiculos.Automovil;
import udem.edu.co.vehiculos.Camion;
import udem.edu.co.vehiculos.Moto;


public class peajePajarito {


    public static void main(String[] args) {
        
        List vehiculos = new ArrayList();
        vehiculos.add(new Moto());
        vehiculos.add(new Camion());
        vehiculos.add(new Automovil());   
       
    }   
}
