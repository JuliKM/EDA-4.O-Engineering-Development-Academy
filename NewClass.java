
package Shogi;

public class NewClass {
     public static void main(String[] args) {
         Tablero tab = new Tablero();
         tab.iniciarPartida();
         System.out.println("Ubicacion file"+ tab.getCasilleros());
         tab.mostrarTablero();
         Interfaz inte =new Interfaz();
         inte.Turno();
         Movimientos mov = new Movimientos();
         do{
        inte.jugar();
        inte.Turno();     
             
         }while(mov.JaqueMate()==false);
         System.out.println("La partida ha finalizado");
     }
 
         
     }

