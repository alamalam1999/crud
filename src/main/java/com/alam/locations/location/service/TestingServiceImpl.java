package com.alam.locations.location.service;

import com.alam.locations.location.model.Testing;
import com.alam.locations.location.repository.TestingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestingServiceImpl implements TestingService {


    @Autowired
    private TestingRepository testingRepository;

    @Override
    public Testing saveTesting(Testing testing) {
        return testingRepository.save(testing);
    }

    @Override
    public Testing updateTesting(Testing testing) {
        return testingRepository.save(testing);
    }

    @Override
    public void deleteTesting(Testing testing) {
        testingRepository.delete(testing);
    }

    @Override
    public Testing getTestingById(int id) {
        return testingRepository.findById(id).get();
    }

    @Override
    public List<Testing> getAllTesting() {
        return testingRepository.findAll();
    }
}
