/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import static java.lang.Math.random;
import java.util.ArrayList;

/**
 *
 * @author Cris
 */
public class Linea {
    
    public String nombreLinea;
    public String precioLinea;
    public ArrayList<Incidencia> incidenciasLinea = new ArrayList<Incidencia>();
    public Trayecto idaLinea = new Trayecto();
    public Trayecto vueltaLinea = new Trayecto();

    public Linea(String nombreLinea) {
        this.nombreLinea = nombreLinea;
        this.precioLinea = ""+    ((Math.random() * 10) + 1);
        
        for (int inci = (int) ((Math.random() * 3) + 1); inci<=3 ; inci++){
            Incidencia incidencia = new Incidencia(inci);
            incidenciasLinea.add(incidencia);
        }
    }
    
    

    public String getNombreLinea() {
        return nombreLinea;
    }

    public void setNombreLinea(String nombreLinea) {
        this.nombreLinea = nombreLinea;
    }

    public String getPrecioLinea() {
        return precioLinea;
    }

    public void setPrecioLinea(String precioLinea) {
        this.precioLinea = precioLinea;
    }

    public ArrayList<Incidencia> getIncidenciasLinea() {
        return incidenciasLinea;
    }

    public void setIncidenciasLinea(ArrayList<Incidencia> incidenciasLinea) {
        this.incidenciasLinea = incidenciasLinea;
    }

    public Trayecto getIdaLinea() {
        return idaLinea;
    }

    public void setIdaLinea(Trayecto idaLinea) {
        this.idaLinea = idaLinea;
    }

    public Trayecto getVueltaLinea() {
        return vueltaLinea;
    }

    public void setVueltaLinea(Trayecto vueltaLinea) {
        this.vueltaLinea = vueltaLinea;
    }
    
    
    
    
}
