package com.learningNavigator.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learningNavigator.demo.entity.Exam;
import com.learningNavigator.demo.service.ExamService;

@RestController
@RequestMapping("/exams")
public class ExamController {

	@Autowired
    private ExamService examService;

    @PostMapping("/{examId}/register/{studentId}")
    public ResponseEntity<Exam> registerStudentForExam(@PathVariable Long examId, @PathVariable Long studentId) {
        return ResponseEntity.ok(examService.registerStudentForExam(examId, studentId));
    }
}
