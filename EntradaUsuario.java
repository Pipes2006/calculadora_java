
import java.util.Scanner;

public class EntradaUsuario {
    private Scanner scanner= new Scanner(System.in);


    public double leerNumero (String mensaje){
       System.out.print(mensaje);
        return scanner.nextDouble();
    }
}
