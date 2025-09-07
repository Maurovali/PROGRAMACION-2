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
public class puntoCuatro {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
      
         int precio= 0;
         char categoria;  
       
        System.out.print("Ingrese precio del producto: ");
        precio = input.nextInt();
        System.out.print("Ingrese categoria del producto(A,B o C): ");
        categoria= input.next().charAt(0);
        switch (categoria){
              case 'A': 
              System.out.println("el precio final del producto es :" + (precio - ((precio*10)/100)));
              break;
              case 'B':
              System.out.println(" el precio final del producto es :" + (precio - ((precio*15)/100)));
              break;
              case 'C':
              System.out.println("el precio final del producto es :"+ (precio - (precio*20)/100));
              break;
        }
    }
}