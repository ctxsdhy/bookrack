package org.xs.bookrack.web.modules.front;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.xs.bookrack.api.entity.UserInfo;
import org.xs.bookrack.api.service.UserService;
import org.xs.bookrack.web.common.web.BaseController;

import com.alibaba.fastjson.JSON;

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
	public String register(HttpServletRequest request) {
		setUserToPage(request);
		return "modules/front/passport/register";
	}
	
	/**
	 * 注册提交
	 */
	@RequestMapping(value = "/doRegister")
	public String doRegister(UserInfo userInfo) throws Exception {
		
		userService.save(userInfo);
		UsernamePasswordToken token = new UsernamePasswordToken(userInfo.getId(), userInfo.getNickName());
		Subject subject = SecurityUtils.getSubject();  
        subject.login(token);
		
		return "redirect:/";
	}
	
	/**
	 * 登录页
	 */
	@RequestMapping(value = "/login")
	public String login(UserInfo userInfo, HttpServletRequest request) {
		setUserToPage(request);
		return "modules/front/passport/login";
	}
	
	/**
	 *验证用户
	 */
	@ResponseBody
	@RequestMapping(value = "/verifyUser", produces = {"text/plain;charset=utf-8"}, method = RequestMethod.POST)
	public String verifyUser(UserInfo userInfoReq) {
		
		Boolean hasUser = false;
		//判断用户是否存在
		UserInfo userInfo = userService.get(userInfoReq);
		if(userInfo != null) {
			hasUser = true;
		}
		
		return JSON.toJSONString(hasUser);
	}
	
	/**
	 * 登录提交
	 */
	@RequestMapping(value = "/doLogin")
	public String doLogin(UserInfo userInfoReq, HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		//登出
		SecurityUtils.getSecurityManager().logout(SecurityUtils.getSubject());
		
		try {
			
			//shiro验证登录
			UsernamePasswordToken token = new UsernamePasswordToken(userInfoReq.getEmail(), userInfoReq.getPassword());
			Subject subject = SecurityUtils.getSubject();  
	        subject.login(token);
		} catch(UnknownAccountException e) {
			return "redirect:/login";
		}
		return "redirect:/";
	}
}
