package com.rico.ser.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@DynamicUpdate
@Data
public class Activity {

    @Id
    @Column(name = "Id")
    private String id;
    @Column(name = "Name")
    private String name;
//    @Column(name = "StartTime")
//    private String startTime;
}