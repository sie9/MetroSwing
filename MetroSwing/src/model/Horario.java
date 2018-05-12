/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author Cris
 */
public class Horario {
    
    public String horario;

    public Horario(String hora) {
        this.horario = hora;
    }

    public String getHora() {
        return horario;
    }

    public void setHora(String hora) {
        this.horario = hora;
    }
    
    
}
