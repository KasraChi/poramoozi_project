package com.poramoozi.dashboard.base.Repository;

import com.poramoozi.dashboard.base.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course,Long> {
}
