package com.didispace.dao;

import com.didispace.bean.UserEntity;

/**
 * @author adminytf
 *
 */
public interface UserDao {

	/**
	 * 创建对象
	 * 
	 * @param user
	 */
	public void saveUser(UserEntity user);

	/**
	 * 根据用户名查询对象
	 * 
	 * @param userName
	 * @return
	 */
	public UserEntity findUserByUserName(String userName);

	/**
	 * 更新对象
	 * 
	 * @param user
	 */
	public void updateUser(UserEntity user);

	/**
	 * 删除对象
	 * 
	 * @param id
	 */
	public void deleteUserById(Long id);
}
