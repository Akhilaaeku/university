/*
 *
 * You can use the following import statements
 * 
 * import org.springframework.beans.factory.annotation.Autowired;
 * import org.springframework.web.bind.annotation.*;
 * import java.util.ArrayList;
 * 
 */

package com.example.university.controller;

import com.example.university.model.*;
import com.example.university.service.*;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;

@RestController
public class ProfessorController {

    @Autowired
    public ProfessorJpaService professorJapService;

    @GetMapping("/professors")
    public ArrayList<Professor> getProfessors() {
        return professorJapService.getProfessors();
    }

    @GetMapping("/professors/{professorId}/courses")
    public List<Course> getProfessorCourse(@PathVariable("professorId") int professorId) {
        return professorJapService.getProfessorCoursesName(professorId);
    }

    @GetMapping("/professors/{professorId}")
    public Professor getProfessorById(@PathVariable("professorId") int professorId) {
        return professorJapService.getProfessorById(professorId);
    }

    @PostMapping("/professors")
    public Professor addProfessor(@RequestBody Professor professor) {
        return professorJapService.addProfessor(professor);
    }

    @PutMapping("/professors/{professorId}")
    public Professor updateProfessor(@PathVariable("professorId") int professorId, @RequestBody Professor professor) {
        return professorJapService.updateProfessor(professorId, professor);
    }

    @DeleteMapping("/professors/{professorId}")
    public void deleteProfessor(@PathVariable("professorId") int professorId) {
        professorJapService.deleteProfessor(professorId);
    }
}
