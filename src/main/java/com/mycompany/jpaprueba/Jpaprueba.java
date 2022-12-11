

package com.mycompany.jpaprueba;

import com.mycompany.jpaprueba.logica.Alumno;
import com.mycompany.jpaprueba.logica.Controladora;
import java.util.Date;


public class Jpaprueba {

    public static void main(String[] args) {
      Controladora control =new Controladora();
      
      Alumno alu =new Alumno(2,"lujan","geisler", new Date() );
    
      control.crearAlumno(alu);
    }
    
}
