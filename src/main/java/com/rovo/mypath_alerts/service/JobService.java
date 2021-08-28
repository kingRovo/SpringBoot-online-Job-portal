package com.rovo.mypath_alerts.service;

import com.rovo.mypath_alerts.DAO.Job_Repo;
import com.rovo.mypath_alerts.Models.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class JobService {
    @Autowired
    private Job_Repo job_repo;

    //To Find recent 20 jobs sort by ids
    public List<Job> DisplayAll(){
        int limit=20;
        List<Job> ls =new ArrayList<>();
        return job_repo.findAll(Sort.by(Sort.Direction.DESC, "jobId"));

    }
    @Transactional
    public void  addNewJob(Job job){
        job_repo.save(job);
    }

}
