package org.xs.bookrack.web.modules.front;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.xs.bookrack.api.service.UserService;
import org.xs.bookrack.web.common.web.BaseController;

/**
 * 认证Controller
 */
@Controller
@RequestMapping(value = "/")
public class PassportController extends BaseController {
	
	@Autowired
	UserService UserService;
	
	/**
	 * 登录
	 */
	@RequestMapping(value = "/login")
	public String login(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		return "modules/front/passport/login";
	}
}
