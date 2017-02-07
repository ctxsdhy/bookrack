package org.xs.bookrack.api.service;

import org.springframework.stereotype.Service;
import org.xs.bookrack.api.common.service.CrudService;
import org.xs.bookrack.api.dao.IUserDao;
import org.xs.bookrack.api.entity.UserInfo;

@Service
public class UserService extends CrudService<IUserDao, UserInfo> {

}
