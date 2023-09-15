import java.util.Scanner;
public class VerificacionDeNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingresa Un numero:");
        int number = scanner.nextInt();
      
        if (number > 0) {
            System.out.println("El numero es positivo.");
        } else if (number < 0) {
            System.out.println("El numero es negativo");
        } else {
            System.out.println("el numero es cero");
        }
        scanner.close();
    
    }

}