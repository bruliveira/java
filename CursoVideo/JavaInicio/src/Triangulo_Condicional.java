public class Triangulo_Condicional {
    public static void main(String[] args) {
        int a = 2;
        int b = 2;
        int c = 2;

        if( a < b + c && b < a + c && c < a + b){
            System.out.println("Formam um triângulo");
            if( a == b && b == c){
                System.out.println("Equilátero");
            }else if( a != b && b != c && a != c){
                System.out.println("Escaleno");
            }else{
                System.out.println("Isósceles");
            }
        }else{
            System.out.println("Não formam um triângulo");
        }
    }
}
