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
public class JugadorFutbol {
    private EquipoFutbol equipo;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("JugadorFutbol{equipo=").append(equipo);
        sb.append('}');
        return sb.toString();
    }

    public JugadorFutbol(EquipoFutbol equipo) {
        this.equipo = equipo;
    }

    public EquipoFutbol getEquipo() {
        return equipo;
    }

    public void setEquipo(EquipoFutbol equipo) {
        this.equipo = equipo;
    }
    
}
