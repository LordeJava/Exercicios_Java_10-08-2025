package logicaExercicios;

public class Exercicio09 {
    public static void main(String[] args) {
        int[] numeros = {1, 3, 5, 7, 9, 11};

        for (int numero : numeros) {
            if (numero == 7) {
                System.out.println("Número 7 encontrado. Encerrando o laço.");
                break;
            }
            System.out.println("Número: " + numero);
        }
    }
}

