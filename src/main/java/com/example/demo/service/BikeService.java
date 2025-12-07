package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Bike;

public interface BikeService {

    List<Bike> getAllBikes();

    Bike getBikeById(int id);

    Bike addBike(Bike bike);

    Bike updateBike(int id, Bike bike);

    void deleteBike(int id);
}
