/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Cris
 */
public class Usuario {
    
    public String nombre;
    public String dni;
    public String usuario;
    public String clave;
    public ArrayList<BonoEstudiante> bonosestudiante = new ArrayList<BonoEstudiante>();
    public ArrayList<BonoNormal> bonosnormales = new ArrayList<BonoNormal>();

    public Usuario(int i) {
        this.nombre = "Nombre " + i;
        this.dni = "Dni "+i;
        this.usuario = "usuario"+i;
        this.clave = "clave"+i;
        for (int j=0; j<i; j++){
            BonoEstudiante bonoestu = new BonoEstudiante();
            BonoNormal bononormal = new BonoNormal();
            
            
            this.bonosestudiante.add(bonoestu);
            this.bonosnormales.add(bononormal);
        }
        
    }

    public ArrayList<BonoEstudiante> getBonosestudiante() {
        return bonosestudiante;
    }

    public void setBonosestudiante(ArrayList<BonoEstudiante> bonosestudiante) {
        this.bonosestudiante = bonosestudiante;
    }

    public ArrayList<BonoNormal> getBonosnormales() {
        return bonosnormales;
    }

    public void setBonosnormales(ArrayList<BonoNormal> bonosnormales) {
        this.bonosnormales = bonosnormales;
    }
    

    

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
    
    
}
