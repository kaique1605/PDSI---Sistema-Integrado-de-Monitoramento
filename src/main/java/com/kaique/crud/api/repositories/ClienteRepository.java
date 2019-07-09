package com.kaique.crud.api.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.kaique.crud.api.documents.Cliente;

public interface ClienteRepository extends MongoRepository<Cliente, String> {

}
