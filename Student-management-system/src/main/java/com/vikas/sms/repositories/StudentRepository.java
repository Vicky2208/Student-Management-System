package com.vikas.sms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vikas.sms.entities.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}
