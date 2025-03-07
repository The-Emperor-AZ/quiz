
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner("System.in");
        System.out.println("Ingrese la contraseña");
        short contraseña = scanner.nextShort();

        if (contraseña == '@' || contraseña == '#' || contraseña == '$' || contraseña == '%' || contraseña == '&' || contraseña == '*')
        System.out.println("la contraseña es valida"); {
        
            
        }

         scanner.close();   
        }
    }
    

