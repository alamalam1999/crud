package com.alam.locations.location.service;

import com.alam.locations.location.model.Testing;

import java.util.List;

public interface TestingService {

    Testing saveTesting(Testing testing);
    Testing updateTesting(Testing testing);
    void deleteTesting(Testing testing);
    Testing getTestingById(int id);
    List<Testing> getAllTesting();
}
