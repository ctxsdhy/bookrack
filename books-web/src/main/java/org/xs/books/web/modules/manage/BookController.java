package org.xs.books.web.modules.manage;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.xs.books.api.service.UserService;
import org.xs.books.web.common.web.BaseController;

/**
 * 书籍管理Controller
 */
@Controller
@RequestMapping(value = "/manage")
public class BookController extends BaseController {
	
	@Autowired
	UserService UserService;
	
	/**
	 * 书籍列表
	 */
	@RequestMapping(value = "/book")
	public String book(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		return "modules/manage/book/list";
	}
}
