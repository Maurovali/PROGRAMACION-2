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
public class TpUnidad2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner (System.in);
         int numero = 0;
         System.out.print("Ingrese año: ");
        numero= input.nextInt();
        if (numero % 4 != 0){
           System.out.println( numero+ " NO es un año bisiesto");
        }else{
            if (numero % 100 !=0){
                System.out.println( numero + " es un año bisiesto ");
            }else{ 
                if  (numero % 400 ==0 )
                    System.out.println(numero + " es una año bisiesto");
        
                 else {
                         System.out.println( numero+ " NO es un año bisiesto");       
                  }
                     
        
            }
        }    
                
    }
}    
    
    

