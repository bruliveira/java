import javax.swing.DefaultListModel;

public class Vetor {
    public static void main(String[] args) {
        int vetor[] = new int[5];
        DefaultListModel lista = new DefaultListModel();
        int selecionado = 0;

        for(int c = 0; c < vetor.length; c++){
            lista.addElement(vetor[c]);
            System.out.println("Lista: " + lista + "vetor: " + vetor[c]);
        }
    }
}
