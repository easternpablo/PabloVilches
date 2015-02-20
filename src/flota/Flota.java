/*
Hundir la flota 1.

Vamos a crea una versión muy simplificada del juego Hundir la flota.

Clase Tablero: representa un tablero de juego de Hundir la Flota.

● Atributos
   - tablero: un array bidimensional de caracteres, de tamaño 10x10

      En cada posición del array puede haber uno de los siguientes caracteres:
           O   hay un barco no descubierto en esa posición.
           X   hay un barco tocado en esa posición.
           .    posición en la que se ha disparado pero donde no hay ningún barco.
                (espacio) posición donde no hay ningún barco y donde aún no se ha disparado.

● Métodos
   - constructor: Pone todas las posiciones del array a " " (espacios).
   - generar: crea 6 barcos que ocupan una sola casilla, en posiciones aleatorias del tablero.
                    Para colocar un barco basta con establecer la posición correspondiente del array con el char 'O'
   - mostrar: muestra el tablero de este modo:

                1  2  3  4  5  6  7  8  9 10
             A         O  .   .   .  
             B      .   .          X  .    .   .   .
             C 
             D     O                     O   .   .
             E  .   .      O                      X
             F
             G                     O     O
             H X  
             I              X  .           .

   - disparar: recibe como parámetros una fila (char) y una columna (int). Marca la posición del array con el carácter correspondiente (X para tocado, un punto para agua). Devuelve 0 para 'agua', 1 para 'tocado'.

-------------------
*/
package flota;

import java.util.Arrays;

public class Flota{
    char[][] tablero;
    // - constructor: Pone todas las posiciones del array a " " (espacios).
    public Flota(){
        this.tablero = new char[10][10];
        
        for (char[] filas: tablero) {
            Arrays.fill( filas,' '); 
        }
    }

    //generar: crea 6 barcos que ocupan una sola casilla, en posiciones aleatorias del tablero.
    //Para colocar un barco basta con establecer la posición correspondiente del array con el char 'O'
    public void generar(){
        int fila= (int)(Math.random()*10);
        int columna= (int)(Math.random()*10);
        
        this.tablero[fila][columna] = 'O';
        
    }

    //mostrar: muestra el tablero de este modo:
    public void mostrar(){
        int enumeracion = 65;
        System.out.print("  ");
        for (int i = 0; i < tablero.length; i++) System.out.print(i+" ");
        
        for (char[] filas: tablero) {
            System.out.print("\n"+(char)enumeracion+++" ");
            for(char caracter: filas){
                System.out.print(caracter+" ");
            }
        }   
        System.out.println("");
        System.out.print("");    
    }
    //disparar: recibe como parámetros una fila (char) y una columna (int). Marca la posición del array con el carácter correspondiente (X para tocado, un punto para agua). Devuelve 0 para 'agua', 1 para 'tocado'.
    public boolean disparar(int y,char x){
        
        int letra = (int)(x-65);
        y = y-48;
        
        if(tablero[letra][y] == 'O'){
            tablero[letra][y] = 'X';
            return true;
        }else if(tablero[letra][y] == ' '){
            tablero[letra][y] = '.';
        }
        return false;
    }
}

        
/*● Métodos
  
   - mostrar: muestra el tablero de este modo:

                1  2  3  4  5  6  7  8  9 10
             A         O  .   .   .  
             B      .   .          X  .    .   .   .
             C 
             D     O                     O   .   .
             E  .   .      O                      X
             F
             G                     O     O
             H X  
             I              X  .           .

   - disparar: recibe como parámetros una fila (char) y una columna (int). Marca la posición del array con el carácter correspondiente (X para tocado, un punto para agua). Devuelve 0 para 'agua', 1 para 'tocado'.

-------------------*/