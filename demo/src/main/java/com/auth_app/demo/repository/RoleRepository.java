package com.auth_app.demo.repository;

import com.auth_app.demo.model.ERole;
import com.auth_app.demo.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
