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


import com.example.demo.entity.Car;
import com.example.demo.repo.CarRepo;
@RestController
@RequestMapping("/car")
@CrossOrigin("*")
public class HomeController {


	    @Autowired
	    private CarRepo carrepo;

	    @GetMapping
	    public List<Car> getAllCars() {
	        return (List<Car>) carrepo.findAll();
	    }

	    @PostMapping("/addCar")
	    public Car addCar(@RequestBody Car car) {
	        return carrepo.save(car);
	    }

	    @GetMapping("/{id}")
	    public Car getCarById(@PathVariable int id) {
	        return carrepo.findById(id).orElse(null);
	    }

	    @PutMapping("/{id}")
	    public Car updateCar(@PathVariable int id, @RequestBody Car carDetails) {
	        Car car = carrepo.findById(id).orElse(null);
	        if (car != null) {
	            car.setModel(carDetails.getModel());
	            car.setColor(carDetails.getColor());
	            car.setPrice(carDetails.getPrice());
	            return carrepo.save(car);
	        }
	        return null;
	    }

	    @DeleteMapping("/{id}")
	    public void deleteCar(@PathVariable int id) {
	        carrepo.deleteById(id);
	    }
	}

