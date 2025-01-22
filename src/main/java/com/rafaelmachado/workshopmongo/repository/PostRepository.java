package com.rafaelmachado.workshopmongo.repository;

import com.rafaelmachado.workshopmongo.domain.Post;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}
