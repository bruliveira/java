import java.util.Calendar;
import java.util.Scanner;

public class EstruturaCondicional {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        float n1 = teclado.nextFloat();
        System.out.print("Digite a segunda nota: ");
        float n2 = teclado.nextFloat();
        float media = (n1 + n2) / 2;
        System.out.println("Sua média foi: "+ media);

        if(media > 9){
            System.out.println("Parabéns, você foi ótimo");
        }

        //Idade
        Calendar data = Calendar.getInstance();
        int anoAtual = data.get(Calendar.YEAR);
        System.out.print("Digite o ano de seu nascimento: ");
        int anoNasciemnto = teclado.nextInt();
        int idade = anoAtual - anoNasciemnto;
        
        if(idade >= 18){
            System.out.println("Maior de idade");
        }else{
            System.out.println("Menor de idade");
        }

        //Verifica se o número é par
        int n = 8;

        if(n%2==0){
            System.out.println("Número  é par");
        }else{
            System.out.println("Número ímpar");
        }
    }
}
