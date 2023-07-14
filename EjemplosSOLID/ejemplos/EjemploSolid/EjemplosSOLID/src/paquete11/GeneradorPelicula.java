/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete11;

public class GeneradorPelicula {

    private APIMovie llave;
    private String url;
    private String user;
    private String tipo;
    // agregar un user (tipo String)

    public void establecerLlave(APIMovie l) { // APINetflix, APIAmazon
        llave = l;
    }

    public void establecerUrl() {
        url = String.format("http://api.movie?api= %s%s%s", obtenerLlave().obtenerApiKey(), user, tipo);
    }

    public void establecerUser(String user) {
        this.user = user;
    }

    public void establecerTipo(String tipo) {
        this.tipo = tipo;
    }

    public String obtenerTipo() {
        return tipo;
    }

    public String obtenerUser() {
        return user;
    }

    public APIMovie obtenerLlave() {
        return llave;
    }

    public String obtenerUrl() {
        return url;
    }

    @Override
    public String toString() {
      //  String cadena = "Lista Urls\n";

        
        
        String cadena = String.format("%s\n",
                obtenerUrl());

        return cadena;
    }
}