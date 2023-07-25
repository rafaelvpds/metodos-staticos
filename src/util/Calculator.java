package util;

// Os metodos staticos não precisam de objetos para serem chamados.
public class Calculator {
    // A palavra final e para falar que o valor e constante e não pode ser alterado.
    // Ela vai ser um valor constante, independente do objeto do tipo calculator
    public static final double PI = 3.14159;

    // pq pode ser calculada independente de objeto
    public static double circuference(double radius) {
        return 2.0 * PI * radius;
    }

    public static double volume(double radius) {
        return 4.0 * PI * Math.pow(radius, 3) / 3;
    }
}
