package org.xs.bookrack.api.service;

import org.springframework.stereotype.Service;
import org.xs.bookrack.api.common.service.CrudService;
import org.xs.bookrack.api.dao.IBookDao;
import org.xs.bookrack.api.entity.BookInfo;

@Service
public class BookService extends CrudService<IBookDao, BookInfo> {
	
}
