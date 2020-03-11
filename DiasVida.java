import javax.swing.*;
public class DiasVida
{
    public static void main(String... args)
    {
        int idade,dias;
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
        dias =  idade * 360;
        JOptionPane.showMessageDialog(null,"Voce viveu aproximadamente " + dias + " dias");
    }

}