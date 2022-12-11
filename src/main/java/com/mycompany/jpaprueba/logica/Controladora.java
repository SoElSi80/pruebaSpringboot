
package com.mycompany.jpaprueba.logica;

import com.mycompany.jpaprueba.persistencia.ControladoraPersistencia;


public class Controladora {
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
  
    public void crearAlumno(Alumno alu){
        controlPersis.crearAlumno(alu);
    }
}
