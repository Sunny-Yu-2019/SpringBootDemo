package com.ysx.demo.service.cache;


import com.ysx.demo.modle.user.User;


/**
 * 
 * @author haidiyixiaoyu
 *
 */
public interface CacheService {

	/**
	 * 初始化缓存数据
	 * @return
	 */
	boolean initCache();
	
	/**
	 * 定时更新缓存数据
	 */
	void scheduleCache();
	
	/**
	 * 更新缓存逻辑
	 * @return
	 */
	String updateCache();
	
	/**
	 * 通过key获取缓存中User
	 * @param key
	 * @return
	 */
	User getUserElementByKey(String key);
	
	/**
	 * 判断User是否存在缓存
	 * @param key
	 * @return
	 */
	boolean existUserElement(String key) ;
	
}
