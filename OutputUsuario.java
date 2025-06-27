public class OutputUsuario {

    /**
     * Clase que proporciona métodos para mostrar resultados al usuario.
     * Incluye mensajes de error y resultados de operaciones aritméticas.
     */
    public void mostrarResultado(String mensaje, double resultado) {
        System.out.println(mensaje + ": " + resultado);
    }

    public void mostrarError(String mensaje) {
        System.err.println("Error: " + mensaje);
    }
}