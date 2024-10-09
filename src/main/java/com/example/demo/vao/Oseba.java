package com.example.demo.vao;

import lombok.Data;


@Data
public class Oseba {

    private String ime;
    private String priimek;
    private int id;

    public Oseba(String ime, String priimek, int id) {
        this.ime =ime;
        this.priimek = priimek;
        this.id = id;
    }
}
