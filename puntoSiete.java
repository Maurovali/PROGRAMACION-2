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
public class puntoSiete {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nota;

        do {
            System.out.print("Ingrese una nota (0 a 10): ");
            nota = input.nextInt(); // <- Leemos un nuevo número en cada vuelta

            if (nota < 0 || nota > 10) {
                System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10.");
            }

        } while (nota < 0 || nota > 10); // <- condición correcta

        System.out.println("Nota guardada correctamente: " );

        input.close();
    }
}
    
    
