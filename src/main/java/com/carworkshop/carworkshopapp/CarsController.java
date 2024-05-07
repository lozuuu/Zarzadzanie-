package com.carworkshop.carworkshopapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarsController {
    @Autowired
    CarsRepository carsRepository;

    @GetMapping("/testv2")
    public int test(){
        return 1;
    }
    @GetMapping("/cars")
    public List<Cars> getAll(){
        return carsRepository.getAll();
    }
    @GetMapping("/{id}")
    public Cars getById(@PathVariable("id") int id){
        return carsRepository.getById(id);
    }

    @PostMapping("/add")
    public String add(@RequestBody Cars car){
    return carsRepository.add(car);
    }

    @PatchMapping("/update/{id}")
    public String update(@PathVariable("id") int id, @RequestBody Cars updateCars){
        Cars carToUpdate = carsRepository.getById(id);
        if(carToUpdate != null) {
            carToUpdate.setID_klienta(updateCars.getID_klienta());
            carToUpdate.setMarka(updateCars.getMarka());
            carToUpdate.setModel(updateCars.getModel());
            carToUpdate.setModel(updateCars.getModel());
            carToUpdate.setRok_produkcji(updateCars.getRok_produkcji());
            carToUpdate.setNumer_rejestracyjny(updateCars.getNumer_rejestracyjny());
            return carsRepository.update(carToUpdate);
        }
        else return "Update failed\nWrong ID";
        }

        @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable("id") int id){
        Cars carToDelete = carsRepository.getById(id);
        if(carToDelete != null) {
            return carsRepository.delete(id);
        }
        else return "Delete failed";


        }


    }


