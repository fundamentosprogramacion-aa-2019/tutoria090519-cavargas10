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
public class Ejemplo1 {
    public static void main(String[] args) {
        
        Scanner dentrada = new Scanner(System.in);
        String placa;
        
        System.out.println("Escriba la placa de su vehiculo: ");
        placa = dentrada.nextLine();
       
        char lplaca = placa.charAt(0); 
        
        switch(lplaca){
            case 'e':
            case 'E':
                System.out.printf("Su placa %s es de la provincia de "
                        + "Esmeraldas\n", 
                        placa.toUpperCase());
                break;
                
            case 'j':
            case 'J':
                System.out.printf("Su placa %s es de la provincia de "
                        + "Santo Domingo de los Tsachilas\n", 
                        placa.toUpperCase());
                break;
                
            case 'M':
            case 'm':
                System.out.printf("Su placa %s es de la provincia de "
                        + "Manabi\n", 
                        placa.toUpperCase());
                break;
                
            case 'r':
            case 'R':
                System.out.printf("Su placa %s es de la provincia de "
                        + "Los Rios\n", 
                        placa.toUpperCase());
                break;
                
            case 'g':
            case 'G':
                System.out.printf("Su placa %s es de la provincia de "
                        + "Guayas\n", 
                        placa.toUpperCase());
                break;
                
            case 'y':
            case 'Y':
                System.out.printf("Su placa %s es de la provincia de "
                        + "Santa Elena\n", 
                        placa.toUpperCase());
                break;
                
            case 'o':
            case 'O':
                System.out.printf("Su placa %s es de la provincia de "
                        + "El Oro\n", 
                        placa.toUpperCase());
                break;
                
            default:
                System.out.printf("La placa %s ingresada no pertenece a la "
                        + "region de la Costa\n", 
                        placa.toUpperCase ());
                
        }
    }
}
