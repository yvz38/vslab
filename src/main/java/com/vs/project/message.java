package com.vs.project;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class message {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String msg;

    public message(String str){

        msg = str;
    };

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
