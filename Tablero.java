package Shogi;

public class Tablero {

    private int[][] casilleros = {{10, 10, 10, 10, 10, 10, 10, 10, 10}, {10, 10, 10, 10, 10, 10, 10, 10, 10}, {10, 10, 10, 10, 10, 10, 10, 10, 10},
    {10, 10, 10, 10, 10, 10, 10, 10, 10}, {10, 10, 10, 10, 10, 10, 10, 10, 10}, {10, 10, 10, 10, 10, 10, 10, 10, 10},
    {10, 10, 10, 10, 10, 10, 10, 10, 10}, {10, 10, 10, 10, 10, 10, 10, 10, 10}, {10, 10, 10, 10, 10, 10, 10, 10, 10}};
    //private static final String[] COL = {"A", "B", "C", "D", "E", "F", "G", "H", "I"};

    public Tablero() {
    }

    public void iniciarPartida() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (i == 2) {
                    casilleros[i][j] = 11;
                }
                if (i == 6) {
                    casilleros[i][j] = 21;
                }
                if ((i == 1) && (j == 7)) {
                    casilleros[i][j] = 13;
                }
                if ((i == 1) && (j == 1 )) {
                    casilleros[i][j] = 12;
                }
                if ((i == 7) && (j == 1)) {
                    casilleros[i][j] = 23;
                
                }if ((i == 7) && (j == 7)) {
                    casilleros[i][j] = 22;
                }
                
                if ((i == 0) && (j == 0 || j == 8)) {
                    casilleros[i][j] = 15;
                }
                if ((i == 8) && (j == 0 || j == 8)) {
                    casilleros[i][j] = 25;
                }
                if ((i == 0) && (j == 1 || j == 7)) {
                    casilleros[i][j] = 16;
                }
                if ((i == 8) && (j == 1 || j == 7)) {
                    casilleros[i][j] = 26;
                }
                if ((i == 0 ) && (j == 2 || j == 6)) {
                    casilleros[i][j] = 17;
                }
                if ((i == 8 ) && (j == 2 || j == 6)) {
                    casilleros[i][j] = 27;
                }
                if ((i == 0 ) && (j == 3 || j == 5)) {
                    casilleros[i][j] = 18;
                }
                if ((i == 8 ) && (j == 3 || j == 5)) {
                    casilleros[i][j] = 28;
                }
                
                if ((i == 0 ) && (j == 4)) {
                    casilleros[i][j] = 19;
                }
                if ((i == 8 ) && (j == 4)) {
                    casilleros[i][j] = 29;
                }
            }

        }
    }

    public void mostrarTablero() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(" " + casilleros[i][j]);
            }
            System.out.println(" ");

        }
    }

    public int[][] getCasilleros() {
        return casilleros;
    }

    public void setCasilleros(int[][] casilleros) {
        this.casilleros = casilleros;
    }

}
