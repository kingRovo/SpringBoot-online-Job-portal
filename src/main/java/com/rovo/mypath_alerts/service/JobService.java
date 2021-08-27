package com.rovo.mypath_alerts.service;

import com.rovo.mypath_alerts.DAO.Job_Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobService {
    @Autowired
    private Job_Repo job_repo;



}
