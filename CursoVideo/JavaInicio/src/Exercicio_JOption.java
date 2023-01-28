import javax.swing.JOptionPane;

public class Exercicio_JOption {
    public static void main(String[] args) {
        
        //Tem como utilizar outros - WARNING_MESSAGE, ERROR_MESSAGE, entre outros
        JOptionPane.showMessageDialog(null, "Olá Mundo!", "Boas vindas", JOptionPane.WARNING_MESSAGE);
        //JOptionPane.showMessageDialog(null, "Olá Mundo!", "Boas vindas", JOptionPane.ERROR_MESSAGE);

        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número "));
        JOptionPane.showMessageDialog(null, "Você digitou: " + n);

        int numero, s = 0;
        do{
            numero = Integer.parseInt(JOptionPane.showInputDialog(null, 
                "<html>Informe um número: <br><em>(Valor 0 interrompe)</em></html>"));
            s += numero;
        }while (numero != 0);
        JOptionPane.showMessageDialog(null, "<html>Resultado final <br>----------" +
            "<br>Somatório vale " + s);
    }
}