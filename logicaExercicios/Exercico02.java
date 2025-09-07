package logicaExercicios;

import java.util.Scanner;


public class Exercico02{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual sua nota (0 a 10)?");
        int nota = sc.nextInt();

        System.out.println("Qual sua frequencia (0% a 100%)?");
        int frequencia = sc.nextInt();

        if(nota >= 7) {
            if (frequencia > 75) {
                System.out.println("Sua nota e frequencia são satisfatorias!");
            }else{
                System.out.println("Sua frequencia é insatisfatoria!");
            }
            System.out.println("Sua nota é satisfatória!");
        }else{
            if(frequencia < 75){
                System.out.println("Sua frequencia é insatisfatoria!");
            }
            System.out.println("Sua nota é insatisfatoria!");
        }
    }

}
