public class OperacionesAritmeticas {
    /**
     * Clase que proporciona métodos para realizar operaciones aritméticas básicas.
     * Incluye suma, resta, multiplicación, división y módulo.
     */
    public double calcularSuma(double a, double b) {
        return a + b;
    }

    public double calcularResta(double a, double b) {
        return a - b;
    }

    public double calcularMultiplicacion(double a, double b) {
        return a * b;
    }

    public double calcularDivision(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("La división por cero no está permitida.");
        }
        return a / b;
    }

    public double calcularModulo(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("La división por cero no está permitida.");
        }
        return a % b;
    }
}