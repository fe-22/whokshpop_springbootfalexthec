package com.falexthec.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.falexthec.course.entities.usa;

public interface UserRepository extends JpaRepository<usa, Long>{

}
