package ru.kata.spring.boot_security.demo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.kata.spring.boot_security.demo.model.Role;

@Repository
public interface RoleDAO extends JpaRepository <Role, Integer> {
    @Query("SELECT r FROM Role r WHERE r.name = :name")
    Role getRoleByName(String name);
}
