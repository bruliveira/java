import java.util.Scanner;

public class CalculadoraOperadores {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numerador = teclado.nextInt();
        int denominador = teclado.nextInt();
        float div = numerador / denominador;
        float raiz = (float) Math.sqrt(numerador);
        float teste = 5.98f;
         
        int ar = (int) Math.floor(teste);
        double aleatorio = Math.random();//Gera um número aleatório
        
        System.out.printf("\nDivisão: %.2f", div);
        System.out.printf("\nRaiz: %.2f", raiz);
        System.out.println("\nApós: " + ar);
    }
}