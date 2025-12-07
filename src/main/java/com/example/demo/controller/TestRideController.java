package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.TestRide;
import com.example.demo.service.TestRideService;

@RestController
@RequestMapping("/testride")
@CrossOrigin("*")
public class TestRideController {

    @Autowired
    private TestRideService service;

    @PostMapping("/book")
    public ResponseEntity<TestRide> book(@RequestBody TestRide ride) {
        return ResponseEntity.ok(service.bookRide(ride));
    }
}
