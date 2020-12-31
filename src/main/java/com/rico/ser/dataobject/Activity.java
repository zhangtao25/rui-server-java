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
    private String id;
    private String name;
    private int cost;
    @Column(name = "numberlimit")
    private int numberLimit;
    private int creater;
    @Column(name = "starttime")
    private String startTime;
    @Column(name = "endtime")
    private String endTime;
    private String content;
}