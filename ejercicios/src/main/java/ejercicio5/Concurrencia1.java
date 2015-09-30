package ejercicio5;

/**
 * Created by carlos on 27/09/2015.
 */
public class Concurrencia1 extends Thread{
    long ultimaejecucion=0;
    int totalescrituras=0;
    String nombre;
   public Concurrencia1(String nombre){
       this.nombre=nombre;    }

    @Override
    public void run(){
        objeto objetos = new objeto(totalescrituras,ultimaejecucion,nombre);
        for (int i = 0; i < 10; i++) {
            long ejecucionactual = System.currentTimeMillis();
            objetos.setTiempo((ultimaejecucion == 0) ? 0 : ejecucionactual - ultimaejecucion);
            ultimaejecucion = ejecucionactual;
            objetos.setTotalescrituras(totalescrituras++);
            System.out.println("Esto es una "+objetos.getNombre() + ", el tiempo trancurrido desde  la ultima ejecución es = " + objetos.getTiempo()+" ms, y el numero de escrituras es "+ objetos.getTotalescrituras() );
            long sleep = (long) (Math.random() * 2000);
            try {
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        }


}
