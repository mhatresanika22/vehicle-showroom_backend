package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Bike;
import com.example.demo.repo.BikeRepository;
import com.example.demo.service.BikeService;

@Service
public class BikeServiceImpl implements BikeService {

    @Autowired
    private BikeRepository bikeRepo;

    @Override
    public List<Bike> getAllBikes() {
        return (List<Bike>) bikeRepo.findAll();
    }

    @Override
    public Bike getBikeById(int id) {
        return bikeRepo.findById(id).orElse(null);
    }

    @Override
    public Bike addBike(Bike bike) {
        return bikeRepo.save(bike);
    }

    @Override
    public Bike updateBike(int id, Bike bikeDetails) {
        Bike bike = bikeRepo.findById(id).orElse(null);
        if (bike != null) {
            bike.setModel(bikeDetails.getModel());
            bike.setColor(bikeDetails.getColor());
            bike.setPrice(bikeDetails.getPrice());
            return bikeRepo.save(bike);
        }
        return null;
    }

    @Override
    public void deleteBike(int id) {
        bikeRepo.deleteById(id);
    }
}
