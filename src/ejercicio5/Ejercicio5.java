/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;
import java.util.Scanner;
/**
 *
 * @author MORALES
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //km recorridos
        int kmR;
       
       
       Scanner entrada = new Scanner(System.in);
       
        System.out.print("ingrese los km recorridos :");
       kmR = entrada.nextInt();
       //monto a pagar por km
       double monto=kmR*30;
      //monto adicional
       double montoAdi=0;
       //si el monto es menor o igua que 300 su valor se mantiene fijo sin ningun aunmento
       if (kmR <=300 )
       {
       montoAdi =0;
       }
       //si km es mayor que 300 y menor o igual a 1000 se le aunmenta del 15% por cada km arriba de 300
       if (kmR >300 && kmR <=1000 )
       {
       montoAdi=0.15 + (kmR-300);
       }
        //si los km son mayores de 1000 se hace un aunmento del 10% por cada km que sobrepase los 1000
        if (kmR >1000 )
       {
       montoAdi=0.10 + (kmR-1000);
       }
        //monto final
       double montoF=monto + montoAdi;
       
       System.out.println("Monto a pagar: $"+montoF);
       System.out.println("Monto adicional $"+montoAdi);
    }
    
}
