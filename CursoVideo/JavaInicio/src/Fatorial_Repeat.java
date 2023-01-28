public class Fatorial_Repeat {
    public static void main(String[] args) {
        int n = 6;
        int f = 1;
        int c = n;

        while (c >= 1){
            System.out.printf("\nFatorial --> %d", f);
            f *= c;
            c--;
        }
        System.out.printf("\n\nFatorial de %d é: %d", n, f);
    }   
}