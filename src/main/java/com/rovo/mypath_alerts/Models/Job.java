package com.rovo.mypath_alerts.Models;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long jobId;
    private String title;
    private String companyName;
    private String jobRole;
    private String location;
    private String experience;
    private String education;
    private int PayPackage;
    @Temporal(value = TemporalType.TIMESTAMP)
    @Column(name = "CREATED_TIME")
    private Date date;
    private String jobDiscription;
    private String applyLink;
    private String batch;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date lastDate;
    private Boolean isGovernment;
    @Lob
    private byte[] jobDetails;

    public Date getLastDate() {
        return lastDate;
    }

    public void setLastDate(Date lastDate) {
        this.lastDate = lastDate;
    }


    public Job() {

    }

    public int getPayPackage() {
        return PayPackage;
    }

    public void setPayPackage(int payPackage) {
        PayPackage = payPackage;
    }

    public Long getJobId() {
        return jobId;
    }

    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getJobRole() {
        return jobRole;
    }

    public void setJobRole(String jobRole) {
        this.jobRole = jobRole;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getJobDiscription() {
        return jobDiscription;
    }

    public void setJobDiscription(String jobDiscription) {
        this.jobDiscription = jobDiscription;
    }

    public String getApplyLink() {
        return applyLink;
    }

    public void setApplyLink(String applyLink) {
        this.applyLink = applyLink;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public Boolean getGovernment() {
        return isGovernment;
    }

    public void setGovernment(Boolean government) {
        isGovernment = government;
    }

    public byte[] getJobDetails() {
        return jobDetails;
    }

    public void setJobDetails(byte[] jobDetails) {
        this.jobDetails = jobDetails;
    }
}

