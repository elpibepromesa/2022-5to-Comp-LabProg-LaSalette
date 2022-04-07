/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author PC-10
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Empleado e1 = new Empleado("Gervacio", "Plumón", 12000.00);
        Empleado e2 = new Empleado("Agapito", "Cleto", 13000.00);

        System.out.println(e1.getNombre() + " " + e1.getApellido() + " Salario: " + e1.getSalario() + " Anual: " + e1.getSalario() * 12);
        System.out.println(e2.getNombre() + " " + e2.getApellido() + " Salario: " + e2.getSalario() + " Anual: " + e2.getSalario() * 12);

    }

}
