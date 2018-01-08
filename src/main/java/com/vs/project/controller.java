package com.vs.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class controller {

    @Autowired
    msgService srvc;
    @GetMapping("msg")
    public String Getmsg(){

        message msg = srvc.GetRandomMessage();

    return msg.getMsg();
    }
}
