package com.poramoozi.dashboard.base.Repository;

import com.poramoozi.dashboard.base.model.PreRegistration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PreRegistrationRepository extends JpaRepository<PreRegistration,Long> {
}
