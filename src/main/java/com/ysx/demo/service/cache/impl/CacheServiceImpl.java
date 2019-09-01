package com.ysx.demo.service.cache.impl;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ysx.demo.modle.user.User;
import com.ysx.demo.service.cache.CacheService;
import com.ysx.demo.user.dao.UserDao;

import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;

/**
 * Ecache缓存服务类
 * @author haidiyixiaoyu
 *
 */
@Service
public class CacheServiceImpl implements CacheService {

	@Autowired
	UserDao userDao;
	
	@Autowired
	CacheManager cacheManager;
	
	@PostConstruct
	@Override
	public boolean initCache() {
		boolean result = false;
			Cache userCache = cacheManager.getCache("usercache");
			List<User> list = userDao.queryList();
			for (User user : list) {
				Element element = new Element(user.getAccount(),user);
				element.setVersion(user.getVersion());
				userCache.put(element);
				System.out.println("userCache......" + user.toString());
			}
			result = true;
		
		return result;
	}
	
	@Override
	public User getUserElementByKey(String key) {
		return null;
	}

	@Override
	public boolean existUserElement(String key) {
		return false;
	}

	@Override
	public void scheduleCache() {
		
	}

	@Override
	public String updateCache() {
		return null;
	}
	
	
	
}
