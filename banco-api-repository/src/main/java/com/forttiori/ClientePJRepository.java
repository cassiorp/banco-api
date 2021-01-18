package com.forttiori;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientePJRepository extends MongoRepository<ClientePJ, String> {
}
