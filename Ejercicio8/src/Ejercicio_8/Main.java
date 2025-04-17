package Ejercicio_8;

import Ejercico_8.Minas;

public class Main {
    public static void main(String[] args) {
        System.out.println("====================================");
        System.out.println("        BUSCAMINAS EN JAVA          ");
        System.out.println("====================================");
        System.out.println("Selecciona casillas evitando minas!");
        System.out.println(" ");

        Minas obj1 = new Minas();
        boolean resultado = obj1.ejecutar();

        if (resultado) {
            System.out.println("\n¡Felicidades, ganaste! 🎉");
        } else {
            System.out.println("\n¡Oh no! Perdiste. ☠️");
        }
    }
}

