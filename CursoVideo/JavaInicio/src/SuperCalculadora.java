//Resto da divisão, elevado ao cubo, raiz quadrada e cubica, e valor absoluto

public class SuperCalculadora{
    public static void main(String[] args) {
        int numero = 10;

        int restoDivi = numero % 2;
        double cubo = Math.pow(numero, 3); //elevado ao cubo
        double quadrada = Math.sqrt(numero);
        double cubica = Math.cbrt(numero);
        int valorAbsoluto = Math.abs(numero);

        System.out.printf("Número digitado: %d\nResto da divisão: %d\nCubo: %f\nQuadrada: %f\nCúbica: %f\nValor absoluto: %d\n", numero, restoDivi, cubo, quadrada, cubica, valorAbsoluto);
    }
}
