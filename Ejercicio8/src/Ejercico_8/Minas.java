package Ejercico_8;

import java.util.Scanner;

public class Minas {

    int v[][];                    // Matriz que representa el tablero con las minas
    String vPresentacion[][];     // Matriz visible para el jugador
    Scanner sc;

    public Minas() {
        v = new int[8][8];
        sc = new Scanner(System.in);
        vPresentacion = new String[8][8];
    }

    public boolean ejecutar() {
        int contadorTotal = 0;    // Cantidad de casillas sin minas
        int totalMinas = 0;       // Cantidad total de minas

        // Inicialización del tablero
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v[i].length; j++) {
                int aleatorio = (int) (Math.random() * 8 + 1); // 1 a 8
                v[i][j] = aleatorio;

                if (v[i][j] == 8) totalMinas++;
                else contadorTotal++;

                vPresentacion[i][j] = "*";
            }
        }

        int contadorJugador = 0;
        int explosionMinas = 0;

        while (explosionMinas == 0 && contadorJugador <= contadorTotal) {

            System.out.println("INGRESE UN NÚMERO PARA LA FILA: ");
            int fila = sc.nextInt();

            System.out.println("INGRESE UN NÚMERO PARA LA COLUMNA: ");
            int columna = sc.nextInt();

            int posiblesMinas = 0;

            if (v[fila][columna] == 8) {
                explosionMinas++;
            } else {
                int[][] direcciones = {
                        {-1, -1}, {-1, 0}, {-1, 1},
                        { 0, -1},          { 0, 1},
                        { 1, -1}, { 1, 0}, { 1, 1}
                };

                for (int[] dir : direcciones) {
                    int nuevaFila = fila + dir[0];
                    int nuevaCol = columna + dir[1];

                    if (nuevaFila >= 0 && nuevaFila < 8 && nuevaCol >= 0 && nuevaCol < 8) {
                        if (v[nuevaFila][nuevaCol] == 8) {
                            posiblesMinas++;
                        }
                    }
                }

                vPresentacion[fila][columna] = (posiblesMinas != 0) ? posiblesMinas + "" : "null";
            }

            // Mostrar tablero
            System.out.println("\n-----------------------------------");
            for (int i = 0; i < vPresentacion.length; i++) {
                for (int j = 0; j < vPresentacion[i].length; j++) {
                    System.out.print(vPresentacion[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("-----------------------------------");

            contadorJugador++;
        }

        return explosionMinas == 0; // true si gana, false si pierde
    }
}
