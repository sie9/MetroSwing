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
public class BonoEstudiante extends Bono{
    public int precio;
    public int viajes;
    public String id;

    public BonoEstudiante() {
        this.precio = 5;
        this.viajes = (0 + (int)(Math.random() * ((10 - 0) + 1)));
        this.id = "" +(0 + (int)(Math.random() * ((1000 - 0) + 1)));
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getViajes() {
        return viajes;
    }

    public void setViajes(int viajes) {
        this.viajes = viajes;
    }

    public String getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public String getFechaCaduca() {
        return fechaCaduca;
    }

    public void setFechaCaduca(String fechaCaduca) {
        this.fechaCaduca = fechaCaduca;
    }
    
    
    
    
}
