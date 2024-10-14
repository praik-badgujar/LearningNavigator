package com.learningNavigator.demo.entity;

import java.util.List;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Student {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToMany
    @JoinTable(
        name = "student_subject",
        joinColumns = @JoinColumn(name = "student_id"),
        inverseJoinColumns = @JoinColumn(name = "subject_id"))
    private List<Subject> enrolledSubjects;

    @ManyToMany
    @JoinTable(
        name = "student_exam",
        joinColumns = @JoinColumn(name = "student_id"),
        inverseJoinColumns = @JoinColumn(name = "exam_id"))
    private List<Exam> registeredExams;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Subject> getEnrolledSubjects() {
		return enrolledSubjects;
	}

	public void setEnrolledSubjects(List<Subject> enrolledSubjects) {
		this.enrolledSubjects = enrolledSubjects;
	}

	public List<Exam> getRegisteredExams() {
		return registeredExams;
	}

	public void setRegisteredExams(List<Exam> registeredExams) {
		this.registeredExams = registeredExams;
	}
    
    

}
