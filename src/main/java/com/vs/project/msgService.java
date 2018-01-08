package com.vs.project;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class msgService {
    @Autowired
    messageRepository repo;

    public message GetRandomMessage(){

        Random rn = new Random();

        int id = rn.nextInt(10);

        return repo.findById(id);

    }

    public void GenerateMessages(){

        repo.save(new message("Lorem"));
        repo.save(new message("ipsum"));
        repo.save(new message("dolor"));
        repo.save(new message("sit"));
        repo.save(new message("amet"));
        repo.save(new message("consetetur"));
        repo.save(new message("sadipscing"));
        repo.save(new message("elitr"));
        repo.save(new message("sed "));
        repo.save(new message("diam"));

    }
}
