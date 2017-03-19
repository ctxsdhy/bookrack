package org.xs.bookrack.api.entity;

import org.xs.bookrack.api.common.persistence.DataEntity;

/**
 * 用户书籍实体类
 */
public class UserBookInfo extends DataEntity<UserBookInfo>  {

    /**
     * 用户id
     */
    private String userId;
    
    /**
     * 书籍id
     */
    private String bookId;
    
    /**
     * 当前位置
     */
    private String location;
    
    /**
     * 阅读程度
     */
    private String level;
    
    /**
     * 评分
     */
    private String score;
    
    /**
     * 推荐语
     */
    private String comment;
    
    /**
     * 创建时间
     */
    private String createTime;
    
    /**
     * 书籍信息
     */
    private BookInfo bookInfo;

	/**  
	 * 获取userId  
	 * @return userId userId  
	 */
	public String getUserId() {
		return userId;
	}

	/**  
	 * 设置userId  
	 * @param userId userId  
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**  
	 * 获取bookId  
	 * @return bookId bookId  
	 */
	public String getBookId() {
		return bookId;
	}

	/**  
	 * 设置bookId  
	 * @param bookId bookId  
	 */
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	/**  
	 * 获取location  
	 * @return location location  
	 */
	public String getLocation() {
		return location;
	}

	/**  
	 * 设置location  
	 * @param location location  
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/**  
	 * 获取level  
	 * @return level level  
	 */
	public String getLevel() {
		return level;
	}

	/**  
	 * 设置level  
	 * @param level level  
	 */
	public void setLevel(String level) {
		this.level = level;
	}

	/**  
	 * 获取score  
	 * @return score score  
	 */
	public String getScore() {
		return score;
	}

	/**  
	 * 设置score  
	 * @param score score  
	 */
	public void setScore(String score) {
		this.score = score;
	}

	/**  
	 * 获取comment  
	 * @return comment comment  
	 */
	public String getComment() {
		return comment;
	}

	/**  
	 * 设置comment  
	 * @param comment comment  
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}

	/**  
	 * 获取createTime  
	 * @return createTime createTime  
	 */
	public String getCreateTime() {
		return createTime;
	}

	/**  
	 * 设置createTime  
	 * @param createTime createTime  
	 */
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	/**  
	 * 获取bookInfo  
	 * @return bookInfo bookInfo  
	 */
	public BookInfo getBookInfo() {
		return bookInfo;
	}

	/**  
	 * 设置bookInfo  
	 * @param bookInfo bookInfo  
	 */
	public void setBookInfo(BookInfo bookInfo) {
		this.bookInfo = bookInfo;
	}
}
