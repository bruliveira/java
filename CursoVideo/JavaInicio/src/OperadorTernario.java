import java.sql.Date;
import java.util.Calendar;

public class OperadorTernario {
    public static void main(String[] args) {
        int n1, n2, r, rr;
        n1 = 4;
        n2 = 8;
        r = (n1 > n2) ? 0:1; 
        rr = (n1 > n2) ?n1:n2; //Aqui elee vai mostrar o maior, se o n1 for maior, mostra n1, senão ele vai mostrar n2
        
        System.out.println("R: " + r);

        //Verifica a idade para voto
        Calendar calendario = Calendar.getInstance();
        int anoNascimento = 2002;
        int anoAtual =  calendario.get(Calendar.YEAR);
        int idade = anoAtual - anoNascimento;
        String situa = ((idade >= 16 && idade < 18) || (idade > 70)) ? "É Opcional" : "Não é opcional";

        System.out.println("Situação de voto: " + situa);
    }
}
    