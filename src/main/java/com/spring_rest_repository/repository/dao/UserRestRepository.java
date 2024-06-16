package com.spring_rest_repository.repository.dao;

import com.spring_rest_repository.repository.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "users")
public interface UserRestRepository extends JpaRepository<User, Long> {
}
