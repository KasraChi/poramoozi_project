//package com.poramoozi.dashboard.base.Repository;
//
//import com.poramoozi.dashboard.taskmanagement.domain.Task;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.domain.Slice;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public interface TaskRepository extends JpaRepository<Task, Long>, JpaSpecificationExecutor<Task> {
//
//    // If you don't need a total row count, Slice is better than Page as it only performs a select query.
//    // Page performs both a select and a count query.
//    Slice<Task> findAllBy(Pageable pageable);
//}
