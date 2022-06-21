package com.example.demo1.service;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

@org.springframework.stereotype.Service
public class Service {

    WebClient webClient;

    public Service(WebClient.Builder builder) {
        webClient = builder
                .baseUrl("http://localhost:8082")
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .build();
    }

    public String callDemo2(){
        return webClient
                .get()
                .uri(p -> p
                        .path("demo2")
                        .build())
                .retrieve()
                .bodyToMono(String.class).block();
    }
}
