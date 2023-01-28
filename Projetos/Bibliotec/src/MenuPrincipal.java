import java.util.Scanner;

public class MenuPrincipal {
    static void menu(){
        System.out.println("----------> BIBLIOTECA <----------");
        System.out.println("1 -> ITEM");
        System.out.println("2 -> EMPRESTIMO");
        System.out.println("3 -> USUÁRIO");
        System.out.println("4 -> RESERVA");
        System.out.println("5 -> OUTRAS OPÇÕES");
        System.out.println("0 -> SAIR");
        System.out.print("Digite a opção desejada, por favor: ");
    }

    static void itens(){
        System.out.println("Função dos itens");
    }

    static void escolhemenuprincipal(int x){
        switch (x) {
            case 1:
                System.out.println("Antes dos itens");
                itens();
                System.out.println("Depois da função");
                break;
            case 2:
                System.out.println("Menu dos emprestimos");
                break;
            case 3:
                System.out.println("Menu dos usuarios");
                break;
            case 4:
                System.out.println("Menu das reservas2");
                break;
            case 5:
                System.out.println("Menu de outras opções");
                break;   
            case 0:
                System.out.println("Até a próxima");
                break;     
            default:
                System.out.println("Opção inválida");
                break;
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("-----> É um prazer ter você em nossa biblioteca <-----");
        menu();
        int opcao = teclado.nextInt();
        escolhemenuprincipal(opcao);


    }
}