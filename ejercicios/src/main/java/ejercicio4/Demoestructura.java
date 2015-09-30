package ejercicio4;

import java.io.IOException;

/**
 * Created by carlos on 27/09/2015.
 */
public class Demoestructura {
    public static void main (String arg[])throws IOException {
        estructura escribirobjeto = new estructura(3,5.6,'q');
        escribirobjeto.escribirarcvhivo("C:\\Users\\carlos\\IdeaProjects\\ejercicios\\src\\main\\java\\ejercicio4\\texto.txt");

        estructura leerobjeto = estructura.leerarchivo("C:\\Users\\carlos\\IdeaProjects\\ejercicios\\src\\main\\java\\ejercicio4\\texto.txt");
        System.out.println("entero = " + escribirobjeto.getEntero());
        System.out.println("decimal = " + escribirobjeto.getDecimal());
        System.out.println("char = " + escribirobjeto.getCaracter());

    }
}
