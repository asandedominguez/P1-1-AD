import org.w3c.dom.ls.LSOutput;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Arrays;

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

    public static String modoAcceso(String dirName, String fileName) {
        File fichero2 = new File(dirName, fileName);
        if (fichero2.canWrite()) {
            System.out.println("Escritura si");
        }
        if (!fichero2.canWrite()) {
            System.out.println("Escritura no");
        }
        if (fichero2.canRead()) {
            System.out.println("Lectura si");
        }
        if (!fichero2.canRead()) {
            System.out.println("Lectura no");
        }
        return "";
    }

    public static String calcularLonxitude(String dirName, String fileName) {
        File fichero3 = new File (dirName, fileName);
        System.out.println(fichero3.length()); ;
        return "";
    }

    public static String mLectura(String dirName, String fileName) {
        File fichero3 = new File (dirName, fileName);
        if (fichero3.exists()) {
            if (fichero3.setReadOnly()) {
                return "Creado con exito";
            }
        }
        return "No existe";
    }

    public static String mEscritura(String dirName, String fileName) {
        File fichero4 = new File (dirName, fileName);
        if (fichero4.exists()) {
            if (fichero4.setWritable(true)) {
                return "Se escribe correctamente";
            }
            return "No se puede escribir";
        }
        return "No existe";
    }

    public static String borrarFichero(String dirName, String fileName) {
        File fichero5 = new File (dirName, fileName);
        if (fichero5.exists()) {
            fichero5.delete();
            return "Borrado correctamente";
        }
        return "No existe";
    }

    public static String borraDirectorio(String dirName) {
        File fichero6 = new File (dirName);
        if (fichero6.exists()) {
            fichero6.delete();
            return "Borrado con exito";
        }
        return "Ruta inexistente o con descendencia";
    }

    public static String mContido(String dirName) {
        File fichero7 = new File (dirName);
        System.out.println(Arrays.toString(fichero7.list()));
        return "";
    }

    public static void main (String [] args) throws IOException{
        String arquivosdir = creaDirectorio("arquivosdir");
        String comprobar = eDirectorio("arquivosdir");

        String Products1 = creaFicheiro("arquivosdir", "productsº1");

        String subdir = creaDirectorio("/home/dam26/IdeaProjects/Practica 1 AD/arquivosdir/subdir");
        String Products2 = creaFicheiro("/home/dam26/IdeaProjects/Practica 1 AD/arquivosdir/subdir", "Products2");

        String amosar = mContido("/home/dam26/IdeaProjects/Practica 1 AD/arquivosdir");

        String permisos = modoAcceso("arquivosdir", "productsº1");
        String longitud = calcularLonxitude("C:\\Users\\Carlos SG\\IdeaProjects\\P1-1-AD 2\\arquivosdir", "productsº1");

        String pLectura = mLectura("C:\\Users\\Carlos SG\\IdeaProjects\\P1-1-AD 2\\arquivosdir", "productsº1");

        String pEscritura = mEscritura("C:\\Users\\Carlos SG\\IdeaProjects\\P1-1-AD 2\\arquivosdir", "productsº1");

        String borrar = borrarFichero("C:\\Users\\Carlos SG\\IdeaProjects\\P1-1-AD 2\\arquivosdir","productsº1");
        System.out.println(borrar);

        String Dborrar = borraDirectorio("C:\\Users\\Carlos SG\\IdeaProjects\\P1-1-AD 2\\arquivosdir");
        System.out.println(Dborrar);
    }
}
