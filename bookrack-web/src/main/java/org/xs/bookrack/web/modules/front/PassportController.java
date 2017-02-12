package org.xs.bookrack.web.modules.front;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.xs.bookrack.api.entity.UserInfo;
import org.xs.bookrack.api.service.UserService;
import org.xs.bookrack.web.common.web.BaseController;

/**
 * 认证Controller
 */
@Controller
@RequestMapping(value = "/")
public class PassportController extends BaseController {
	
	@Autowired
	UserService userService;
	
	/**
	 * 注册页
	 */
	@RequestMapping(value = "/register")
	public String register() {
		return "modules/front/passport/register";
	}
	
	/**
	 * 注册提交
	 */
	@RequestMapping(value = "/doRegister")
	public String doRegister(UserInfo userInfo, HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		userService.save(userInfo);
		
		return "modules/manage/user/info";
	}
	
	/**
	 * 登录页
	 */
	@RequestMapping(value = "/login")
	public String login(){
		return "modules/front/passport/login";
	}
}
