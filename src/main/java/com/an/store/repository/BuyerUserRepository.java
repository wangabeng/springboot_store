package com.an.store.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.an.store.dataobject.BuyerUser;


public interface BuyerUserRepository extends JpaRepository<BuyerUser, Integer> {
	   List<BuyerUser> findByUserId(Integer userId);
}
