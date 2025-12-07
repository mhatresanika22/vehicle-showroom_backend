//package com.example.demo.controller;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.example.demo.repo.BikeRepository;
//import com.example.demo.repo.CarRepo;
//
//@RestController
//@RequestMapping("/api/search")
//@CrossOrigin("*")
//public class SearchController {
//
//    @Autowired
//    CarRepo carRepo;
//
//    @Autowired
//    BikeRepository bikeRepo;
//
//    @GetMapping
//    public List<Map<String,Object>> search(@RequestParam String q) {
//        
//        List<Map<String,Object>> result = new ArrayList<>();
//
//        carRepo.findByModelContainingIgnoreCase(q).forEach(car -> {
//            Map<String, Object> map = new HashMap<>();
//            map.put("id", car.getId());
//            map.put("model", car.getModel());
//            map.put("price", car.getPrice());
//            map.put("type", "Car");
//            result.add(map);
//        });
//
//        bikeRepo.findByModelContainingIgnoreCase(q).forEach(bike -> {
//            Map<String, Object> map = new HashMap<>();
//            map.put("id", bike.getId());
//            map.put("model", bike.getModel());
//            map.put("price", bike.getPrice());
//            map.put("type", "Bike");
//            result.add(map);
//        });
//
//        return result;
//    }
//}
