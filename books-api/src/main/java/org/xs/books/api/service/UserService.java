package org.xs.books.api.service;

import org.springframework.stereotype.Service;
import org.xs.books.api.common.service.CrudService;
import org.xs.books.api.dao.IUserDao;
import org.xs.books.api.entity.UserInfo;

@Service
public class UserService extends CrudService<IUserDao, UserInfo> {

}
