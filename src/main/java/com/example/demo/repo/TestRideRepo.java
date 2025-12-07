package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.TestRide;

public interface TestRideRepo extends JpaRepository<TestRide, Integer> {}

