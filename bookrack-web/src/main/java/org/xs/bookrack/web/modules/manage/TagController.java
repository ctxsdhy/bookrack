package org.xs.bookrack.web.modules.manage;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.xs.bookrack.api.service.UserService;
import org.xs.bookrack.web.common.web.BaseController;

/**
 * 标签管理Controller
 */
@Controller
@RequestMapping(value = "/manage")
public class TagController extends BaseController {
	
	@Autowired
	UserService UserService;
	
	/**
	 * 标签列表
	 */
	@RequestMapping(value = "/tag")
	public String book(HttpServletRequest request, HttpServletResponse response) throws Exception {
		setUserToPage(request);
		return "modules/manage/tag/list";
	}
}
