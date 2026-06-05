package modelo;

import java.io.Serializable;
import java.util.ArrayList;

public class Usuario implements Serializable {
    
    private String nombre;
    private String passwordHash;
    private ArrayList<Nota> notas;
}
