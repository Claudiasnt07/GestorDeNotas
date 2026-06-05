package persistencia;

import java.io.*;
import java.util.ArrayList;
import modelo.Usuario;

public class GestorFicheros {

    private static final String ARCHIVO_USUARIOS = "usuarios.txt";

    public static void guardarUsuarios(
            ArrayList<Usuario> usuarios) {
        try (ObjectOutputStream oos =
                    new ObjectOutputStream(
                            new FileOutputStream(
                                    ARCHIVO_USUARIOS))) {
            oos.writeObject(usuarios);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
