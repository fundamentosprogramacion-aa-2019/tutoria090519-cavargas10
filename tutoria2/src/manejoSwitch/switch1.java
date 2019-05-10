package manejoSwitch;
/**
 *
 * @author cavargas10
 */
public class switch1 {
    public static void main(String[] args) {
        
        String cadena = "Martes ";
        
        switch (cadena){
            case "Lunes":
                System.out.printf("Dia %s\n" ,cadena);
                break;
            
            case "Martes":
                System.out.printf("Dia %s\n", cadena);
                break;
             
            default:
                System.out.println("Ninguna opcion es valida \n");
        }
    }
}
