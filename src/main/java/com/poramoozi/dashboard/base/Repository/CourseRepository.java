package com.poramoozi.dashboard.base.Repository;

import com.poramoozi.dashboard.base.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course,Long> {
}
