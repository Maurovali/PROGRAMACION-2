/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp.unidad.pkg2;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class puntoNueve {
  

    // a. Calcula el costo de envío según el peso y la zona
    public static double calcularCostoEnvio(double peso, String zona) {
        double costoPorKg;
        if (zona.equalsIgnoreCase("Nacional")) {
            costoPorKg = 5.0;
        } else if (zona.equalsIgnoreCase("Internacional")) {
            costoPorKg = 10.0;
        } else {
            System.out.println("Zona inválida. Se tomará Nacional por defecto.");
            costoPorKg = 5.0;
        }
        return peso * costoPorKg;
    }

    // b. Calcula el total de la compra usando calcularCostoEnvio
    public static double calcularTotalCompra(double precioProducto, double peso, String zona) {
        double costoEnvio = calcularCostoEnvio(peso, zona); // composición de funciones
        System.out.println("El costo de envío es: " + costoEnvio);
        return precioProducto + costoEnvio;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar datos al usuario
        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = scanner.nextDouble();

        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = scanner.nextDouble();

        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
        String zona = scanner.next();

        // Calcular total usando composición de funciones
        double total = calcularTotalCompra(precioProducto, peso, zona);

        // Mostrar resultado
        System.out.println("El total a pagar es: " + total);

        scanner.close();
    }
}