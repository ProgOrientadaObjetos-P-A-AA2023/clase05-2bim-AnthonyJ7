/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class LecturaArchivo {

    private Scanner entrada;
    private String nombreArchivo;
    private String rutaArchivo;
    private ArrayList<GeneradorPelicula> lista;

    public LecturaArchivo(String n) {
        nombreArchivo = n;
        rutaArchivo = String.format("datos/%s", nombreArchivo);
        File f = new File(rutaArchivo);
        if (f.exists()) {
            try {
                entrada = new Scanner(new File(rutaArchivo));
            } catch (FileNotFoundException e) {
                System.err.println("Error al leer del archivo: " + e);

            }
        }
    }

    public void establecerNombreArchivo(String n) {
        nombreArchivo = n;
    }

    public void establecerRutaArchivo() {
        rutaArchivo = String.format("datos/%s.txt",
                obtenerNombreArchivo());
    }

    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }

    public String obtenerRutaArchivo() {
        return rutaArchivo;
    }

    public void establecerLista() {
        lista = new ArrayList<>();
        File f = new File(rutaArchivo);

        if (f.exists()) {

            while (entrada.hasNext()) {
                String linea = entrada.nextLine();

                ArrayList<String> linea_partes = new ArrayList<>(
                        Arrays.asList(linea.split(";")));

                GeneradorPelicula p = new GeneradorPelicula();

                if (linea_partes.get(2).equals("Netflix")) {
                    APINetflix api = new APINetflix();
                    String apiKey = String.format("%s",
                            linea_partes.get(2));

                    api.establecerApiKey(apiKey);

                    p.establecerLlave(api);
                    String urlFinal = String.format("http://api.movie?api="
                            + "%s/", linea_partes.get(1));

                    p.establecerUrl(urlFinal);
                    lista.add(p);
                }

                if (linea_partes.get(2).equals("Disney")) {
                    APIDisney api = new APIDisney();
                    String apiKey = String.format("%s",
                            linea_partes.get(2));
                    api.establecerApiKey(apiKey);

                    p.establecerLlave(api);
                    String urlFinal = String.format("http://api.movie?api="
                            + "%s/", linea_partes.get(1));
                    p.establecerUrl(urlFinal);
                    lista.add(p);
                }

                if (linea_partes.get(2).equals("Amazon")) {
                    APIAmazonMovie api = new APIAmazonMovie();
                    String apiKey = String.format("%s",
                            linea_partes.get(2));
                    api.establecerApiKey(apiKey);

                    p.establecerLlave(api);
                    String urlFinal = String.format("http://api.movie?api="
                            + "%s/", linea_partes.get(1));
                    p.establecerUrl(urlFinal);
                    lista.add(p);
                }

                if (linea_partes.get(2).equals("Startplus")) {
                    APIStarPlus api = new APIStarPlus();
                    String apiKey = String.format("%s",
                            linea_partes.get(2));
                    api.establecerApiKey(apiKey);

                    p.establecerLlave(api);
                    String urlFinal = String.format("http://api.movie?api="
                            + "%s/", linea_partes.get(1));
                    p.establecerUrl(urlFinal);
                    lista.add(p);
                }

            }
        }
    }

    public ArrayList<GeneradorPelicula> obtenerLista() {

        return lista;
    }

    public void cerrarArchivo() {
        if (entrada != null) {
            entrada.close();
        }

    }

    @Override
    public String toString() {
        String cadena = "Lista de URL:\n";

        for (int i = 0; i < obtenerLista().size(); i++) {
            GeneradorPelicula p = obtenerLista().get(i);

            cadena = String.format("%s(%d) %s\n", cadena,
                    i + 1,
                    p.obtenerUrl());
        }
        return cadena;
    }

}
