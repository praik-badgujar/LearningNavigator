package com.learningNavigator.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learningNavigator.demo.entity.Exam;
import com.learningNavigator.demo.entity.Student;
import com.learningNavigator.demo.repository.ExamRepository;
import com.learningNavigator.demo.repository.StudentRepository;
import com.learningNavigator.demo.repository.SubjectRepository;

@Service
public class ExamService {
    @Autowired
    private ExamRepository examRepository;

    @Autowired
    private SubjectRepository subjectRepository;

    @Autowired
    private StudentRepository studentRepository;

    public Exam registerStudentForExam(Long examId, Long studentId) {
        Exam exam = examRepository.findById(examId).orElseThrow(() -> new RuntimeException("Exam not found"));
        Student student = studentRepository.findById(studentId).orElseThrow(() -> new RuntimeException("Student not found"));

        if (!student.getEnrolledSubjects().contains(exam.getSubject())) {
            throw new RuntimeException("Student is not enrolled in the corresponding subject");
        }

        student.getRegisteredExams().add(exam);
        exam.getStudents().add(student);

        studentRepository.save(student);
        return examRepository.save(exam);
    }


}
