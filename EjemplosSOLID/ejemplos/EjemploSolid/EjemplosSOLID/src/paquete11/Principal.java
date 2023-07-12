/*
 * 
 * D - Dependency inversion principle (Principio de inversión de dependencias)
 */
package paquete11;

import java.io.BufferedReader;
import java.io.FileReader;

public class Principal {

    public static void main(String[] args) {
/*
        try {
            BufferedReader reader = new BufferedReader(new FileReader("usuarios.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] userData = line.split(";");
                String serviceType = userData[0];
                String username = userData[1];

                // Crear objeto GeneradoPelicula con la información obtenida
                GeneradorPelicula pelicula = new GeneradorPelicula(serviceType, username);

                // Mostrar información utilizando el método toString
                System.out.println(pelicula.toString());

                // Llamar al método del API correspondiente al tipo de servicio
                if (serviceType.equals("servicio1")) {
                    String apiUrl = generateService1API(username);
                    System.out.println("API URL: " + apiUrl);
                } else if (serviceType.equals("servicio2")) {
                    String apiUrl = generateService2API(username);
                    System.out.println("API URL: " + apiUrl);
                }
                // Agregar más condiciones para otros tipos de servicios...

                System.out.println();
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
*/
}
}
