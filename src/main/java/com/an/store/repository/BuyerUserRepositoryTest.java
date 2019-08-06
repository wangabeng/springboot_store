package com.an.store.repository;

import java.util.List;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.an.store.dataobject.BuyerUser;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BuyerUserRepositoryTest {
	@Autowired
	private BuyerUserRepository repositoy;
	
	@Test
	public void findOne () throws Exception {
		List<BuyerUser> result = repositoy.findByUserId(1);
		System.out.print(result);
	}

}
