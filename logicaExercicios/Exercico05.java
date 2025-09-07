package logicaExercicios;

public class Exercico05 {
    public static void main(String[] args){
        int tabuada = 1;

        while (tabuada <= 10){
            int j = 1;
            System.out.println("Tabuada do: " + tabuada);
            
            while (j <= 10){
                System.out.println(tabuada + " x " + j + " = " + (tabuada * j));
                j += 1;
            }

            System.out.println();
            tabuada += 1;
        }
    }
}

