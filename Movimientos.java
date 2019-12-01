package Shogi;

import java.util.Scanner;

public class Movimientos {

    private Pieza pieza = new Pieza();
    private Interfaz inte = new Interfaz();
    private Tablero tab = new Tablero();
    private int[][] casi;
    private int[][] setCasi;
    private Capturas capturas = new Capturas();
    Scanner leer = new Scanner(System.in);

    public void aLugarVacio() {
        tab.getCasilleros();
        inte.getFilaInicial();
        inte.getColumnaInicial();
        inte.getColumna();
        inte.getFila();
        if (inte.Turno() == true) {
            switch (tab.getCasilleros()[inte.getFilaInicial()][inte.getColumnaInicial()]) {
                case 11:
                    setCasi[inte.getFilaInicial()][inte.getColumnaInicial()] = 10;
                    tab.setCasilleros(setCasi);
                    setCasi[inte.getFila()][inte.getColumna()] = 11;
                    tab.setCasilleros(setCasi);
                    break;
                case 12:
                    setCasi[inte.getFilaInicial()][inte.getColumnaInicial()] = 10;
                    tab.setCasilleros(setCasi);
                    setCasi[inte.getFila()][inte.getColumna()] = 12;
                    tab.setCasilleros(setCasi);
                    break;
                case 13:
                    setCasi[inte.getFilaInicial()][inte.getColumnaInicial()] = 10;
                    tab.setCasilleros(setCasi);
                    setCasi[inte.getFila()][inte.getColumna()] = 13;
                    tab.setCasilleros(setCasi);
                    break;
                case 14:
                    setCasi[inte.getFilaInicial()][inte.getColumnaInicial()] = 10;
                    tab.setCasilleros(setCasi);
                    setCasi[inte.getFila()][inte.getColumna()] = 14;
                    tab.setCasilleros(setCasi);
                    break;
                case 15:
                    setCasi[inte.getFilaInicial()][inte.getColumnaInicial()] = 10;
                    tab.setCasilleros(setCasi);
                    setCasi[inte.getFila()][inte.getColumna()] = 15;
                    tab.setCasilleros(setCasi);
                    break;
                case 16:
                    setCasi[inte.getFilaInicial()][inte.getColumnaInicial()] = 10;
                    tab.setCasilleros(setCasi);
                    setCasi[inte.getFila()][inte.getColumna()] = 16;
                    tab.setCasilleros(setCasi);
                    break;
                case 17:
                    setCasi[inte.getFilaInicial()][inte.getColumnaInicial()] = 10;
                    tab.setCasilleros(setCasi);
                    setCasi[inte.getFila()][inte.getColumna()] = 17;
                    tab.setCasilleros(setCasi);
                    break;
                case 18:
                    setCasi[inte.getFilaInicial()][inte.getColumnaInicial()] = 10;
                    tab.setCasilleros(setCasi);
                    setCasi[inte.getFila()][inte.getColumna()] = 15;
                    tab.setCasilleros(setCasi);
                    break;
                case 19:
                    setCasi[inte.getFilaInicial()][inte.getColumnaInicial()] = 10;
                    tab.setCasilleros(setCasi);
                    setCasi[inte.getFila()][inte.getColumna()] = 19;
                    tab.setCasilleros(setCasi);
                    break;
                case 21:
                    setCasi[inte.getFilaInicial()][inte.getColumnaInicial()] = 10;
                    tab.setCasilleros(setCasi);
                    setCasi[inte.getFila()][inte.getColumna()] = 21;
                    tab.setCasilleros(setCasi);
                    break;
                case 22:
                    setCasi[inte.getFilaInicial()][inte.getColumnaInicial()] = 10;
                    tab.setCasilleros(setCasi);
                    setCasi[inte.getFila()][inte.getColumna()] = 23;
                    tab.setCasilleros(setCasi);
                    break;
                case 23:
                    setCasi[inte.getFilaInicial()][inte.getColumnaInicial()] = 10;
                    tab.setCasilleros(setCasi);
                    setCasi[inte.getFila()][inte.getColumna()] = 23;
                    tab.setCasilleros(setCasi);
                    break;
                case 24:
                    setCasi[inte.getFilaInicial()][inte.getColumnaInicial()] = 10;
                    tab.setCasilleros(setCasi);
                    setCasi[inte.getFila()][inte.getColumna()] = 24;
                    tab.setCasilleros(setCasi);
                    break;
                case 25:
                    setCasi[inte.getFilaInicial()][inte.getColumnaInicial()] = 10;
                    tab.setCasilleros(setCasi);
                    setCasi[inte.getFila()][inte.getColumna()] = 25;
                    tab.setCasilleros(setCasi);
                    break;
                case 26:
                    setCasi[inte.getFilaInicial()][inte.getColumnaInicial()] = 10;
                    tab.setCasilleros(setCasi);
                    setCasi[inte.getFila()][inte.getColumna()] = 27;
                    tab.setCasilleros(setCasi);
                    break;
                case 27:
                    setCasi[inte.getFilaInicial()][inte.getColumnaInicial()] = 10;
                    tab.setCasilleros(setCasi);
                    setCasi[inte.getFila()][inte.getColumna()] = 27;
                    tab.setCasilleros(setCasi);
                    break;
                case 28:
                    setCasi[inte.getFilaInicial()][inte.getColumnaInicial()] = 10;
                    tab.setCasilleros(setCasi);
                    setCasi[inte.getFila()][inte.getColumna()] = 28;
                    tab.setCasilleros(setCasi);
                    break;
                case 29:
                    setCasi[inte.getFilaInicial()][inte.getColumnaInicial()] = 10;
                    tab.setCasilleros(setCasi);
                    setCasi[inte.getFila()][inte.getColumna()] = 29;
                    tab.setCasilleros(setCasi);
                    break;
            }

        } else {
            System.out.println("Turno del otro jugador");
        }
    }

