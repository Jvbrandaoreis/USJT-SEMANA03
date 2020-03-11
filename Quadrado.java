import javax.swing.JOptionPane;

public class Quadrado
{
    public static void main(String... args)
    {
        int num; 
        double quadrado;
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero para ser elevado")); 
        quadrado = Math.pow(num, 2);
        JOptionPane.showMessageDialog(null, num + " Elevado ao quadrado é: " + quadrado);        
    }
}