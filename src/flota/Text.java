/*
Clase Test con un método main que:
  - Cree un objeto tablero.
  - Genere los 6 barcos.
  - Muestre el trablero.
  - Entre en un bucle que:
       a) pregunte al usuario una coordenada (por ejemplo H5).
       b) dispare a esa coordenada.
       c) muestre con texto si ha sido tocado un barco o si ha sido agua.
       d) muestre el tablero modificado según el disparo.
    El bucle finalizará cuando el usuario teclee la palabra 'SALIR'
 */
package flota;
import java.util.Scanner;
public class Text {
    public static void main(String[] args) {
        Flota juego = new Flota();
        Scanner datos = new Scanner(System.in);
        
        for (int i = 0; i < 6; i++) {
            juego.generar();
        }
        
        String salir = "";
        
        do{
            System.out.println("indique numero(0-9) y  letra (A-J)");
            System.out.println("'salir' para abandonar el programa");
            
            salir = datos.nextLine();

            salir = salir.toUpperCase();
            
            if(salir.equals("SALIR"))break;
            
            int numero = (salir.charAt(0));
                
            char letra = salir.charAt(salir.length()-1);
           
            if(juego.disparar(numero,letra))
                System.out.println("TOCADO");
                else System.out.println("AGUA");
            
            juego.mostrar(); 
           
            
        }while(true);
        
        
        
    }
    
}