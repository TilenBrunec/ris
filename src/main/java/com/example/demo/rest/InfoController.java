package com.example.demo.rest;

import com.example.demo.vao.Oseba;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class InfoController {

    @GetMapping("/info")
    public String pozdravi() {
        return "Zdravo";
    }

    @GetMapping("/osebe")
    public List<Oseba> getAllOseba(){
        List<Oseba> allosebas = new ArrayList<>();
        allosebas.add(new Oseba("Peter", "Martin",1));
        allosebas.add(new Oseba("Petja", "Mar",2));
        allosebas.add(new Oseba("Pero", "Marti",3));
        return allosebas;
    }

    @GetMapping("/osebe/{id}")
    public Oseba getOseba(@PathVariable("id") int id) {
        Oseba ret = new Oseba("miki","strel",3);
        ret.setId(id);
        return ret;
    }
}