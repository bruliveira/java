public class Pernas_Condicional {
    public static void main(String[] args) {
        int pernas = 2;
        String tipo;
        
        switch(pernas){
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bípede";
                break;
            case 3:
                tipo = "Tripé";
                break;
            case 4:
                tipo = "Quadrúpede";
                break;
            case 6:
                tipo = "Aranha";
                break;
            default:
            tipo = "ET";
            break; //Não é obrigado ter este break
        }
        System.out.println(tipo);
    }
}