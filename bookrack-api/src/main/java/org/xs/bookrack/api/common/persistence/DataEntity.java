package org.xs.bookrack.api.common.persistence;

import java.io.Serializable;

import org.xs.bookrack.api.common.utils.UuidUtils;

import com.alibaba.druid.util.StringUtils;

/**
 * entity基类
 * @param <T>
 */
public class DataEntity<T> implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * id
	 */
	private String id;

	/**  
	 * 获取id  
	 * @return id id  
	 */
	public String getId() {
		return id;
	}

	/**  
	 * 设置id  
	 * @param id id  
	 */
	public void setId(String id) {
		this.id = id;
	}
	
	/**
	 * 生成id
	 */
	public void generateId() {
		
		if(StringUtils.isEmpty(id)) {
			
			//生产base58编码的22位小写短id
			id = UuidUtils.base58Uuid().toLowerCase();
		}
	}
}
