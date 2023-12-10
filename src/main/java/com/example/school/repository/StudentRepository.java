package com.example.school.repository;

import com.example.school.model.Student;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Vanessa Ferreira
 */
public interface StudentRepository extends JpaRepository<Student, UUID>{

}
