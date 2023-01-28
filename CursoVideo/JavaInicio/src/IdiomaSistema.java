import java.util.Locale;

public class IdiomaSistema {
    public static void main(String[] args) {
    System.out.println("\n---> Programa para exibir o idioma do sistema");
    Locale loc = Locale.getDefault();
    System.out.println("O idioma do sitema é: " + loc.getDisplayLanguage() + "-" + loc.getLanguage());
    }
}