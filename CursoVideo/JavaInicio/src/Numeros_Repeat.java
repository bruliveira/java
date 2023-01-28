import java.util.Scanner;

public class Numeros_Repeat {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("");
        int n, s = 0;
        String res;

        do{
            System.out.print("Digite um número: ");
            n = teclado.nextInt();
            s += n;
            System.out.print("Deseja continuar? [S/N]: ");
            res = teclado.next();
        }while (res.equals("S"));
        System.out.println("\nA soma de todos os valores é: " + s);
    }
}
