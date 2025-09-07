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
public class puntoSeis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero;
        int cantidadPos = 0;
        int cantidadNeg=0;
        int cantidad0=0;
     
        
        for (var i= 0; i <10; i++){

        System.out.print("Ingrese un número : ");
        numero = input.nextInt();
        if (numero ==0){
            cantidad0++;
        } else if (numero >0)
            cantidadPos++;
        else 
            cantidadNeg++;
        }
          
        System.out.println("la cantida de numero positivos son :"+ cantidadPos);
        System.out.println("la cantida de numero negativos son :"+ cantidadNeg);
        System.out.println("la cantida de numero 0 son :"+ cantidad0);
        }
    }
       

