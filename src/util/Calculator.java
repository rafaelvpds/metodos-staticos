package util;

public class Calculator {
    // A palavra final e para falar que o valor e constante e não pode ser alterado.
    public final double PI = 3.14159;

    public double circuference(double radius) {
        return 2.0 * PI * radius;
    }

    public double volume(double radius) {
        return 4.0 * PI * Math.pow(radius, 3) / 3;
    }
}
