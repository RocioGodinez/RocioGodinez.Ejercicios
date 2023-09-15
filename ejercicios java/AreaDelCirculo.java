import java.util.Scanner;
public class AreaDelCirculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // obtener el area del circulo con el radio que ingrese el usuario.
        System.out.println("ingresa el radio del circulo:");
        double radius = scanner.nextDouble();
        // Calcular el area del circulo.
        double area = Math.PI * radius * radius;
        // imprimir.
        System.out.println("el area del circulo es: " + area);
        scanner.close();
    }
}