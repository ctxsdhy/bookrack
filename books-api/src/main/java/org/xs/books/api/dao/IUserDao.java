package org.xs.books.api.dao;

import org.springframework.stereotype.Repository;
import org.xs.books.api.common.persistence.CrudDao;
import org.xs.books.api.entity.UserInfo;

/**
 * 用户数据类
 */
@Repository
public interface IUserDao extends CrudDao<UserInfo> {
	
	
}
