package org.xs.bookrack.api.dao;

import org.springframework.stereotype.Repository;
import org.xs.bookrack.api.common.persistence.CrudDao;
import org.xs.bookrack.api.entity.UserInfo;

/**
 * 用户数据类
 */
@Repository
public interface IUserDao extends CrudDao<UserInfo> {
	
	
}
