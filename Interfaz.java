package Shogi;

import java.util.Scanner;

public class Interfaz {

    private int ficha;
    private int filaInicial;
    private int columnaInicial;
    private int fila;
    private int columna;
    private int cont = 0;

    public Interfaz(int ficha, int fila, int columna) {
        this.ficha = ficha;
        this.fila = fila;
        this.columna = columna;
    }

    public Interfaz(int ficha) {
        this.ficha = ficha;
    }

    public Interfaz(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
    }

    public Interfaz() {
    }

    public void jugar() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Indique la posicion de la ficha que desearia mover(desde arriba hacia abajo y de izquierda a derecha, ingresar fila y columna)");
        filaInicial = leer.nextInt();
        columnaInicial = leer.nextInt();
        System.out.println("Indique a que casilla le gustaria mover la ficha (desde arriba hacia abajo y de izquierda a derecha, ingresar fila y columna)");
        fila = leer.nextInt();
        columna = leer.nextInt();

    }

    public Interfaz(int ficha, int filaInicial, int columnaInicial, int fila, int columna) {
        this.ficha = ficha;
        this.filaInicial = filaInicial;
        this.columnaInicial = columnaInicial;
        this.fila = fila;
        this.columna = columna;
    }

    public boolean Turno() {

        if (cont % 2 == 0) {
            System.out.println("Ahora juega Sente (primer jugador)");
            cont++;
            return true;
        } else {

            System.out.println("Ahora juega Gote (segundo jugador)");
            cont++;
            return false;
        }
    }

    public int getFicha() {
        return ficha;
    }

    public void setFicha(int ficha) {
        this.ficha = ficha;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    public int getFilaInicial() {
        return filaInicial;
    }

    public void setFilaInicial(int filaInicial) {
        this.filaInicial = filaInicial;
    }

    public int getColumnaInicial() {
        return columnaInicial;
    }

    public void setColumnaInicial(int columnaInicial) {
        this.columnaInicial = columnaInicial;
    }
}
