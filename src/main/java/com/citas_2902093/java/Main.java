package com.citas_2902093.java;

import com.citas_2902093.java.enttites.Medico;
import com.citas_2902093.java.enums.Especialidad;
import com.citas_2902093.java.enums.TipoIdentificacion;

public class Main {
    public static void main(String[] args) {
        
        //Crear o instanciar un medico
        Medico m = new Medico(1, "Laura", "Albarracin", TipoIdentificacion.CC, 1234567L, 12317232L, Especialidad.PEDIATRIA);
    }
}