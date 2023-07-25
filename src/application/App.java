package application;

import java.util.Locale;
import java.util.Scanner;

public class App {

    // A palavra final e para falar que o valor e constante e não pode ser alterado.
    public static final double PI = 3.14159;

    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius ");
        double radius = sc.nextDouble();
        double c = circuference(radius);
        double v = volume(radius);

        System.out.println("Circuference: " + String.format("%.2f%n", c));
        System.out.println("Volume: " + String.format("%.2f%n", v));
        System.out.println("PI value: " + String.format("%.2f%n", PI));
        sc.close();
    }

    // O metodo main, é um metodo statico: Voce nao pode chamar um metodo que nao
    // static outros metodos que nao sejam statico
    public static double circuference(double radius) {
        return 2.0 * PI * radius;
    }

    public static double volume(double radius) {
        return 4.0 * PI * Math.pow(radius, 3) / 3;
    }

}
