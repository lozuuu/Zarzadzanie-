package com.carworkshop.carworkshopapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClientsController {

    @Autowired
    ClientsRepository clientsRepository;

    @GetMapping("/test")
    public int test(){
        return 1;
    }
    @GetMapping("/clients")
    public List<Clients> getAll(){
       return clientsRepository.getAll();
    }
}
