import java.util.Calendar;
import java.util.Scanner;

public class Voto_Condicional {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Calendar calendario = Calendar.getInstance();

        System.out.print("Por favor, digite a data de seu nascimento: ");
        int anoNascimento = teclado.nextInt();
        int anoAtual = calendario.get(Calendar.YEAR);
        int idade = anoAtual - anoNascimento;

        if(idade < 16){
            System.out.printf("\nIdade: %d ->Ops, Voto não permitido para idade", idade);
        }else if(idade >= 16 && idade <18 || idade > 70){
            System.out.printf("\nIdade: %d ->Legal, Voto Opcional", idade);
        } else{
            System.out.printf("\nIdade: %d ->Vixi, Voto OBRIGATÓRIO", idade);
        }
        
        /* Pode usar a estrutura acima ou esta.
        if(idade < 16){
            System.out.printf("\nIdade: %d ->Ops, Voto não permitido para idade", idade);
        }else{
            if(idade >= 16 && idade <18 || idade > 70){
                System.out.printf("\nIdade: %d ->Legal, Voto Opcional", idade);
            } else{
                System.out.printf("\nIdade: %d ->Vixi, Voto OBRIGATÓRIO", idade);
            }
        }
         */
    }
}