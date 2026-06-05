package visualizacion;

import modelo.Nota;
import modelo.Usuario;
import javax.swing.*;
import java.util.ArrayList;

public class GestorNotas {
    private JTextField txtTitulo;
    private JTextArea txtContenido;

    private JList<Nota> listaNotas;
    private DefaultListModel<Nota> modelo;

    private ArrayList<Nota> notas;
}
