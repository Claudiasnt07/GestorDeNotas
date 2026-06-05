package visualizacion;

import modelo.Usuario;
import persistencia.GestorFicheros;
import util.HashUtil;
import javax.swing.*;
import java.util.ArrayList;

public class Login {
    
    private JTextField txtUsuario;
    private JPasswordField txtPassword;

    public Login() {
        setTitle("Login");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        initComponents();
    }

}