    public void capturar() {
        Integer capturada = null;
        if (inte.Turno() == true) {
            switch (tab.getCasilleros()[inte.getFilaInicial()][inte.getColumnaInicial()]) {
                case 11:
                    capturada = casi[inte.getFila()][inte.getColumna()];
                    setCasi[inte.getFilaInicial()][inte.getColumnaInicial()] = 10;
                    tab.setCasilleros(setCasi);
                    setCasi[inte.getFila()][inte.getColumna()] = 11;
                    tab.setCasilleros(setCasi);
                    capturas.getGoteCap().add(capturada);
                    break;
                case 12:
                    capturada = casi[inte.getFila()][inte.getColumna()];
                    setCasi[inte.getFilaInicial()][inte.getColumnaInicial()] = 10;
                    tab.setCasilleros(setCasi);
                    setCasi[inte.getFila()][inte.getColumna()] = 12;
                    tab.setCasilleros(setCasi);
                    capturas.getGoteCap().add(capturada);
                    break;
                case 13:
                    capturada = casi[inte.getFila()][inte.getColumna()];
                    setCasi[inte.getFilaInicial()][inte.getColumnaInicial()] = 10;
                    tab.setCasilleros(setCasi);
                    setCasi[inte.getFila()][inte.getColumna()] = 13;
                    tab.setCasilleros(setCasi);
                    capturas.getGoteCap().add(capturada);
                    break;
                case 14:
                    capturada = casi[inte.getFila()][inte.getColumna()];
                    setCasi[inte.getFilaInicial()][inte.getColumnaInicial()] = 10;
                    tab.setCasilleros(setCasi);
                    setCasi[inte.getFila()][inte.getColumna()] = 14;
                    tab.setCasilleros(setCasi);
                    capturas.getGoteCap().add(capturada);
                    break;
                case 15:
                    capturada = casi[inte.getFila()][inte.getColumna()];
                    setCasi[inte.getFilaInicial()][inte.getColumnaInicial()] = 10;
                    tab.setCasilleros(setCasi);
                    setCasi[inte.getFila()][inte.getColumna()] = 15;
                    tab.setCasilleros(setCasi);
                    capturas.getGoteCap().add(capturada);
                    break;
                case 16:
                    capturada = casi[inte.getFila()][inte.getColumna()];
                    setCasi[inte.getFilaInicial()][inte.getColumnaInicial()] = 10;
                    tab.setCasilleros(setCasi);
                    setCasi[inte.getFila()][inte.getColumna()] = 16;
                    tab.setCasilleros(setCasi);
                    capturas.getGoteCap().add(capturada);
                    break;

                case 17:
                    capturada = casi[inte.getFila()][inte.getColumna()];
                    setCasi[inte.getFilaInicial()][inte.getColumnaInicial()] = 10;
                    tab.setCasilleros(setCasi);
                    setCasi[inte.getFila()][inte.getColumna()] = 17;
                    tab.setCasilleros(setCasi);
                    capturas.getGoteCap().add(capturada);
                    break;

                case 18:
                    capturada = casi[inte.getFila()][inte.getColumna()];
                    setCasi[inte.getFilaInicial()][inte.getColumnaInicial()] = 10;
                    tab.setCasilleros(setCasi);
                    setCasi[inte.getFila()][inte.getColumna()] = 15;
                    tab.setCasilleros(setCasi);
                    capturas.getGoteCap().add(capturada);
                    break;

                case 19:
                    capturada = casi[inte.getFila()][inte.getColumna()];
                    setCasi[inte.getFilaInicial()][inte.getColumnaInicial()] = 10;
                    tab.setCasilleros(setCasi);
                    setCasi[inte.getFila()][inte.getColumna()] = 19;
                    tab.setCasilleros(setCasi);
                    capturas.getGoteCap().add(capturada);
                    break;

                case 21:
                    capturada = casi[inte.getFila()][inte.getColumna()];
                    setCasi[inte.getFilaInicial()][inte.getColumnaInicial()] = 10;
                    tab.setCasilleros(setCasi);
                    setCasi[inte.getFila()][inte.getColumna()] = 21;
                    tab.setCasilleros(setCasi);
                    capturas.getSenteCap().add(capturada);

                    break;

                case 22:
                    capturada = casi[inte.getFila()][inte.getColumna()];
                    setCasi[inte.getFilaInicial()][inte.getColumnaInicial()] = 10;
                    tab.setCasilleros(setCasi);
                    setCasi[inte.getFila()][inte.getColumna()] = 23;
                    tab.setCasilleros(setCasi);
                    capturas.getSenteCap().add(capturada);
                    break;
                case 23:
                    capturada = casi[inte.getFila()][inte.getColumna()];
                    setCasi[inte.getFilaInicial()][inte.getColumnaInicial()] = 10;
                    tab.setCasilleros(setCasi);
                    setCasi[inte.getFila()][inte.getColumna()] = 23;
                    tab.setCasilleros(setCasi);
                    capturas.getSenteCap().add(capturada);
                    break;
                case 24:
                    capturada = casi[inte.getFila()][inte.getColumna()];
                    setCasi[inte.getFilaInicial()][inte.getColumnaInicial()] = 10;
                    tab.setCasilleros(setCasi);
                    setCasi[inte.getFila()][inte.getColumna()] = 24;
                    tab.setCasilleros(setCasi);
                    capturas.getSenteCap().add(capturada);
                    break;
                case 25:
                    capturada = casi[inte.getFila()][inte.getColumna()];
                    setCasi[inte.getFilaInicial()][inte.getColumnaInicial()] = 10;
                    tab.setCasilleros(setCasi);
                    setCasi[inte.getFila()][inte.getColumna()] = 25;
                    tab.setCasilleros(setCasi);
                    capturas.getSenteCap().add(capturada);
                    break;
                case 26:
                    capturada = casi[inte.getFila()][inte.getColumna()];
                    setCasi[inte.getFilaInicial()][inte.getColumnaInicial()] = 10;
                    tab.setCasilleros(setCasi);
                    setCasi[inte.getFila()][inte.getColumna()] = 27;
                    tab.setCasilleros(setCasi);
                    capturas.getSenteCap().add(capturada);
                    break;
                case 27:
                    capturada = casi[inte.getFila()][inte.getColumna()];
                    setCasi[inte.getFilaInicial()][inte.getColumnaInicial()] = 10;
                    tab.setCasilleros(setCasi);
                    setCasi[inte.getFila()][inte.getColumna()] = 27;
                    tab.setCasilleros(setCasi);
                    capturas.getSenteCap().add(capturada);
                    break;
                case 28:
                    capturada = casi[inte.getFila()][inte.getColumna()];
                    setCasi[inte.getFilaInicial()][inte.getColumnaInicial()] = 10;
                    tab.setCasilleros(setCasi);
                    setCasi[inte.getFila()][inte.getColumna()] = 28;
                    tab.setCasilleros(setCasi);
                    capturas.getSenteCap().add(capturada);
                    break;
                case 29:
                    capturada = casi[inte.getFila()][inte.getColumna()];
                    setCasi[inte.getFilaInicial()][inte.getColumnaInicial()] = 10;
                    tab.setCasilleros(setCasi);
                    setCasi[inte.getFila()][inte.getColumna()] = 29;
                    tab.setCasilleros(setCasi);
                    capturas.getSenteCap().add(capturada);
                    break;
            }

        } else {
            System.out.println("Turno del otro jugador");
        }

    }

