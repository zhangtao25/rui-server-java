package com.rico.ser.test;

import java.io.Serializable;

public class CommandInfo implements Serializable {
    private String username;
    private String pwd;

    public String getPwd() {
        return pwd;
    }

    public String getUsername() {
        return username;
    }
}
