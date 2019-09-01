package com.ysx.demo.user.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ysx.demo.modle.user.User;
import com.ysx.demo.user.dao.UserDao;
@Repository
public class UserDaoImpl implements UserDao {

	@Override
	public List<User> queryList() {
		List<User> list = new ArrayList<User>();
		User user = new User();
		user.setUserName("张三");
		user.setAge(18);
		user.setAccount("zhangsan");
		user.setVersion((long) 3);
		list.add(user);
		return list;
	}

	@Override
	public User queryUserById(String userName) {
		User user = new User();
		user.setUserName(userName);
		user.setAge(18);
		user.setAccount("zhangsan");
		user.setVersion((long) 3);
		return user;
	}

}
