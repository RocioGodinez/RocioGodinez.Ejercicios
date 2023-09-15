import java.util.Scanner;
public class AñoBisiesto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un año:");
        int año = scanner.nextInt();
        if (año % 4 == 0) {
            if (año % 100 == 0) {
                if (año % 400 == 0) {
                    System.out.println("El año " + año + " es bisiesto.");
                } else {
                    System.out.println("El año " + año + " no es bisiesto.");
                }
            } else {
                System.out.println("El año " + año + " es bisiesto.");
            }
        } else {
            System.out.println("El año " + año + " no es bisiesto.");
        }
        scanner.close();
    }
}