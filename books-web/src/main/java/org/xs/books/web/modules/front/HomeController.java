package org.xs.books.web.modules.front;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.xs.books.api.entity.UserInfo;
import org.xs.books.api.service.UserService;
import org.xs.books.web.common.web.BaseController;

/**
 * 首页Controller
 */
@Controller
@RequestMapping(value = "/")
public class HomeController extends BaseController {
	
	@Autowired
	UserService UserService;
	
	/**
	 * 首页
	 */
	@RequestMapping(value = "/")
	public String home(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		return "modules/front/home/index";
	}
	
	/**
	 * test
	 */
	@RequestMapping(value = "/abc")
	public String test(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		UserInfo userInfo = new UserInfo();
		List<UserInfo> list = UserService.findList(userInfo);
		request.setAttribute("name", "321");
		
		return "modules/front/home/abc";
	}
}
