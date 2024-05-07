package com.carworkshop.carworkshopapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ReservationsController {

    @Autowired
    ReservationsRepository reservationsRepository;

    @GetMapping("/testReservations")
    public int test(){
        return 1;
    }
    @GetMapping("/reservations")
    public List<Reservations> getAll(){
        return reservationsRepository.getAll();
    }
}
