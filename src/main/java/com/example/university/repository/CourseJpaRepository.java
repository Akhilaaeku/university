/*
 *
 * You can use the following import statements
 * 
 * import org.springframework.data.jpa.repository.JpaRepository;
 * import org.springframework.stereotype.Repository;
 * 
 */

package com.example.university.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.university.model.Course;
import com.example.university.model.Professor;

@Repository
public interface CourseJpaRepository extends JpaRepository<Course, Integer> {
    List<Course> findByProfessor(Professor professor);

}