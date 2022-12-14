/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleado;

/**
 *
 * @author PC01
 */
public class Empleado {

    String nombre;
    int  horas;
    double tarifa;  
   public Empleado (String nombre, int horas, double tarifa){
      }
   public double sueldoBruto(){
       return horas * tarifa;
       
   }
}
