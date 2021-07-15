package edu.miu.cs.cs425.project.miushcduler.repository;

import edu.miu.cs.cs425.project.miushcduler.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface studentRepository extends JpaRepository<Student,Long> {
}
