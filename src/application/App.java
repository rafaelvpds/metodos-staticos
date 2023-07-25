package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class App {

    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // como os membros da minha classe nao sao staticos, e nescessario instanciar a
        // minha classe

        Calculator calc = new Calculator();

        System.out.println("Enter radius ");
        double radius = sc.nextDouble();
        double c = calc.circuference(radius);
        double v = calc.volume(radius);

        System.out.println("Circuference: " + String.format("%.2f%n", c));
        System.out.println("Volume: " + String.format("%.2f%n", v));
        System.out.println("PI value: " + String.format("%.2f%n", calc.PI));
        sc.close();
    }

    // O metodo main, é um metodo statico: Voce nao pode chamar um metodo que nao
    // static outros metodos que nao sejam statico
    /*
     * public static double circuference(double radius) {
     * return 2.0 * PI * radius;
     * }
     *
     * public static double volume(double radius) {
     * return 4.0 * PI * Math.pow(radius, 3) / 3;
     * }
     */
}
