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
public class puntoDos {
    public static void main(String[] args) {
         Scanner input = new Scanner (System.in);
         double numero1 = 0;
         double numero2 = 0;
         double numero3= 0;
         System.out.print("Ingrese primer numero: ");
        numero1= input.nextInt();
        System.out.print("Ingrese segundo  numero: ");
        numero2= input.nextInt();
        System.out.print("Ingrese tercer numero: ");
        numero3= input.nextInt();
           
        if (numero1 > numero2 && numero1 > numero3){
           System.out.println(" El mayor es: "+ numero1);
        }else if (numero2 > numero1 && numero2 > numero3){
                System.out.println(" El mayor es: "+numero2);
    }else{
                System.out.println(" El mayor es: "+numero3);
            }
    }
}
    
                        
        
                              
        
            
           
                
    
    
    

