package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Bike;
import com.example.demo.repo.BikeRepository;

@RestController
@RequestMapping("/bike")
@CrossOrigin("*")
public class BikeController {

    @Autowired
    private BikeRepository bikeRepo;

    // GET ALL BIKES
    @GetMapping
    public List<Bike> getAllBikes() {
        return (List<Bike>) bikeRepo.findAll();
    }

    // ADD BIKE
    @PostMapping("/addNewBike")
    public Bike addBike(@RequestBody Bike bike) {
        return bikeRepo.save(bike);
    }

    // GET BIKE BY ID
    @GetMapping("/{id}")
    public Bike getBikeById(@PathVariable int id) {
        return bikeRepo.findById(id).orElse(null);
    }

    // UPDATE BIKE
    @PutMapping("/{id}")
    public Bike updateBike(@PathVariable int id, @RequestBody Bike bikeDetails) {
        Bike bike = bikeRepo.findById(id).orElse(null);
        if (bike != null) {
            bike.setModel(bikeDetails.getModel());
            bike.setColor(bikeDetails.getColor());
            bike.setPrice(bikeDetails.getPrice());
            return bikeRepo.save(bike);
        }
        return null;
    }

    // DELETE BIKE
    @DeleteMapping("/{id}")
    public void deleteBike(@PathVariable int id) {
        bikeRepo.deleteById(id);
    }
}
