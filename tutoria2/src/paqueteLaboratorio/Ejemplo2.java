/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteLaboratorio;

import java.util.Scanner;

/**
 *
 * @author cavargas10
 */
public class Ejemplo2 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        String placa;
        
        System.out.println("Escriba la placa de su Vehiculo: ");
        placa = entrada.nextLine();

        char lplaca = placa.charAt(0); 
        
        switch(lplaca){
            case 'k':
            case 'K':
                System.out.printf("Su placa %s es de la provincia de "
                        + "Sucumbios\n", 
                        placa.toUpperCase());
                break;
                
            case 'q':
            case 'Q':
                System.out.printf("Su placa %s es de la provincia de "
                        + "Orellana\n", 
                        placa.toUpperCase());
                break;
                
            case 'N':
            case 'n':
                System.out.printf("Su placa %s es de la provincia de "
                        + "Napo\n", 
                        placa.toUpperCase());
                break;
                
            case 's':
            case 'S':
                System.out.printf("Su placa %s es de la provincia de "
                        + "Pastaza\n", 
                        placa.toUpperCase());
                break;
                
            case 'v':
            case 'V':
                System.out.printf("Su placa %s es de la provincia de "
                        + "Morona Santiago\n", 
                        placa.toUpperCase());
                break;
                
            case 'z':
            case 'Z':
                System.out.printf("Su placa %s es de la provincia de "
                        + "Zamora Chinchipe\n", 
                        placa.toUpperCase());
                break;
                
            default:
                System.out.printf("La placa %s ingresada no pertenece a la "
                        + "Region Amazonica\n", 
                        placa.toUpperCase ());
                
        }
    }
}
