package com.poramoozi.dashboard.base.Repository;

import com.poramoozi.dashboard.base.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
