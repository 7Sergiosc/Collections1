package collections1.servicios;

import collections1.entidades.Perro;
import java.util.ArrayList;
import java.util.Scanner;

public class ServicioPerro {
    
    public ArrayList<Perro> perros = new ArrayList<>();
    public Scanner input = new Scanner(System.in).useDelimiter("\n");
    
    public Perro crearPerro(){
        System.out.print("Ingresa la raza que deseas agregar> ");
        String raza = input.next();
        return new Perro(raza);
    }
    
    public void bucleAgregarRazas(){
        String continuar;
        do{
            perros.add(crearPerro());
            System.out.print("Desea agregar otra raza? Si/No> ");
            continuar = input.next();
        }while(continuar.equalsIgnoreCase("Si"));
        
        System.out.println("Las razas agregadas son las siguientes: ");
        
        mostrarRazas();
    }
    
    public void eliminarRaza(String raza){
        boolean x = true;
        
        for (int i = 0; i < perros.size(); i++) {
            String p = perros.get(i).getRaza();
            if (p.equalsIgnoreCase(raza)) {
                perros.remove(perros.get(i));
                System.out.println("Raza eliminada: " + raza);
                x = false;
                break;
            }
        }
        if(x==true){
                System.out.println("La raza '"+raza+"', no fue encontrada.");
                /*for Each forma más fácil*/
        }
        mostrarRazas();
    }
    
    public void mostrarRazas(){
        System.out.println("==================================");
        System.out.println("==============RAZAS===============");
        System.out.println("==================================");
        perros.forEach((aux) -> {
                    System.out.println(aux.toString()); /*Mostrar la lista de perros*/
                }); 
    }
}


