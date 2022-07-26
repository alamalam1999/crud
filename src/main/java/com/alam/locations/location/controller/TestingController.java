package com.alam.locations.location.controller;

import com.alam.locations.location.model.Testing;
import com.alam.locations.location.service.TestingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestingController {

    @Autowired
    private TestingService testingService;

    @PostMapping("/showTesting")
    public List<Testing> showAllTesting() {
        List<Testing> testing = testingService.getAllTesting();
        return testing;
    }

    @PostMapping("/saveTesting")
    public Testing saveTesting(@RequestBody Testing testing) {
        return testingService.saveTesting(testing);
    }

    @PostMapping("/updateTesting/{id}")
    public Testing updateTesting(@PathVariable("id")int id, @RequestBody Testing testing) {
        Testing test = testingService.getTestingById(id);
        test.setName(testing.getName());
        test.setAddres(testing.getAddres());
        test.setFee(testing.getFee());

        return testingService.updateTesting(test);
    }

 /*   @PostMapping("/getTestingById/{id}")
    public Testing getTestingById(@PathVariable("id")int id) {
        Testing test = testingService.getTestingById(id);

        return test;
    }*/

    @PostMapping("/deleteTesting/{id}")
    public Testing deleteTesting(@PathVariable("id") int id) {
        Testing test = new Testing();
        test.setId(id);
        testingService.deleteTesting(test);
        return test;
    }
}
