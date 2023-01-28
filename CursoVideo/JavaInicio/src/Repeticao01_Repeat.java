public class Repeticao01_Repeat {
    public static void main(String[] args) {
        System.out.println("\n--> Ainda sobre cambalhotas");
        int cc = 1;
        do{
            System.out.println("Cambalhota " +cc);
            cc++;
        }while (cc <= 4);

        //Utilizando o FOR
        System.out.println("\n\nTESTANDO O FOR\n");
        for (int c = 1; c <= 15; c+=2){
            System.out.println("Resultado: " + c);
        }
        for (int a = 30; a >= 15; a-=2){
            System.out.println("Resultado inverso:  " + a);
        }
    }
}