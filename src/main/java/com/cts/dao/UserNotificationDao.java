package com.cts.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.model.UserNotificationBean;

@Repository
public interface UserNotificationDao extends JpaRepository<UserNotificationBean, Integer> {

}
