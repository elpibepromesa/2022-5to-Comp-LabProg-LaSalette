/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

/**
 *
 * @author PC01
 */
public class Aficionado {
    private EquipoFutbol efav;
    private JugadorFutbol jfav;

    @Override
    public String toString() {
        return "Aficionado{" + "efav=" + efav + ", jfav=" + jfav + '}';
    }

    public Aficionado(EquipoFutbol efav, JugadorFutbol jfav) {
        this.efav = efav;
        this.jfav = jfav;
    }

    public EquipoFutbol getEfav() {
        return efav;
    }

    public void setEfav(EquipoFutbol efav) {
        this.efav = efav;
    }

    public JugadorFutbol getJfav() {
        return jfav;
    }

    public void setJfav(JugadorFutbol jfav) {
        this.jfav = jfav;
    }
    
     
}
