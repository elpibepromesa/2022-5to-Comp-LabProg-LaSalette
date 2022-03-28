/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg10;

import java.util.Scanner;

/**
 *
 * @author PC01
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i, x;
        String nombre[] = new String[5];
        float sueldo[] = new float[5];
        int horas[] = new int[5];
        Scanner scanf = new Scanner(System.in);

        for (i = 0; i < 5; i++) {
            for (x = 0; x < 100; x++) {
                System.out.println();
            }
            System.out.println("Ingrese el Nombre del Emleado: ");
            nombre[i] = scanf.nextLine();
            System.out.println("Ingrese las horas trabajadas: ");
            horas[i] = scanf.nextInt();
            System.out.println("Ingrese el sueldo del Emleados: ");
            sueldo[i] = scanf.nextFloat();
            scanf.nextLine();

        }
        for (x = 0; x < 100; x++) {
            System.out.println();
        }

        for (i = 0; i < 5; i++) {
            float sueldoTotalSemana;
            System.out.println("Empleado: " + nombre[i]);
            if (horas[i] <= 40) {
                sueldoTotalSemana = sueldo[i] * horas[i];
            } else {
                sueldoTotalSemana = 40 * sueldo[i] + (horas[i] - 40) * (sueldo[i] + (sueldo[i] / 2));
            }
            System.out.println("Sueldo: $" + sueldoTotalSemana);
        }

    }
}
/*
        5 empleados
        --> 40 Normal
        --> Cada hora que excede --> cuota + cuota/2
        empleadoos
        horas
        sueldo bruto
 */

   

