package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.Car;

public interface CarService {

    List<Car> getAllCars();

    Car getCarById(int id);

    Car addCar(Car car);

    Car updateCar(int id, Car car);

    void deleteCar(int id);
}
