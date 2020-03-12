package com.cts.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cts.model.UserNotificationBean;

@Repository
public interface UserNotificationDao extends JpaRepository<UserNotificationBean, Integer> {

	@Query("select unb.Message from UserNotificationBean unb where unb.click=false and unb.user=:userid")
	public List<String> findMessageByUser(String userid);

}
