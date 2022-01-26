package com.rovo.mypath_alerts.DAO;

import com.rovo.mypath_alerts.Models.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Blog_Repo extends JpaRepository<Blog, Long> {
}
