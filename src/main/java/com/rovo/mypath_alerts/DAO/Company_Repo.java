package com.rovo.mypath_alerts.DAO;

import com.rovo.mypath_alerts.Models.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Company_Repo extends JpaRepository<Company,Long> {
}
