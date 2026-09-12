import java.io.File;
import java.io.IOException;

public class Ficheros {
    public static String eDirectorio(String directorio) {
        File ruta = new File(directorio);
        if (ruta.isDirectory()) {
            return "é directorio";
        }
        else {
            return "non é directorio";
        }
    }

    public static String eFicheiro(String dir) {
       File ruta2 = new File(dir);
       if (ruta2.isFile()) {
           return "É ficheiro";
       }
       else {
           return "Non é ficheiro";
       }
    }

    public static String creaDirectorio(String crear) {
        File ruta3 = new File(crear);
        if (ruta3.exists()) {
            return "O directorio xa existe";
        }
        if (ruta3.mkdir()) {
            return "Creado correctamente";
        } else {
            return "Non se puido crear";
        }
    }

    public static String creaFicheiro(String dirName, String fileName) throws IOException {
        File fichero = new File (dirName, fileName);
        File rAbsoluta = new File (dirName);
        if (rAbsoluta.exists()) {
            if (fichero.exists()) {
                return "Ya existe el fichero";
            }
            if (fichero.createNewFile()) {
                return "Creado con exito";
            }

        } else {
            return "La ruta no existe";
        }
        return "";
    }
}
