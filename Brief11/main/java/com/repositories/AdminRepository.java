package com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.models.Admin;

public interface AdminRepository extends JpaRepository<Admin, Long>{

}
