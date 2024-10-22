package com.example.bonjour_app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class BonjourController {

    @Autowired
    private MongoTemplate mongoTemplate;

    @GetMapping("/")
    public String bonjour() {
        return "Bonjour";
    }

    @GetMapping("/test-db")
    public String testDatabaseConnection() {
        long count = mongoTemplate.getCollection("exemples").countDocuments();
        return "Database connected. Document count: " + count;
    }
}
