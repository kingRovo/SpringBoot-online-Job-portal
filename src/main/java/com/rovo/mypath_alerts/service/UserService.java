package com.rovo.mypath_alerts.service;

import com.rovo.mypath_alerts.DAO.User_repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private User_repo user_repo;
}
