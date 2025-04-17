package Practica_9;

import java.util.Scanner;

public class Ejercicio_9 {

    Dia [] dias;
    Scanner sc;

    public Ejercicio_9(){
        dias = new Dia[5];
        sc = new Scanner(System.in);
    }

    public void ejecutar(){
        for(int i=0; i<dias.length;i++){

            System.out.println("temperatura minima ["+i+"]: ");
            double minima = sc.nextDouble();

            System.out.println("temperatura maxima ["+i+"]: ");
            double maxima = sc.nextDouble();

            double media = (minima+maxima)/2.0;

            Dia dia =new Dia(minima,maxima,media);
            dias[i]= dia;


        }

        System.out.println("\n temperaturas medias: ");
        for (int i=0; i<dias.length; i++){
            System.out.println("temperatura media dias ["+i+"]: "+dias[i].getTemperaturaMedia());
        }

        for(int i=0; i<dias.length-1;i++){
            for(int j=0;j<dias.length-1;j++){
                if(dias[j].getTemperaturaMinima()> dias[j+1].getTemperaturaMinima()){
                    Dia auxiliar = dias[j];
                    dias[j]= dias[j+1];
                    dias[j+1] = auxiliar;
                }
            }
        }
        System.out.println("\n temperaturas minimas: ");
        for (int i=0; i<2; i++){
            System.out.println("temperatura minima dias ["+i+"]: "+dias[i].getTemperaturaMinima());
        }

        System.out.println("\n introduzca la temperatura: ");
        double temperatura = sc.nextDouble();

        int contador=0;

        for(int i=0;i<dias.length;i++){
            if(temperatura== dias[i].getTemperaturaMaxima()){
                System.out.println(dias[i]);
                contador++;
            }
        }

        if(contador==0){
            System.out.println("no existe ninguna temperatura maxima que coincida con la temperatura ingresada. ");
        }

    }

}
