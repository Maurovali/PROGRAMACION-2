
import java.util.Scanner;



public class puntoOcho {
    

    // Método para calcular el precio final
    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        double impuestoDecimal = impuesto / 100.0;
        double descuentoDecimal = descuento / 100.0;
        return precioBase + (precioBase * impuestoDecimal) - (precioBase * descuentoDecimal);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario los valores
        System.out.print("Ingrese el precio base del producto: ");
        double precioBase = scanner.nextDouble();

        System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        double impuesto = scanner.nextDouble();

        System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
        double descuento = scanner.nextDouble();

        // Llamar al método para calcular el precio final
        double precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);

        // Mostrar el resultado
        System.out.println("El precio final del producto es: " + precioFinal);

        scanner.close();
    }
}
