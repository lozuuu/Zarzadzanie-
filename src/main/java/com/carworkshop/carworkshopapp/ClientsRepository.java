package com.carworkshop.carworkshopapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository

public class ClientsRepository {
@Autowired
    JdbcTemplate jdbcTemplate;

    public List<Clients> getAll()
    {

        return  jdbcTemplate.query("SELECT * from Klienci",
                BeanPropertyRowMapper.newInstance(Clients.class));
           // return query;
    }
}
