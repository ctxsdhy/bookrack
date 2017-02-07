package org.xs.bookrack.api.common.persistence;

import java.util.List;

/**
 * dao基类
 * @param <T>
 */
public interface CrudDao<T> {

	/**
	 * 获取单条数据
	 * @param id
	 * @return
	 *//*
	public T get(String id);
	
	*//**
	 * 获取单条数据
	 * @param entity
	 * @return
	 *//*
	public T get(T entity);*/
	
	/**
	 * 查询数据列表
	 * @param entity
	 * @return
	 */
	public List<T> findList(T entity);
	
	/**
	 * 插入数据
	 * @param entity
	 * @return
	 *//*
	public int insert(T entity);
	
	*//**
	 * 更新数据
	 * @param entity
	 * @return
	 *//*
	public int update(T entity);
	
	*//**
	 * 删除数据
	 * @param entity
	 * @return
	 *//*
	public int delete(String id);*/
	
}