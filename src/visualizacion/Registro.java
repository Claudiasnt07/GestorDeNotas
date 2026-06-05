package visualizacion;

import modelo.Usuario;
import persistencia.GestorFicheros;
import util.HashUtil;
import javax.swing.*;
import java.util.ArrayList;

public class Registro extends JFrame {
    private JTextField txtUsuario;
    private JPasswordField txtJPassword;

    public Registro() {
        setTitle("Registro");
        setSize(300,200);
        setLocationRelativeTo(null);

        initComponents();
    }
}
