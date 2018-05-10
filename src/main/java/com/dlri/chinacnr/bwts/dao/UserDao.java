package com.dlri.chinacnr.bwts.dao;

import com.dlri.chinacnr.bwts.entity.User;

/**
 * 用户DAO接口
 * @author chenchuang
 *
 */
public interface UserDao {

	public User login(User user);
}
