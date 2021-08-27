package com.rovo.mypath_alerts.service;

import com.rovo.mypath_alerts.DAO.Blog_Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlogService {

    @Autowired
    private Blog_Repo blog_repo;


}
