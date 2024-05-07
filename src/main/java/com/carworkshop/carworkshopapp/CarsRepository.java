package com.carworkshop.carworkshopapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CarsRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;
    private static final String GET_ALL_CARS = "SELECT * FROM Samochody";
    private static final String GET_CAR_BY_ID = "SELECT * FROM Samochody WHERE ID_samochodu = ?";
    private static final String ADD_CAR = "INSERT INTO Samochody(ID_klienta, marka, model, rok_produkcji, numer_rejestracyjny) values(?,?,?,?,?)";
    private static final String UPDATE_CAR = "UPDATE Samochody set ID_klienta=?, marka=?, model=?, rok_produkcji=?, numer_rejestracyjny=? WHERE ID_samochodu=?";
    private static final String DELETE_CAR = "DELETE FROM Samochody WHERE ID_samochodu=?";

   public List<Cars> getAll()
   {
       return jdbcTemplate.query("SELECT * FROM Samochody",BeanPropertyRowMapper.newInstance(Cars.class));
   }

   public Cars getById(int id) {
       return jdbcTemplate.queryForObject(GET_CAR_BY_ID,
               BeanPropertyRowMapper.newInstance(Cars.class),id);
   }
   public String add(Cars car) {
       jdbcTemplate.update("INSERT INTO Samochody (ID_klienta, marka, model, rok_produkcji, numer_rejestracyjny) VALUES(?,?,?,?,?)",
               car.getID_klienta(), car.getMarka(), car.getModel(), car.getRok_produkcji(), car.getNumer_rejestracyjny());
       return "car " + car.getMarka() + " " + car.getModel() + " added";
   }
   public String update(Cars car) {
       jdbcTemplate.update(  UPDATE_CAR, car.getID_klienta(), car.getMarka(), car.getModel(), car.getRok_produkcji(), car.getNumer_rejestracyjny());
       return "car " + car.getMarka() + " " + car.getModel() + " updated";

   }
   public String delete(int id) {
       Cars car = getById(id);
       jdbcTemplate.update(DELETE_CAR, id);
       return "car " + car.getMarka() + " " + car.getModel() + " deleted";
   }
}
