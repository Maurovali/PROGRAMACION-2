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
public class puntoTres {
    public static void main(String[] args) {
         Scanner input = new Scanner (System.in);
         int edad= 0;
       
        System.out.print("Ingrese su edad: ");
        edad= input.nextInt();
        if (edad<12){
            System.out.println(" Eres menor de edad");
        } else if (edad > 12 && edad <18){
            System.out.println(" Eres adolescente");
        } else if (edad > 18 && edad <59){
            System.out.println("Eres adulto");
                    }else {
            System.out.println("Eres adulto mayor");
            
        }
    }
}

