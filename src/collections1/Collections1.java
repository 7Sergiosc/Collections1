package collections1;

import collections1.servicios.ServicioPerro;

public class Collections1 {
    public static void main(String[] args) {
        ServicioPerro servP = new ServicioPerro();
        
        servP.bucleAgregarRazas();
        
        servP.eliminarRaza("Dobermann");
    }
}
