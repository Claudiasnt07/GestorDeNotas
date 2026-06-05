package visualizacion;

import modelo.Usuario;
import persistencia.GestorFicheros;
import util.HashUtil;

import javax.swing.*;
import java.util.ArrayList;

public class Login extends JFrame {

    private JTextField txtUsuario;
    private JPasswordField txtPassword;

    public Login() {
        setTitle("Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        initComponents();

        pack();
    }

    private void initComponents() {

        JPanel panel = new JPanel();

        JLabel lblUsuario = new JLabel("Usuario:");
        txtUsuario = new JTextField(15);

        JLabel lblPassword = new JLabel("Contraseña:");
        txtPassword = new JPasswordField(15);

        JButton btnLogin = new JButton("Iniciar Sesión");
        JButton btnRegistro = new JButton("Registrarse");

        panel.add(lblUsuario);
        panel.add(txtUsuario);

        panel.add(lblPassword);
        panel.add(txtPassword);

        panel.add(btnLogin);
        panel.add(btnRegistro);

        add(panel);

        btnRegistro.addActionListener(e -> {
            RegistroFrame registro = new RegistroFrame();
            registro.setVisible(true);
        });

        btnLogin.addActionListener(e -> login());
    }

    private void login() {
        String usuario = txtUsuario.getText();

        String password = new String(txtPassword.getPassword());

        String hash = HashUtil.hash(password);

        ArrayList<Usuario> usuarios = GestorFicheros.cargarUsuarios();

        for (Usuario u : usuarios) {
            if (u.getNombre().equals(usuario)
                    && u.getPasswordHash().equals(hash)) {

                new GestorNotas(u).setVisible(true);
                dispose();
                return;
            }
        }

        JOptionPane.showMessageDialog(
                this,
                "Usuario o contraseña incorrectos",
                "Error",
                JOptionPane.ERROR_MESSAGE
        );
    }
}