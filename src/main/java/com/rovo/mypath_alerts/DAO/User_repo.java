package com.rovo.mypath_alerts.DAO;

import com.rovo.mypath_alerts.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface User_repo extends JpaRepository<User, Long> {
}
