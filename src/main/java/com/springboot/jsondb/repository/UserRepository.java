package com.springboot.jsondb.repository;


import com.springboot.jsondb.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
