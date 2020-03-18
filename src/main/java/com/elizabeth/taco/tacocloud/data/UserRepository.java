package com.elizabeth.taco.tacocloud.data;

import com.elizabeth.taco.tacocloud.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
