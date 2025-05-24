package ru.itgirl.libraryProject.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itgirl.libraryProject.model.entity.AppUser;

import java.util.Optional;

public interface UserRepository extends JpaRepository<AppUser, Long> {

    Optional<AppUser> findByUsername(String username);
}