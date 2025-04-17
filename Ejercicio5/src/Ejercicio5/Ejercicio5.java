package Ejercicio5;

public class Ejercicio5 {

    public Object ejecutar;
    int[] vector;

    public Ejercicio5() {
        vector = new int[10];
    }

    public void ejecutar() {

        for (int i = 0; i < vector.length; i++) {

            int random = (int) (Math.random() * 100 + 1);
            vector[i] = random;

        }
        System.out.println("Vector antes de ordenar: ");
        for (int i = 0; i < vector.length; i++) {
            System.out.println("vector[" + i +"]: " + vector[i]);
        }
        
        for (int i = 0; i < vector.length - 1; i++) {
            for (int j = 0; j < vector.length - 1 - i; j++) {
                if (vector[j] > vector[j + 1]) {
                    int aux = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = aux;
                }
            }
        }
        
        System.out.println("Vector despues de ordenar");
        for (int i = 0; i < vector.length; i++) {
            System.out.println("vector[" + i + "]: " + vector[i]);
        }
    }

}