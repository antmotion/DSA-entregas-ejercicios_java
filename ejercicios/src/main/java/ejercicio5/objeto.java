package ejercicio5;

/**
 * Created by carlos on 27/09/2015.
 */
public class objeto {
    private String nombre;
    private long tiempo;
    private int totalescrituras;

    public objeto(int totalescrituras, long tiempo, String nombre) {
        this.totalescrituras = totalescrituras;
        this.tiempo = tiempo;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getTiempo() {
        return tiempo;
    }

    public void setTiempo(long tiempo) {
        this.tiempo = tiempo;
    }

    public int getTotalescrituras() {
        return totalescrituras;
    }

    public void setTotalescrituras(int totalescrituras) {
        this.totalescrituras = totalescrituras;
    }
}
