package com.Mall.MallAdmin.Repository;

import com.Mall.MallAdmin.Entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {
    // Custom query methods if needed
    Admin findByUsername(String username);
}
