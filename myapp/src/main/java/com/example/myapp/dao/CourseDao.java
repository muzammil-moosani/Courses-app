package com.example.myapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.myapp.entities.Course;

@Repository
public interface CourseDao extends JpaRepository<Course, Long> {

}
