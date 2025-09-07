package logicaExercicios;

public class Exercicio07 {
    public static void main(String[] args) {
        System.out.println("Matriz 5x5 - Soma dos índices [i][j]:\n");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("[" + i + "+" + j + "=" + (i + j) + "]\t");
            }
            System.out.println();
        }
    }
}

