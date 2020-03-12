package com.cts.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cts.model.UserNotificationBean;

@Repository
public interface UserNotificationDao extends JpaRepository<UserNotificationBean, Integer> {

	@Query("select unb from UserNotificationBean unb where unb.click=false and unb.User=:userid")
	public List<UserNotificationBean> findMessageByUser(String userid);

	@Modifying
	@Query("delete from UserNotificationBean unb where unb.issueId=:cid")
	public void deleteByIssueId(@Param("cid") int cid);

}
