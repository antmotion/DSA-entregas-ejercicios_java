package ejercicio3;

/**
 * Created by carlos on 26/09/2015.
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class leerarchivo
{
  public static void mostrarcontenido(String archivo) throws FileParsingException
  {

      try
      {
          FileReader fr = new FileReader(archivo);
          BufferedReader br = new BufferedReader(fr);
          String s;
          while ((s = br.readLine()) != null) {
              System.out.println(s);
          }
          fr.close();
      }
      catch (IOException e)
      {
      throw new FileParsingException("la cosa esta muy mal");
      }
  }



}
