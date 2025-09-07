/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.unidad.pkg2;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class puntoCinco {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero;
        int suma = 0;

        System.out.print("Ingrese un número (0 para terminar): ");
        numero = input.nextInt();

        while (numero != 0) {
            if (numero % 2 == 0) { // sumamos solo si es par
                suma += numero;
            }

            // Pedimos un nuevo número **en cada iteración**
            System.out.print("Ingrese un número (0 para terminar): ");
            numero = input.nextInt();
        }

        // Mostramos la suma **solo al final**
        System.out.println("La suma de los números pares ingresados es: " + suma);

        input.close();
    }
}
        
    
    
