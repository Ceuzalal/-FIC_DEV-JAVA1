package com.mycompany.desafiodia15;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.swing.JOptionPane;

public class WeatherApp {

    public static void main(String[] args) {
        DecimalFormat fmt = new DecimalFormat("0.00");
        try {
            // Defina a URL da API com a chave da API e o nome da cidade
            String apiKey = "3c8f867166d22a28c6e4e4708608f27c";
            String nomeCidade = JOptionPane.showInputDialog(null, "Insira o nome da cidade que deseja consultar a temperatura:");
            String apiUrl = "http://api.openweathermap.org/data/2.5/weather?q=" + nomeCidade + "&appid=" + apiKey;

            // Faz a requisição HTTP para a API
            URL url = new URL(apiUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            // Lê a resposta da API
            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();

            // Processa a resposta da API
            String weatherData = response.toString();
            // Extrai a informação de temperatura do JSON
            JsonObject jsonObject = JsonParser.parseString(weatherData).getAsJsonObject();
            JsonObject mainObject = jsonObject.getAsJsonObject("main");
            double temperatura = mainObject.get("temp").getAsDouble();
            
            // Exibe a temperatura
            System.out.println(apiUrl);
            
            JOptionPane.showMessageDialog(null, "A temperatura em " + nomeCidade + ": "
                                        + fmt.format((temperatura - 273.15)) + "°C");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


