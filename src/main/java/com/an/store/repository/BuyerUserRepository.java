package com.an.store.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.an.store.dataobject.BuyerUser;


public interface BuyerUserRepository extends JpaRepository<BuyerUser, Integer> {
	//	通过用户ID查找一个用户
	BuyerUser findByUserId(Integer userId);
}
