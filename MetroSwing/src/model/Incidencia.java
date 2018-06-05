/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Cris
 */
class Incidencia {
    public String descripcionIncidencia;
    public String codigoIncidencia;

    
    
    

    public String getDescripcion() {
        return descripcionIncidencia;
    }

    public void setDescripcion(String descripcion) {
        this.descripcionIncidencia = descripcion;
    }

    public String getCodigo() {
        return codigoIncidencia;
    }

    public void setCodigo(String codigo) {
        this.codigoIncidencia = codigo;
    }
    
    public Incidencia(int i) {
        this.descripcionIncidencia = "Descripcion " + i;
        this.codigoIncidencia = "Codigo "+i;
    }
    
    
}
