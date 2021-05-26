package fr.mmo.lead.management.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.mmo.lead.management.domain.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUserName(String name); // findBy + le nom de field
}
