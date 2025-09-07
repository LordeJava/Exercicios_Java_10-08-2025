package logicaExercicios;

import java.util.Scanner;

public class Exercico01{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha um numero: ");
        int numero = sc.nextInt();

        if(numero >= 0){
            System.out.println("O numero" + numero + "é positivo!");
        } else{
            System.out.println("O numero é " + numero + " negativo!");
        }
    }

}

