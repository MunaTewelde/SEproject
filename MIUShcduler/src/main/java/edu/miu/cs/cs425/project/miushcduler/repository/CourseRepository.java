package edu.miu.cs.cs425.project.miushcduler.repository;

import edu.miu.cs.cs425.project.miushcduler.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course,Long> {
}
