import javax.swing.*;

public class Comprimento
{
    public static void main(String... args)
    {   
        String primeira, segunda, terceira;
        int soma;
        primeira = JOptionPane.showInputDialog("Digite primeira palavra");
        segunda = JOptionPane.showInputDialog("Digite segunda palavra");
        terceira = JOptionPane.showInputDialog("Digite terceira palavra");
        soma = primeira.length() + segunda.length() + terceira.length();
        JOptionPane.showMessageDialog(null, "A soma de letras das palavras é " + soma);
    }

}