package org.xs.bookrack.api.service;

import org.springframework.stereotype.Service;
import org.xs.bookrack.api.common.service.CrudService;
import org.xs.bookrack.api.dao.IUserBookDao;
import org.xs.bookrack.api.entity.UserBookInfo;

/**
 * 用户书籍类
 */
@Service
public class UserBookService extends CrudService<IUserBookDao, UserBookInfo> {
	
}
