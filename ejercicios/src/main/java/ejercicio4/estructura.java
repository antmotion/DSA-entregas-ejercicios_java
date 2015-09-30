package ejercicio4;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.*;

/**
 * Created by carlos on 26/09/2015.
 */
public class estructura {
    private int entero;
    private double decimal;
    private char caracter;

    public estructura(int entero, double decimal, char caracter) {
        this.entero = entero;
        this.decimal = decimal;
        this.caracter = caracter;
    }

    public int getEntero() {
        return entero;
    }

    public double getDecimal() {
        return decimal;
    }

    public char getCaracter() {
        return caracter;
    }

    public void setEntero(int entero) {
        this.entero = entero;
    }

    public void setDecimal(double decimal) {
        this.decimal = decimal;
    }

    public void setCaracter(char caracter) {
        this.caracter = caracter;
    }

    public void escribirarcvhivo(String ruta) throws IOException {

        DataOutputStream flujo = new DataOutputStream(new FileOutputStream(ruta));
        flujo.writeInt(entero);
        flujo.writeDouble(decimal);
        flujo.writeChar(caracter);
        flujo.close();
    }
    public final static estructura leerarchivo(String ruta) throws  IOException {
        DataInputStream flujo = new DataInputStream(new FileInputStream(ruta));
        int entero = flujo.readInt();
        double decimal = flujo.readDouble();
        char caracter = flujo.readChar();
        return new estructura(entero,decimal,caracter);

    }
}



