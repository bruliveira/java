public class Teste_funcao {
    //Static, usado só aqui mesmo, não em outras classes
    static void soma(int a, int b){
        int soma = a + b;
        System.out.println("A soma é: " + soma);
    }
    static int s(int a, int b){
        int s = a + b;
        return s;
    }
    public static void main(String[] args) {
        System.out.println("<--- Resultados ---->");
        soma(5, 8);
        int somaa = s(5, 10);
        System.out.println("Soma de interiros: " + s(5, 10));
        System.out.println("Soma de interiros: " + somaa);    
    }
}