package com.vs.project;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface messageRepository extends CrudRepository<message,Integer> {

    message findById(int id);


}
