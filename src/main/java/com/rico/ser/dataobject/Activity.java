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
    private String did;
    @Column(name = "Name")
    private String sname;
    @Column(name = "numberlimit")
    private int NumberLimit;
}