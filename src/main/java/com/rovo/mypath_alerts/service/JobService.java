package com.rovo.mypath_alerts.service;

import com.rovo.mypath_alerts.DAO.Job_Repo;
import com.rovo.mypath_alerts.Models.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class JobService {
    @Autowired
    private Job_Repo job_repo;

    public List<Job> DisplayAll(){
        return job_repo.findAll(Sort.by(Sort.Direction.DESC, "jobId"));
    }
    @Transactional
    public void  addNewJob(Job job){
        job_repo.save(job);
    }

    public void editJob(Long id){
        Job editJob = job_repo.getById(id);
        job_repo.save(editJob);
    }

    public void deleteJob(Long id){
      job_repo.deleteById(id);
    }

    public List<Job> search(String keyword){
        return job_repo.searchJob(keyword);
    }

    @Modifying
    public void AutoDelete(){
        job_repo.deleteByCreatedOnBefore(java.time.LocalDate.now());
    }


}
