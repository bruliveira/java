public class ComparaString {
    public static void main(String[] args) {
        String nome1 = "Maria";
        String nome2 = "Maria";
        String nome3 = new String("Maria");
        String res;
        int x = 4, y = 7, z = 12;
        boolean r;

        res = (nome1 == nome2) ? "igual" : "Diferente";
        r = (x < y && y < z) ? true : false;

        System.out.println("Nomes: " + res);
        System.out.println("Valores: " + r);

    }
}
