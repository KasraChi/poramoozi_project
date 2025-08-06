package com.poramoozi.dashboard.base.Repository;

import com.poramoozi.dashboard.base.model.UserAssignment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAssignmentRepository extends JpaRepository<UserAssignment,Long> {
}
