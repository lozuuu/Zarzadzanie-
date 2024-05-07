package com.carworkshop.carworkshopapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public class ReservationsRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Reservations> getAll()
    {

        return  jdbcTemplate.query("SELECT ID_rezerwacji,opis_problemu from Rezerwacje;",
                BeanPropertyRowMapper.newInstance(Reservations.class));
        // return query;
    }
}
