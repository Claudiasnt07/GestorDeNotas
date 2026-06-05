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

    public GestorNotas(Usuario usuario) {
        notas = usuario.getNotas();

        setTitle("Gestor de Notas");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        initComponents();

        setVisible(true);
    }
}
