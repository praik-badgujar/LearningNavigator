package com.learningNavigator.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learningNavigator.demo.entity.Exam;

public interface ExamRepository extends JpaRepository<Exam, Long>{

}
