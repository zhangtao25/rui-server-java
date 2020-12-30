package com.rico.ser.service.impl;

import com.rico.ser.dataobject.Activity;
import com.rico.ser.repository.ActivityRepository;
import com.rico.ser.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActivityServiceImpl implements ActivityService {

    @Autowired
    private ActivityRepository repository;

    @Override
    public List<Activity> findAll() {
        return repository.findAll();
    }
}