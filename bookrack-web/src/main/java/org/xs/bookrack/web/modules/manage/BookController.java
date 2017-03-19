package org.xs.bookrack.web.modules.manage;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.xs.bookrack.api.entity.BookInfo;
import org.xs.bookrack.api.entity.UserBookInfo;
import org.xs.bookrack.api.entity.UserInfo;
import org.xs.bookrack.api.service.BookService;
import org.xs.bookrack.api.service.UserBookService;
import org.xs.bookrack.api.service.UserService;
import org.xs.bookrack.web.common.web.BaseController;

/**
 * 书籍管理Controller
 */
@Controller
@RequestMapping(value = "/manage")
public class BookController extends BaseController {
	
	@Autowired
	UserService userService;
	
	@Autowired
	BookService bookService;
	
	@Autowired
	UserBookService userBookService;
	
	/**
	 * 书籍列表
	 */
	@RequestMapping(value = "/book")
	public String book(HttpServletRequest request, HttpServletResponse response) throws Exception {
		setUserToPage(request);
		UserInfo userInfo = getUserInfo(request);
		if(userInfo != null) {
			UserBookInfo userBookInfoReq = new UserBookInfo();
			userBookInfoReq.setUserId(userInfo.getId());
			request.setAttribute("userBookList", userBookService.findList(userBookInfoReq));
		}
		
		return "modules/manage/book/list";
	}
	
	/**
	 * 编辑书籍页
	 */
	@RequestMapping(value = "/book/edit")
	public String add(HttpServletRequest request, HttpServletResponse response) throws Exception {
		setUserToPage(request);
		return "modules/manage/book/edit";
	}
	
	/**
	 * 编辑书籍页
	 */
	@RequestMapping(value = "/book/edit/{id}")
	public String add(@PathVariable("id") String id, HttpServletRequest request, HttpServletResponse response) throws Exception {
		setUserToPage(request);
		UserBookInfo userBookInfoReq = new UserBookInfo();
		userBookInfoReq.setId(id);
		userBookInfoReq.setUserId(getUserInfo(request).getId());
		UserBookInfo userBookInfo = userBookService.get(userBookInfoReq);
		if(userBookInfo == null) {
			return "redirect:/manage/book";
		}
		request.setAttribute("userBookInfo", userBookInfo);
		return "modules/manage/book/edit";
	}
	
	/**
	 * 保存书籍页
	 */
	@RequestMapping(value = "/book/save")
	public String save(BookInfo bookInfo, UserBookInfo userBookInfo, HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		UserInfo userInfo = getUserInfo(request);
		if(userInfo != null) {
			
			//保存图书信息
			bookInfo.setId("");
			BookInfo oldBookInfo = bookService.get(bookInfo);
			if(oldBookInfo != null) {
				userBookInfo.setBookId(oldBookInfo.getId());
			} else {
				bookService.save(bookInfo);
				userBookInfo.setBookId(bookInfo.getId());
			}
			
			//保存用户图书信息
			userBookInfo.setUserId(userInfo.getId());
			userBookService.save(userBookInfo);
		}
		
		return "redirect:/manage/book";
	}
	
	/**
	 *删除书籍
	 */
	@ResponseBody
	@RequestMapping(value = "/book/delete/{id}", produces = {"text/plain;charset=utf-8"}, method = RequestMethod.POST)
	public String delete(@PathVariable("id") String id, HttpServletRequest request, HttpServletResponse response) throws Exception {
		setUserToPage(request);
		UserBookInfo userBookInfoReq = new UserBookInfo();
		userBookInfoReq.setId(id);
		userBookInfoReq.setUserId(getUserInfo(request).getId());
		UserBookInfo userBookInfo = userBookService.get(userBookInfoReq);
		if(userBookInfo == null) {
			return "redirect:/manage/book";
		}
		userBookService.delete(userBookInfo);
		return "true";
	}
}
