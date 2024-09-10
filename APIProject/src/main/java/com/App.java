package com;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class App 
{
    public static void main( String[] args ) throws IOException, InterruptedException
    {
    	HttpRequest request = HttpRequest.newBuilder()
    			.uri(URI.create("https://google-translate1.p.rapidapi.com/language/translate/v2/detect"))
    			.header("content-type", "application/x-www-form-urlencoded")
    			.header("Accept-Encoding", "application/gzip")
    			.header("X-RapidAPI-Key", "d45d87fee3msh0cedb4bd1f58f79p164017jsn3fe949d5d5a4")
    			.header("X-RapidAPI-Host", "google-translate1.p.rapidapi.com")
    			.method("POST", HttpRequest.BodyPublishers.ofString("q=English%20is%20hard%2C%20but%20detectably%20so"))
    			.build();
    	HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
    	System.out.println(response.body());
    }
}
