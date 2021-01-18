package com.forttiori;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientePFRepository extends MongoRepository<ClientePF, String> {
}
