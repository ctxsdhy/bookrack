package org.xs.bookrack.api.entity;

import java.util.List;

import org.xs.bookrack.api.common.persistence.DataEntity;

/**
 * 书籍实体类
 */
public class BookInfo extends DataEntity<BookInfo>  {

    /**
     * 标准书号
     */
	private String isbn;
    
	/**
	 * 书名
	 */
	private String title;
	
    /**
     * 副标题
     */
	private String subtitle;
	
	/**
	 * 原作名
	 */
	private String originTitle;
	
	/**
     * 得分
     */
	private String average;
	
	/**
	 * 作者
	 */
	private List<String> authors;
	
	/**
	 * 作者
	 */
	private String author;

	/**
	 * 译者
	 */
	private List<String> translators;
	
	/**
	 * 译者
	 */
	private String translator;

	/**
	 * 出版日期
	 */
	private String pubdate;
	
	/**
	 * 出版社
	 */
	private String publisher;

	/**
	 * 封面
	 */
	private String image;

	/**
	 * 装帧
	 */
	private String binding;

	/**
	 * 页数
	 */
	private String pages;

	/**
	 * 价格
	 */
	private String price;

	/**
	 * 内容简介
	 */
	private String summary;

	/**
	 * 作者简介
	 */
	private String authorIntro;

	/**
	 * 目录
	 */
	private String catalog;

	/**  
	 * 获取isbn  
	 * @return isbn isbn  
	 */
	public String getIsbn() {
		return isbn;
	}

	/**  
	 * 设置isbn  
	 * @param isbn isbn  
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	/**  
	 * 获取title  
	 * @return title title  
	 */
	public String getTitle() {
		return title;
	}

	/**  
	 * 设置title  
	 * @param title title  
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**  
	 * 获取subtitle  
	 * @return subtitle subtitle  
	 */
	public String getSubtitle() {
		return subtitle;
	}

	/**  
	 * 设置subtitle  
	 * @param subtitle subtitle  
	 */
	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

	/**  
	 * 获取originTitle  
	 * @return originTitle originTitle  
	 */
	public String getOriginTitle() {
		return originTitle;
	}

	/**  
	 * 设置originTitle  
	 * @param originTitle originTitle  
	 */
	public void setOriginTitle(String originTitle) {
		this.originTitle = originTitle;
	}

	/**  
	 * 获取average  
	 * @return average average  
	 */
	public String getAverage() {
		return average;
	}

	/**  
	 * 设置average  
	 * @param average average  
	 */
	public void setAverage(String average) {
		this.average = average;
	}

	/**  
	 * 获取pubdate  
	 * @return pubdate pubdate  
	 */
	public String getPubdate() {
		return pubdate;
	}

	/**  
	 * 设置pubdate  
	 * @param pubdate pubdate  
	 */
	public void setPubdate(String pubdate) {
		this.pubdate = pubdate;
	}

	/**  
	 * 获取publisher  
	 * @return publisher publisher  
	 */
	public String getPublisher() {
		return publisher;
	}

	/**  
	 * 设置publisher  
	 * @param publisher publisher  
	 */
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	/**  
	 * 获取image  
	 * @return image image  
	 */
	public String getImage() {
		return image;
	}

	/**  
	 * 设置image  
	 * @param image image  
	 */
	public void setImage(String image) {
		this.image = image;
	}

	/**  
	 * 获取binding  
	 * @return binding binding  
	 */
	public String getBinding() {
		return binding;
	}

	/**  
	 * 设置binding  
	 * @param binding binding  
	 */
	public void setBinding(String binding) {
		this.binding = binding;
	}

	/**  
	 * 获取pages  
	 * @return pages pages  
	 */
	public String getPages() {
		return pages;
	}

	/**  
	 * 设置pages  
	 * @param pages pages  
	 */
	public void setPages(String pages) {
		this.pages = pages;
	}

	/**  
	 * 获取price  
	 * @return price price  
	 */
	public String getPrice() {
		return price;
	}

	/**  
	 * 设置price  
	 * @param price price  
	 */
	public void setPrice(String price) {
		this.price = price;
	}

	/**  
	 * 获取summary  
	 * @return summary summary  
	 */
	public String getSummary() {
		return summary;
	}

	/**  
	 * 设置summary  
	 * @param summary summary  
	 */
	public void setSummary(String summary) {
		this.summary = summary;
	}

	/**  
	 * 获取authorIntro  
	 * @return authorIntro authorIntro  
	 */
	public String getAuthorIntro() {
		return authorIntro;
	}

	/**  
	 * 设置authorIntro  
	 * @param authorIntro authorIntro  
	 */
	public void setAuthorIntro(String authorIntro) {
		this.authorIntro = authorIntro;
	}

	/**  
	 * 获取catalog  
	 * @return catalog catalog  
	 */
	public String getCatalog() {
		return catalog;
	}

	/**  
	 * 设置catalog  
	 * @param catalog catalog  
	 */
	public void setCatalog(String catalog) {
		this.catalog = catalog;
	}

	/**  
	 * 获取authors  
	 * @return authors authors  
	 */
	public List<String> getAuthors() {
		return authors;
	}

	/**  
	 * 设置authors  
	 * @param authors authors  
	 */
	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}

	/**  
	 * 获取author  
	 * @return author author  
	 */
	public String getAuthor() {
		return author;
	}

	/**  
	 * 设置author  
	 * @param author author  
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**  
	 * 获取translators  
	 * @return translators translators  
	 */
	public List<String> getTranslators() {
		return translators;
	}

	/**  
	 * 设置translators  
	 * @param translators translators  
	 */
	public void setTranslators(List<String> translators) {
		this.translators = translators;
	}

	/**  
	 * 获取translator  
	 * @return translator translator  
	 */
	public String getTranslator() {
		return translator;
	}

	/**  
	 * 设置translator  
	 * @param translator translator  
	 */
	public void setTranslator(String translator) {
		this.translator = translator;
	}
}
