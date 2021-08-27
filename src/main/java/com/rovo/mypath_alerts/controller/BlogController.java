package com.rovo.mypath_alerts.controller;

import com.rovo.mypath_alerts.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogController {

    @Autowired
    private BlogService blogService;

}
