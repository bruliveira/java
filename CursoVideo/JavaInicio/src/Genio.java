//Acertar o número
public class Genio {
    public static void main(String[] args) {
        int range = (10 - 1) + 1; // Max - Min
        int rand = (int) (Math.random() * range) + 1; // Pode fazer assim
        double randd = 1 + Math.random() * (10 - 1); // Ou pode fazer assim
        int valor = (int) randd;

        int num = 5; // Valor para possível acerto

        System.out.println("Descubra o número");
        String res = (valor == num) ? "Acertou!" : "Errou";
        
        System.out.println("Número pensado: " + valor + "\n" + res);
    }
}
