package com.example.demo.repository;

import com.example.demo.model.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepo extends CrudRepository<Message, Long> {}
