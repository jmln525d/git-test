package com.jsp.springBootCRUD.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.springBootCRUD.dto.Student;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
