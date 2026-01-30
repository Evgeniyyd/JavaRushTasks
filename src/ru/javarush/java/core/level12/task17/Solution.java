package ru.javarush.java.core.level12.task17;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Solution {
    public static void main(String[] args) throws Exception {
        // Создаем HTTP-клиент (современный API из java.net.http)
 URI uri = URI.create("https://api.open-meteo.com/v1/forecast?latitude=50.45&longitude=30.52&current_weather=true");
     HttpClient client = HttpClient.newHttpClient();
        // Формируем GET-запрос к заданному адресу
        HttpRequest request = HttpRequest.newBuilder(uri).GET().build();
        // Отправляем запрос и получаем ответ как строку (полный JSON)
        HttpResponse<String> response = client.send(request,HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());



        // Выводим полный JSON-ответ на экран

    }
}