package org.xs.bookrack.api.entity;

import org.xs.bookrack.api.common.persistence.DataEntity;

/**
 * 用户实体类
 */
public class UserInfo extends DataEntity<UserInfo>  {

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 邮箱
     */
    private String email;
    
    /**
     * 邮箱状态
     */
    private String emailState;

    /**
     * 手机
     */
    private String phone;

    /**
     * 密码
     */
    private String password;

    /**
     * 微信id
     */
    private String weixinId;

    /**
     * 微信昵称
     */
    private String weixinName;

    /**
     * 微博id
     */
    private String weiboId;

    /**
     * 微博昵称
     */
    private String weiboName;

    /**
     * githubid
     */
    private String githubId;

    /**
     * github昵称
     */
    private String githubName;

    /**
     * 豆瓣id
     */
    private String doubanId;

    /**
     * 豆瓣昵称
     */
    private String doubanName;

    /**
     * 头像
     */
    private String userImgUrl;

    /**
     * 姓名
     */
    private String userName;

    /**
     * 工号
     */
    private String jobNum;

    /**
     * 简介
     */
    private String profile;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 角色
     */
    private String role;

	/**  
	 * 获取nickName  
	 * @return nickName nickName  
	 */
	public String getNickName() {
		return nickName;
	}

	/**  
	 * 设置nickName  
	 * @param nickName nickName  
	 */
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	/**  
	 * 获取email  
	 * @return email email  
	 */
	public String getEmail() {
		return email;
	}

	/**  
	 * 设置email  
	 * @param email email  
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**  
	 * 获取email_state  
	 * @return email_state email_state  
	 */
	public String getEmailState() {
		return emailState;
	}

	/**  
	 * 设置email_state  
	 * @param email_state email_state  
	 */
	public void setEmail_state(String emailState) {
		this.emailState = emailState;
	}

	/**  
	 * 获取phone  
	 * @return phone phone  
	 */
	public String getPhone() {
		return phone;
	}

	/**  
	 * 设置phone  
	 * @param phone phone  
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**  
	 * 获取password  
	 * @return password password  
	 */
	public String getPassword() {
		return password;
	}

	/**  
	 * 设置password  
	 * @param password password  
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**  
	 * 获取weixinId  
	 * @return weixinId weixinId  
	 */
	public String getWeixinId() {
		return weixinId;
	}

	/**  
	 * 设置weixinId  
	 * @param weixinId weixinId  
	 */
	public void setWeixinId(String weixinId) {
		this.weixinId = weixinId;
	}

	/**  
	 * 获取weixinName  
	 * @return weixinName weixinName  
	 */
	public String getWeixinName() {
		return weixinName;
	}

	/**  
	 * 设置weixinName  
	 * @param weixinName weixinName  
	 */
	public void setWeixinName(String weixinName) {
		this.weixinName = weixinName;
	}

	/**  
	 * 获取weiboId  
	 * @return weiboId weiboId  
	 */
	public String getWeiboId() {
		return weiboId;
	}

	/**  
	 * 设置weiboId  
	 * @param weiboId weiboId  
	 */
	public void setWeiboId(String weiboId) {
		this.weiboId = weiboId;
	}

	/**  
	 * 获取weiboName  
	 * @return weiboName weiboName  
	 */
	public String getWeiboName() {
		return weiboName;
	}

	/**  
	 * 设置weiboName  
	 * @param weiboName weiboName  
	 */
	public void setWeiboName(String weiboName) {
		this.weiboName = weiboName;
	}

	/**  
	 * 获取githubId  
	 * @return githubId githubId  
	 */
	public String getGithubId() {
		return githubId;
	}

	/**  
	 * 设置githubId  
	 * @param githubId githubId  
	 */
	public void setGithubId(String githubId) {
		this.githubId = githubId;
	}

	/**  
	 * 获取githubName  
	 * @return githubName githubName  
	 */
	public String getGithubName() {
		return githubName;
	}

	/**  
	 * 设置githubName  
	 * @param githubName githubName  
	 */
	public void setGithubName(String githubName) {
		this.githubName = githubName;
	}

	/**  
	 * 获取doubanId  
	 * @return doubanId doubanId  
	 */
	public String getDoubanId() {
		return doubanId;
	}

	/**  
	 * 设置doubanId  
	 * @param doubanId doubanId  
	 */
	public void setDoubanId(String doubanId) {
		this.doubanId = doubanId;
	}

	/**  
	 * 获取doubanName  
	 * @return doubanName doubanName  
	 */
	public String getDoubanName() {
		return doubanName;
	}

	/**  
	 * 设置doubanName  
	 * @param doubanName doubanName  
	 */
	public void setDoubanName(String doubanName) {
		this.doubanName = doubanName;
	}

	/**  
	 * 获取userImgUrl  
	 * @return userImgUrl userImgUrl  
	 */
	public String getUserImgUrl() {
		return userImgUrl;
	}

	/**  
	 * 设置userImgUrl  
	 * @param userImgUrl userImgUrl  
	 */
	public void setUserImgUrl(String userImgUrl) {
		this.userImgUrl = userImgUrl;
	}

	/**  
	 * 获取userName  
	 * @return userName userName  
	 */
	public String getUserName() {
		return userName;
	}

	/**  
	 * 设置userName  
	 * @param userName userName  
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**  
	 * 获取jobNum  
	 * @return jobNum jobNum  
	 */
	public String getJobNum() {
		return jobNum;
	}

	/**  
	 * 设置jobNum  
	 * @param jobNum jobNum  
	 */
	public void setJobNum(String jobNum) {
		this.jobNum = jobNum;
	}

	/**  
	 * 获取profile  
	 * @return profile profile  
	 */
	public String getProfile() {
		return profile;
	}

	/**  
	 * 设置profile  
	 * @param profile profile  
	 */
	public void setProfile(String profile) {
		this.profile = profile;
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
	 * 获取role  
	 * @return role role  
	 */
	public String getRole() {
		return role;
	}

	/**  
	 * 设置role  
	 * @param role role  
	 */
	public void setRole(String role) {
		this.role = role;
	}
}
