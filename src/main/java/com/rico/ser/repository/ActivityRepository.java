package com.rico.ser.repository;

//import com.mangostreet.mangostreetserspring.dataobject.User;
import com.rico.ser.dataobject.Activity;
//import com.rico.ser.dataobject.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ActivityRepository extends JpaRepository<Activity, String> {
}