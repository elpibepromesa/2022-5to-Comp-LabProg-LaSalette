/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej.pkg10;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author PC01
 */
public class Ej10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         ArrayList<Integer> lista = new ArrayList<>();
        
       int i,x;
        String nombre[] = new String [5];
        float sueldo[] = new float[5];
        int horas[] = new int[5];
        Scanner scanf = new Scanner (System.in);

        for(i=0;i<5;i++) {
            for(x=0;x<100;x++) System.out.println();
            System.out.println("ingrese el nombre del Emleado: ");
            nombre[i] = scanf.nextLine();
            System.out.println("ingrese las horas trabajadas: ");
            horas[i] = scanf.nextInt();
            System.out.println("ingrese el sueldo del Emleados: ");
            sueldo[i] = scanf.nextFloat();
            scanf.nextLine();

        }
        for(x=0;x<100;x++) System.out.println();

        for(i=0;i<5;i++) {
            float sueldoTotalSemana;
            System.out.println("empleado: " + nombre[i]);
            if(horas[i]<=40) sueldoTotalSemana=sueldo[i]*horas[i];
            else {
                sueldoTotalSemana=40*sueldo[i]+(horas[i]-40)*(sueldo[i]+(sueldo[i]/2));
            }
            System.out.println("sueldo: $" + sueldoTotalSemana);
        }

    }
}
    
    

