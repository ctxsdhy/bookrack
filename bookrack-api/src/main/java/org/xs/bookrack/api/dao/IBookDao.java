package org.xs.bookrack.api.dao;

import org.springframework.stereotype.Repository;
import org.xs.bookrack.api.common.persistence.CrudDao;
import org.xs.bookrack.api.entity.BookInfo;

/**
 * 书籍数据类
 */
@Repository
public interface IBookDao extends CrudDao<BookInfo> {
	
	
}
