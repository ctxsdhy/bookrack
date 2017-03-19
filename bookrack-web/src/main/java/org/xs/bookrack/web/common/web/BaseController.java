package org.xs.bookrack.web.common.web;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.xs.bookrack.api.entity.UserInfo;

/**
 * 控制器基础类
 */
public abstract class BaseController {
	
	/**
	 * 设置用户信息到页面
	 * @param request
	 */
	protected void setUserToPage(HttpServletRequest request) {
		Subject subject = SecurityUtils.getSubject();
		UserInfo userInfo = (UserInfo) subject.getPrincipal();
		request.setAttribute("user", userInfo);
	}
	
	/**
	 * 获得用户信息
	 * @param request
	 * @return
	 */
	protected UserInfo getUserInfo(HttpServletRequest request) {
		Subject subject = SecurityUtils.getSubject();
		return (UserInfo) subject.getPrincipal();
	}
}
