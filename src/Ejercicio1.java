import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la contraseña");
        String contraseña = scanner.nextLine();

        if (contraseña.length() >= 8 &&
            contraseña.matches(".*[A-Z].*") &&
            contraseña.matches(".*[a-z].*") &&
            contraseña.matches(".*[0-9].*") &&
            contraseña.matches(".*[!@#$%^&*].*")) {
            System.out.println("La contraseña es válida");
        } else {
            System.out.println("La contraseña debe tener al menos 8 caracteres, incluir una letra mayúscula, una minúscula, un número y un carácter especial (@, #, $, %, &, ).");
        }

        scanner.close();
    }
}

