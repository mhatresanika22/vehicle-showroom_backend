package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.TestRide;
import com.example.demo.repo.TestRideRepo;

@Service
public class TestRideService {

    @Autowired
    private TestRideRepo repo;

    public TestRide bookRide(TestRide ride) {
        return repo.save(ride);
    }
}

