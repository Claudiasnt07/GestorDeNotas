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

    private void initComponents() {
        JPanel panel = new JPanel();

        panel.add(new JLabel("Título:"));

        txtTitulo = new JTextField(20);
        panel.add(txtTitulo);

        panel.add(new JLabel("Contenido:"));

        txtContenido = new JTextArea(5, 20);
        panel.add(new JScrollPane(txtContenido));

        modeloLista = new DefaultListModel<>();
        listaNotas = new JList<>(modeloLista);

        for (Nota nota : notas) {
            modeloLista.addElement(nota);
        }

        panel.add(new JScrollPane(listaNotas));

        JButton btnCrear = new JButton("Crear");
        JButton btnEditar = new JButton("Editar");
        JButton btnEliminar = new JButton("Eliminar");
        JButton btnLimpiar = new JButton("Limpiar");
        JButton btnBorrarTodo = new JButton("Borrar Todo");

        panel.add(btnCrear);
        panel.add(btnEditar);
        panel.add(btnEliminar);
        panel.add(btnLimpiar);
        panel.add(btnBorrarTodo);

        add(panel);

        btnCrear.addActionListener(e -> crearNota());

        btnEditar.addActionListener(e -> editarNota());

        btnEliminar.addActionListener(e -> eliminarNota());

        btnLimpiar.addActionListener(e -> limpiarCampos());

        btnBorrarTodo.addActionListener(e -> borrarTodas());

        listaNotas.addListSelectionListener(e -> mostrarNota());
    }
}
