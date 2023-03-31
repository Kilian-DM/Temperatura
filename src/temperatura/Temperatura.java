package temperatura;

 //@author Kilian Diaz
import javax.swing.JOptionPane;

public class Temperatura {

    public static void main(String[] args) {
        double numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el Numero"));

        Temperatura centigrados = new Temperatura(numero);
        centigrados.calcularcentigrados();

        Temperatura rankine = new Temperatura(numero);
        rankine.calcularrankine();

        double cadkelvin;
        Temperatura kelvin = new Temperatura(numero);
        cadkelvin = kelvin.calcularkelvin();
        JOptionPane.showMessageDialog(null, "Conversion de Fahrenheit a Kelvin es de: " + cadkelvin);

        double cadreaumur;
        Temperatura reaumur = new Temperatura(numero);
        cadreaumur = reaumur.calcularreaumur();
        JOptionPane.showMessageDialog(null, "Conversion de Fahrenheit a Reaumur es de: " + cadreaumur);

    }
    private final double numero;

    public Temperatura(double numero) {
        this.numero = numero;
    }

    public void calcularcentigrados() {
        double numero1;
        numero1 = (numero - 32) * 5 / 9;
        JOptionPane.showMessageDialog(null, "Conversion de Fahrenheit a Centígrados es de: " + numero1);

    }

    public void calcularrankine() {
        double numero1;
        numero1 = numero + 459.67;
        JOptionPane.showMessageDialog(null, "Conversion de Fahrenheit a Rankine es de: " + numero1);

    }

    public double calcularkelvin() {
        double numero1;
        numero1 = (numero - 32) * 5 / 9 + 273.15;
        return numero1;

    }

    public double calcularreaumur() {
        double numero1;
        numero1 = (numero - 32) * 4 / 9;
        return numero1;

    }

}
