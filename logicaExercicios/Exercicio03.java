package logicaExercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Cardapio do dia:");
        System.out.println("Almoço: 1");
        System.out.println("Bebidas: 2");
        System.out.println("Sobremesas: 3");
        int cardapio = sc.nextInt();

        switch (cardapio){
            case 1:
            System.out.println("Escolha seu prato:");
            System.out.println("Feijoada: 1");
            System.out.println("Macarrão: 2");
            System.out.println("Camarão grelhado: 3");
            System.out.println("Peixe e fritas: 4");
            int almoco = sc.nextInt();

            switch (almoco){
                case 1: 
                System.out.println("Voce escolheu Feijoada!");
                break;

                case 2: 
                System.out.println("Voce escolheu Macarrão!");
                break;

                case 3: 
                System.out.println("Voce escolheu Camarão Grelhado!");
                break;

                case 4: 
                System.out.println("Voce escolheu Peixe com Fritas!");
                break;
            }
            break;

             case 2:
            System.out.println("Escolha sua bebida:");
            System.out.println("Coca-cola: 1");
            System.out.println("Guarana Antartica: 2");
            System.out.println("Fanta Laranja: 3");
            System.out.println("Suco Natural: 4");
            int bebida = sc.nextInt();

            switch (bebida){
                case 1: 
                System.out.println("Voce escolheu Coca-cola!");
                break;

                case 2: 
                System.out.println("Voce escolheu Guarana Antartica!");
                break;

                case 3: 
                System.out.println("Voce escolheu Fanta Laranja!");
                break;

                case 4: 
                System.out.println("Voce escolheu Suco Natural!");
                break;
            }
            break;

             case 3:
            System.out.println("Escolha sua sobremesa:");
            System.out.println("Pudim: 1");
            System.out.println("Bolo de Chocolate: 2");
            System.out.println("Milk Shake: 3");
            System.out.println("Sorvete: 4");
            int sobremesa = sc.nextInt();

            switch (sobremesa){
                case 1: 
                System.out.println("Voce escolheu Pudim!");
                break;

                case 2: 
                System.out.println("Voce escolheu Bolo de Chocolate!");
                break;

                case 3: 
                System.out.println("Voce escolheu Mil Shake!");
                break;

                case 4: 
                System.out.println("Voce escolheu Sorvete!");
                break;
            }
            break;
            default:
            System.out.println("Opção invalida!3");
            break;
        }


    }
    
}
