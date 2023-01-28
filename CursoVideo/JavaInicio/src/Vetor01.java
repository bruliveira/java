import java.lang.reflect.Array;
import java.util.Arrays;

public class Vetor01 {
    public static void main(String[] args) {
        int n[] = {1, 3, 4, 5, 2, 5}; //N é objeto
        System.out.println("Total de casas do vetor: " + n.length);

        for (int c = 0; c <= n.length-1; c++){
            System.out.printf("\nNúmero: %d, está na posição: %d", n[c], c);
        }
        System.out.println("\n\n");
        //Preenchendo o vetor automaticamente
        int v[] = new int[20];
        Arrays.fill(v, 0);//Preenche com zero
        for ( int valor: v){
            System.out.print(valor + " ");
        }

        /*
        for (int c = 0; c <= 5; c++){
            System.out.printf("\nNúmero: %d, está na posição: %d", n[c], c);
        }
         */
    }
}
