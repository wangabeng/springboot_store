package com.an.store.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.an.store.dataobject.BuyerUser;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BuyerUserServiceImplTest {
	@Autowired
	private BuyerUserServiceImpl buyerUserServiceImpl;
	@Test
	public void findOne () {
		BuyerUser result = buyerUserServiceImpl.findOne(1);
		System.out.print(result);
	}
}
