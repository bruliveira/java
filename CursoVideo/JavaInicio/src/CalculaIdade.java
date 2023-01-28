import java.util.Calendar;
import java.util.Scanner;

public class CalculaIdade {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Calendar calendario = Calendar.getInstance();

        int anoAtual =  calendario.get(Calendar.YEAR);

        System.out.println("Digite o ano de seu nascimento:");
        int anoNascimento = teclado.nextInt();  

        int idade = anoAtual - anoNascimento;

        System.out.printf("\nAno atualmente: %d\nAno de nascimento: %d\nIdade: %d Anos", anoAtual, anoNascimento, idade);
    }
}
