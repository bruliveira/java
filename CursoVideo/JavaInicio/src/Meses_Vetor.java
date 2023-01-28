public class Meses_Vetor {
    public static void main(String[] args) {
        String mes[] = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        int dias[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for(int c = 0; c < mes.length; c++){
            System.out.println("O mês de " + mes[c] + " tem " + dias[c] + " ao todo");
        }
    }
}