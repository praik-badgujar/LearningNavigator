package com.learningNavigator.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learningNavigator.demo.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
