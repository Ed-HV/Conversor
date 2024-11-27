package services;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ExchangeRateService {
    private final String apiKey = "TU-API-KEY"; // Cambia esto por tu clave de API válida.

    public String Conversion(String monedaBase, String monedaObjetivo, double cantidad) {
        try {
            String url = "https://v6.exchangerate-api.com/v6/" + apiKey + "/pair/" + monedaBase + "/" + monedaObjetivo;
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            JsonObject jsonObject = JsonParser.parseString(response.body()).getAsJsonObject();
            if (!jsonObject.get("result").getAsString().equals("success")) {
                throw new RuntimeException("Error en la consulta a la API.");
            }

            double conversionRate = jsonObject.get("conversion_rate").getAsDouble();
            return String.format("%.2f", conversionRate * cantidad);
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Error en la conexión con la API: " + e.getMessage());
        }
    }
}


