public class Contador01_Repeti {
    public static void main(String[] args) {
        System.out.println("-----> Contagem de Cambalhotas");
        int cc = 0;
        while (cc < 10){
            cc++;
            if (cc == 5 || cc == 7){
                continue; //ele continua sem mostrar esses cc
            }
            if (cc == 8){
                break; //ele para aqui, mesmo sem ter terminado o laço
            }
            System.out.println("Cambalhota: " + (cc));
        }
        //Uma outra maneira seria:
        int c = 0;
        String contagem = "";
        while (c < 5 ){
            contagem += c + " ";
            c++;
        }
        System.out.println("Contagem: " + contagem);

        //Um outro
        System.out.println("\nUtilizando o for");
        for ( int i = 1; i <= 10; i+= 2){
            System.out.println("Contador: " + i);
        }
    }
}
