package com.an.store.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.an.store.dataobject.BuyerUser;
import com.an.store.repository.BuyerUserRepository;
import com.an.store.service.BuyerUserService;


@Service
public class BuyerUserServiceImpl implements BuyerUserService {
	@Autowired
	private BuyerUserRepository repository;
	@Override
	public BuyerUser findOne (Integer userId) {
		return repository.findByUserId(userId);
	}
}
