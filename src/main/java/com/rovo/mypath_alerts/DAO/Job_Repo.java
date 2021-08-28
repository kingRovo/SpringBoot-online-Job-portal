package com.rovo.mypath_alerts.DAO;

import com.rovo.mypath_alerts.Models.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Job_Repo extends JpaRepository<Job,Long> {

    @Query("select title,companyName,PayPackage,jobRole,jobDiscription,education,date from Job order by jobId DESC")
    List<Job> findByFirstName();

}
