package com.cloudsea.messages.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.cloudsea.messages.model.Messages;

/**
 * 
 * @author kshahbaz
 *
 */
@RepositoryRestResource(path = "messages", itemResourceRel = "messages")
public interface MessagesRepository extends MongoRepository<Messages, String> {

}
