package org.xs.bookrack.web.modules.front;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.xs.bookrack.api.entity.UserBookInfo;
import org.xs.bookrack.api.service.UserBookService;
import org.xs.bookrack.api.service.UserService;
import org.xs.bookrack.web.common.web.BaseController;

/**
 * 首页Controller
 */
@Controller
@RequestMapping(value = "/")
public class HomeController extends BaseController {
	
	@Autowired
	UserService UserService;
	
	@Autowired
	UserBookService userBookService;
	
	/**
	 * 首页
	 */
	@RequestMapping(value = "/")
	public String home(HttpServletRequest request, HttpServletResponse response) throws Exception {
		setUserToPage(request);
		UserBookInfo userBookInfoReq = new UserBookInfo();
		request.setAttribute("userBookList", userBookService.findList(userBookInfoReq));
		return "modules/front/home/index";
	}
}
