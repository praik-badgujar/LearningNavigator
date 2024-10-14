package com.learningNavigator.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.learningNavigator.demo.entity.Subject;

public interface SubjectRepository extends JpaRepository<Subject, Long>{

}
