package com.poramoozi.dashboard.base.Repository;

import com.poramoozi.dashboard.base.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task,Long> {
}