    public void introducir() {
        if (casi[inte.getFila()][inte.getColumna()] != 10) {
            System.out.println("Esa casilla se encuentra ocupada");
        } else {
            System.out.println("Elija que pieza quiere introducir");
        }
        {
            if (inte.Turno() == false) {
                for (Integer ficha : capturas.getGoteCap()) {
                    System.out.println("ficha" + ficha);
                }
                Integer pieza = leer.nextInt();
                for (Integer ficha : capturas.getGoteCap()) {
                    if (capturas.getGoteCap().equals(pieza)) {
                        capturas.getGoteCap().remove(pieza);
                        casi[inte.getFila()][inte.getColumna()] = pieza;
                        tab.setCasilleros(casi);
                    }
                }

            } else if (inte.Turno() == true) {
                for (Integer ficha : capturas.getSenteCap()) {
                    System.out.println("ficha" + ficha);
                }
                Integer pieza = leer.nextInt();
                for (Integer ficha : capturas.getSenteCap()) {
                    if (capturas.getSenteCap().equals(pieza)) {
                        capturas.getSenteCap().remove(pieza);
                        casi[inte.getFila()][inte.getColumna()] = pieza;
                        tab.setCasilleros(casi);
                    }
                }

            }

        }
    }
    
    public void Promocionar(){
        
    }

    public boolean validarMov() {

        return false;
    }

    public boolean Jaque() {

        return false;
    }

    public boolean JaqueMate() {
        return true;
    }

    public Pieza getPieza() {
        return pieza;
    }

    public void setPieza(Pieza pieza) {
        this.pieza = pieza;
    }

    public Interfaz getInte() {
        return inte;
    }

    public void setInte(Interfaz inte) {
        this.inte = inte;
    }

    public Tablero getTab() {
        return tab;
    }

    public void setTab(Tablero tab) {
        this.tab = tab;
    }

    public Capturas getCapturas() {
        return capturas;
    }

    public void setCapturas(Capturas capturas) {
        this.capturas = capturas;
    }

    public int[][] getCasi() {
        return casi;
    }

    public void setCasi(int[][] casi) {
        this.casi = casi;
    }

    public int[][] getSetCasi() {
        return setCasi;
    }

    public void setSetCasi(int[][] setCasi) {
        this.setCasi = setCasi;
    }

}
