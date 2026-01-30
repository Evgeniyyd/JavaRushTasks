package ru.javarush.java.core.level12.task18;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class Solution {
    public static void main(String[] args) throws Exception {
        // Готовим GET-запрос к API МКС
       URI uri = URI.create( "http://api.open-notify.org/iss-now.json");
        // Создаем HTTP-клиент (основной объект для отправки запросов)
    HttpClient client = HttpClient.newHttpClient();
        // Отправляем запрос и получаем ответ.
        HttpRequest request = HttpRequest.newBuilder(uri).GET().build();
        // Используем BodyHandlers.discarding(), так как нам нужен только статус, а тело можно не загружать.
        HttpResponse<Void> response =client.send(request, HttpResponse.BodyHandlers.discarding());
        System.out.println(response.statusCode());



        // Извлекаем и выводим числовой HTTP-статус (например, 200)

    }
}