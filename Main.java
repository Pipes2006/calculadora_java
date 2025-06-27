public class Main {

    // Este es el punto de entrada de la aplicación.          
    public static void main(String[] args) {
     System.out.println("Calculadora Andres Merchan");
     EntradaUsuario entrada = new EntradaUsuario();
     OperacionesAritmeticas operaciones = new OperacionesAritmeticas();
     OutputUsuario salida = new OutputUsuario();

     //le pedimos al usuario que ingrese dos números
     double numero1= entrada.leerNumero("Ingrese el primer número: ");
     double numero2= entrada.leerNumero("Ingrese el segundo número: ");

     //le pedimos que ingrese el tipo de operacion que desea realizar 
     System.out.println("Seleccione la operación a realizar:\n 1. Suma\n 2. Resta\n 3. Multiplicación\n 4. División\n 5. Módulo");
     double operacionArealizar = entrada.leerNumero("Ingrese el número de la operación: ");
     // Aquí se manejan las diferentes operaciones aritméticas
     switch ((int)operacionArealizar) {
         case 1: 
             double resultadoSuma = operaciones.calcularSuma(numero1, numero2);
             salida.mostrarResultado("Resultado de la suma", resultadoSuma);
             break;
            
            case 2:
             double resultadoResta = operaciones.calcularResta(numero1, numero2);
             salida.mostrarResultado("Resultado de la resta", resultadoResta);
             break;
            case 3:
             double resultadoMultiplicacion = operaciones.calcularMultiplicacion(numero1, numero2);
             salida.mostrarResultado("Resultado de la multiplicación", resultadoMultiplicacion);
             break;
            case 4:
                double resultadoDivision = operaciones.calcularDivision(numero1, numero2);
                salida.mostrarResultado("Resultado de la división", resultadoDivision);
                break;
            case 5:
                double resultadoModulo = operaciones.calcularModulo(numero1, numero2);
                salida.mostrarResultado("Resultado del módulo", resultadoModulo);
                break;
            default:
                salida.mostrarError("Operación no válida. Por favor, seleccione una opción entre 1 y 5.");
                break;
     }
    


    

    }
}
