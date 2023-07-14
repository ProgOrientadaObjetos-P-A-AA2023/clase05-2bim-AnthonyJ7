package paquete11;

import java.util.Random;

class APIStarPlus implements APIMovie {

    private String apiKey;

    @Override
    public void establecerApiKey() {

        Random r = new Random();
        String random = String.format("%d", r.nextInt(15121644));
        apiKey = random;
    }

    @Override
    public String obtenerApiKey() {
        return apiKey;

    }
}

