/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.dia15dois;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.swing.JOptionPane;
public class APIWeb {

    public static void main(String[] args) {
        try {
            for (int i = 1; i < 2; i++) {

                URL url = new URL("https://v2.jokeapi.dev/joke/Any");
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("GET");
                BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                String linha;
                StringBuilder resposta = new StringBuilder();
                while ((linha = reader.readLine()) != null) {
                    resposta.append(linha);
                }
                reader.close();
                
                JOptionPane.showMessageDialog(null, resposta.toString());
               // System.out.println(resposta.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
