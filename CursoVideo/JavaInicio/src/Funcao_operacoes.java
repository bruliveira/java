public class Funcao_operacoes {
    public static String contador(int i, int f){
        String s = "";
        for (int c = i; c <= f; c++){
            s += c+ " ";
        }
        return s;
    }  

    /* 
    Pode deixar assim também, mas é melhor deixar como public, tem o private e protegido
    o static está estatico, não precisa transformar em objeto para utilizar
    static String contador(int i, int f){
        String s = "";
        for (int c = i; c <= f; c++){
            s += c+ " ";
        }
        return s;
    }
    */
}
