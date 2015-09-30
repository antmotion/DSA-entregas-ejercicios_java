package ejercicio5;

/**
 * Created by carlos on 27/09/2015.
 */
public class DemoThreads {
    public static void main(String[] args) throws InterruptedException {
        Concurrencia1 clasethread = new Concurrencia1("Clase thread ");
        Concurrencia2 claseRunnable = new Concurrencia2("Clase Runnable");


        clasethread.start();
        Thread t = new Thread(claseRunnable ,"fadf");
        t.start();

        clasethread.join();


        System.out.println("Se acabó.");
    }
}
