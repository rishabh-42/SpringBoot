package com.example.boot.answer4and6;

import org.springframework.beans.factory.annotation.Value;

public class Database {

    //Answer 5 , assigning value from application.properties

    @Value("${app.port}")
    int port;

    @Value("${app.name}")
    String name;

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
