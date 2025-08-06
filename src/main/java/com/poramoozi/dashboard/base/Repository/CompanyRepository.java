package com.poramoozi.dashboard.base.Repository;

import com.poramoozi.dashboard.base.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company,Long> {
}
