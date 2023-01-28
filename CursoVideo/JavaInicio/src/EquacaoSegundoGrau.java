import java.util.Scanner;

public class EquacaoSegundoGrau {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("---> Calculando valor de Delta");
        
        System.out.print("Digite o valor de A: ");
        int a = teclado.nextInt();
        System.out.print("Digite o valor de B: ");
        int b = teclado.nextInt();
        System.out.print("Digite o valor de C: ");
        int c = teclado.nextInt();

        //Poderia usar qualquer uma das opções abaixos
        int deltai = (int) (Math.pow(b, 2)) - 4 * (a*c);
        double delta = (Math.pow(b, 2)) - 4 * (a*c);

        System.out.println("\n------- RESULTADO -------");
        System.out.printf("Valores digitados:\nA: %d\nB: %d\nC: %d\n\nDelta: %.2f\n", a, b, c, delta);

        if(delta < 0){
            System.out.println("->Não existe raízes reais");
        }else{
            System.out.println("->Existem raízes reais");
        }
    }
}