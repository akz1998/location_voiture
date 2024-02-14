package com.example.locationvoiture.repo;

import com.example.locationvoiture.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo  extends CrudRepository<User,Long> {


    User findByEmail(String email);
}
