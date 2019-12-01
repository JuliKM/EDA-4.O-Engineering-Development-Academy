/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shogi;



/**
 *
 * @author DELL
 */
public class Partida {
    
    
Tablero tablero = new Tablero();

public class Ajedrez {
    private Tablero tablero;
    private boolean equipoEnTurno;

    public Ajedrez(){
        this("promocionar");
    }

    public Ajedrez(String escenario){
        tablero = new Tablero();

        switch(escenario){
            case "coronar":
                 tablero.getCasillas() [6][6].setPieza(new Peon());            
                break;
                
            case "torre":
                 tablero.getCasillas() [0][0].setPieza(new Torre());            
                break;
            case "rey":
                tablero.getCasillas() [7][7].setPieza(new Rey());
                break;  

            default:
                colocarPiezasDeAjedrez();    
        }
        setPosicionesAPiezas();
        equipoEnTurno = false;
    }

    public Tablero getTablero(){
        return tablero;
    }


  
}


