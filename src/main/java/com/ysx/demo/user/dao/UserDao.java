package com.ysx.demo.user.dao;

import java.util.List;


import com.ysx.demo.modle.user.User;
/**
 * 
 * @author haidiyixiaoyu
 *
 */
public interface UserDao {
	
	/**
	 * 
	 * @return
	 */
	List<User> queryList();
	
	/**
	 * 
	 * @param userName
	 * @return
	 */
	User queryUserById(String userName);
}
