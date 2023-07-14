/*
 * 
 * D - Dependency inversion principle (Principio de inversión de dependencias)
 */
package paquete11;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        String nombreArchivo = "Usuarios.txt";
        LecturaArchivo lectura = new LecturaArchivo(nombreArchivo);
        lectura.establecerLista();
        ArrayList<GeneradorPelicula> lista = new ArrayList<>();

        // Recorrido
        for (int i = 0; i < lectura.obtenerLista().size(); i++) {

            GeneradorPelicula p = new GeneradorPelicula();

            if (lectura.obtenerLista().get(i).obtenerTipo().equals("Netflix")) {

                APINetflix api = new APINetflix();

                api.establecerApiKey();

                p.establecerLlave(api);

                p.establecerTipo(lectura.obtenerLista().get(i).obtenerTipo());
                p.establecerUser(lectura.obtenerLista().get(i).obtenerUser());
                p.establecerUrl();

                lista.add(p);

            }

            if (lectura.obtenerLista().get(i).obtenerTipo().equals("Disney")) {

                APINetflix api = new APINetflix();

                api.establecerApiKey();

                p.establecerLlave(api);

                p.establecerTipo(lectura.obtenerLista().get(i).obtenerTipo());
                p.establecerUser(lectura.obtenerLista().get(i).obtenerUser());
                p.establecerUrl();

                lista.add(p);

            }

            if (lectura.obtenerLista().get(i).obtenerTipo().equals("Amazon")) {

                APINetflix api = new APINetflix();

                api.establecerApiKey();

                p.establecerLlave(api);

                p.establecerTipo(lectura.obtenerLista().get(i).obtenerTipo());
                p.establecerUser(lectura.obtenerLista().get(i).obtenerUser());
                p.establecerUrl();

                lista.add(p);

            }

            if (lectura.obtenerLista().get(i).obtenerTipo().equals("Startplus")) {

                APINetflix api = new APINetflix();

                api.establecerApiKey();

                p.establecerLlave(api);

                p.establecerTipo(lectura.obtenerLista().get(i).obtenerTipo());
                p.establecerUser(lectura.obtenerLista().get(i).obtenerUser());
                p.establecerUrl();

                lista.add(p);

            }

        }

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
        /*
        Usar el txt llamado usuarios.txt; por cada línea del archivo
        crer un API en función de su servicio; además el API ahora genera
        información estática (no cambia el API), se debe buscar la forma que el 
        API sea dinámico totalmente (usar alguna librería propia de JAVA, tipo 
        Random); la url final debe contener el tipo de servicio y el user
        Por cada objeto de tipo GeneradoPelicula presentar la información 
        a través de un toString
         */

    }
}
