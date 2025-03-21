public class Ejercicio1 {
int[]vector_numeros = new int[10];

    public Ejercicio1(){
    }
    public void ejecutar(){
    for(int i=0 ; i < vector_numeros.length; i++){
    int aleatorio=(int)(Math.random()*10+1);

    vector_numeros[i]=aleatorio;
    }
        for (int i = 0; i < vector_numeros.length; i++) {
            int numero = vector_numeros[i];
            int cuadrado=(int)Math.pow(numero, 2);
            int cubo= (int)Math.pow(numero, 3);
            System.out.println("vector_numeros["+ i +"]:" +vector_numeros[i]);

        }
    }

}
