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

    private void initComponents() {
         JPanel panel = new JPanel();

        txtUsuario = new JTextField(15);
        txtPassword = new JPasswordField(15);

        JButton btnRegistrar =
                new JButton("Registrar");

        panel.add(new JLabel("Usuario"));
        panel.add(txtUsuario);

        panel.add(new JLabel("Contraseña"));
        panel.add(txtPassword);

        panel.add(btnRegistrar);

        add(panel);

        btnRegistrar.addActionListener(
                e -> registrar()
        );
    }
    

}
