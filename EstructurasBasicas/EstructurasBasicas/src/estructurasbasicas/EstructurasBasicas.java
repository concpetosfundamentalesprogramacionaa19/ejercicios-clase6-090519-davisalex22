package estructurasbasicas;
import java.util.Scanner;
public class EstructurasBasicas {
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        String mensajeFinal = "";
        String nombre = "David Alexander";
        String apellido = "Salazar Solórzano";
        String profesion = "Alumno";
        
        int contador = 1;                                           
        mensajeFinal = String.format("%s%s\n\n",mensajeFinal,
                "Informe de la ciudad de Loja");
        mensajeFinal = String.format("%s%s\n\n",mensajeFinal,
                "Listado de Personas");
        while(contador <5 ){
            System.out.println("Ingrese sus nombre:\n");
            nombre = entrada.nextLine();
            System.out.println("Ingrese sus apellidos:\n");
            apellido = entrada.nextLine();
            System.out.println("Ingrese su profesión:\n");
            profesion = entrada.nextLine();
         
            mensajeFinal = String.format("%sPersona %d: %s %s - %s\n",
                    mensajeFinal,contador,nombre,apellido,profesion);
            
            contador = contador + 1; //que el contador se incremente
        }
        
        System.out.printf("%s", mensajeFinal);   
        
        
      
// Fin de Programa        
    }
    
}