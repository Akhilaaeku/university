/*
 *
 * You can use the following import statements
 * 
 * import java.util.ArrayList;
 * 
 */

package com.example.university.repository;

import com.example.university.model.Professor;
import com.example.university.model.Course;

import java.util.*;

public interface ProfessorRepository {
    ArrayList<Professor> getProfessors();

    Professor getProfessorById(int professorId);

    Professor addProfessor(Professor professor);

    Professor upadateProfessor(int professorId, Professor professor);

    void deleteProfessor(int professorId);

    List<Course> getCoursesOfProfessor(int professorId);
}