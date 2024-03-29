package com.awscourse.repository;

import com.awscourse.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Optional;

@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findOneByLogin(String login);

    Optional<User> findOneByEmailIgnoreCase(String email);

}
