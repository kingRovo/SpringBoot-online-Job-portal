package com.rovo.mypath_alerts.DAO;

import com.rovo.mypath_alerts.Models.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Job_Repo extends JpaRepository<Job,Long> {
}
