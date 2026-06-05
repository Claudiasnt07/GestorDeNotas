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

    public static ArrayList<Usuario> cargarUsuarios() {
        File archivo = new File(ARCHIVO_USUARIOS);

        if (!archivo.exists()) {
            return new ArrayList<>();
        }

        try (ObjectInputStream ois =
                    new ObjectInputStream(
                            new FileInputStream(
                                    ARCHIVO_USUARIOS))) {
            return (ArrayList<Usuario>) ois.readObject();
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }
}
