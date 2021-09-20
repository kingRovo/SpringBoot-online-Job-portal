package com.rovo.mypath_alerts.controller;

import com.rovo.mypath_alerts.Models.Job;
import com.rovo.mypath_alerts.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JobController {
    @Autowired
    private JobService jobService;

    @GetMapping("/")
    public List<Job> DisplayJobs(){
        return jobService.DisplayAll();
    }
    @GetMapping("/findJob/{job}")
    public List<Job>FindJob(@PathVariable String keyword){
        return jobService.search(keyword);
    }
    @PostMapping("/job")
    public void addJob(@RequestBody Job job){
        jobService.addNewJob(job);
    }
    @PutMapping("/edit_job{id}")
    public  void editJob(@PathVariable Long id){
        jobService.editJob(id);
    }
    @DeleteMapping("/")
    public void DeleteAfterJobExpire(){
        jobService.AutoDelete();
    }



}
