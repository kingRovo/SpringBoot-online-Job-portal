package com.rovo.mypath_alerts.DAO;

import com.rovo.mypath_alerts.Models.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface Job_Repo extends JpaRepository<Job, Long> {


    @Query("SELECT j FROM Job j WHERE j.title LIKE %?1%"
            + " OR j.companyName LIKE %?1%"
            + " OR j.batch LIKE %?1%"
            + " OR j.education LIKE %?1%")
    List<Job> searchJob(String keyword);

    @Query("delete from Job where lastDate > ?1")
    void deleteByCreatedOnBefore(LocalDate todaydate);

}
