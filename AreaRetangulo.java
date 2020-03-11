import javax.swing.*;
public class AreaRetangulo
{
    public static void main(String... args)
    {
        double base,altura,area;
        base = Double.parseDouble(JOptionPane.showInputDialog("Digite base do Retangulo"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite altura do Retangulo"));
        area = base*altura;
        JOptionPane.showMessageDialog(null,"A area do Retangulo é: " + area);
    }
}