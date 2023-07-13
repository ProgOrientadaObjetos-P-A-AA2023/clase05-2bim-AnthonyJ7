/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete11;

import java.util.Random;

/**
 *
 * @author ASUS
 */
public class APIDisney implements APIMovie{
    
    private String apiKey;
    
    @Override
    public void establecerApiKey(String ak) {
        
        Random r = new Random();
        int random = r.nextInt(15121644);
        apiKey = ak + "DISNEY" + random;
    }
    
    @Override
    public String obtenerApiKey() {
        return apiKey;
    }
    
}
