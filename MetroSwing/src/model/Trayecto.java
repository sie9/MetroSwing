/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Cris
 */
public class Trayecto {
    
    public String idTrayecto;
    public HashMap<Parada, ArrayList<Horario>> horarioParada = new HashMap<Parada, ArrayList<Horario>>();

    public Trayecto() {
        for (int i = 10; i < 20; i++){
            Parada paraditas = new Parada();
            paraditas.setNombreParada("Parada " + i);
            paraditas.setDireccionParada("DireccionParada " + i);
            paraditas.setIdParada("idParada " + ((Math.random() * 10) + 1));
            
            ArrayList<Horario> horas = new ArrayList<Horario>();
            String horita ="";
                    
            for (int j = 0 ; j <6 ; j++){
                int hora = (0 + (int)(Math.random() * ((24 - 0) + 1)));
                if ( hora < 10 ){
                    horita = "0"+hora;
                }else{
                    horita = ""+hora;
                }
                Horario horarioito = new Horario(horita+":00");
                horas.add(horarioito);
            }
            horarioParada.put(paraditas, horas);
        }
        
    }    

    public String getIdTrayecto() {
        return idTrayecto;
    }

    public void setIdTrayecto(String idTrayecto) {
        this.idTrayecto = idTrayecto;
    }

    public HashMap<Parada, ArrayList<Horario>> getHorarioParada() {
        return horarioParada;
    }

    public void setHorarioParada(HashMap<Parada, ArrayList<Horario>> horarioParada) {
        this.horarioParada = horarioParada;
    }

    
    
    
}
