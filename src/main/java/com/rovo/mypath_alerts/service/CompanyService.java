package com.rovo.mypath_alerts.service;

import com.rovo.mypath_alerts.DAO.Company_Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {

    @Autowired
    private Company_Repo company_repo;


}
