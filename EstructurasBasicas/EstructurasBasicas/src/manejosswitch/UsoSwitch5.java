package manejosswitch;

import java.util.Scanner;

public class UsoSwitch5 {

    public static void main(String[] args) {
        // TODO code application logic here
    Scanner entrada = new Scanner(System.in);
    String placa = "";
    
    System.out.println("Ingrese la primera letra de la placa de su Vehículo");
        placa = entrada.nextLine();

        char valor = placa.charAt(0);
                
        switch(valor){
            case 'o':
            case'O':
                System.out.printf("Su placa pertenece a la provincia del Oro\n"
                        + " %s\n",valor, placa);
                break;
            case 'e':
            case 'E':    
                System.out.printf("Su placa pertenece a la provincia de "
                        + "Esmeraldas\n");
                break;
            case 'r':
            case 'R':    
                System.out.printf("Su placa pertenece a la provincia de Los "
                        + "Ríos\n");
                break;    
            case 'g':
            case 'G':    
                System.out.printf("Su placa pertenece a la provincia del "
                        + "Guayas\n");
                break;  
            case 'm':
            case 'M':    
                System.out.printf("Su placa pertenece a la provincia de"
                        + " Manabí");
                        
                break;   
            case 'y':
            case 'Y':    
                System.out.printf("Su placa pertenece a la provincia de "
                        + "Santa Elena\n");
                break;    
            case 'j':
            case 'J':    
                System.out.printf("Su placa pertenece a la provincia de "
                        + "Santo Domingo\n");
                break;             
            default:
                System.out.println("Su placa es de la Sierra\n");
                
        }
        
    }
}
