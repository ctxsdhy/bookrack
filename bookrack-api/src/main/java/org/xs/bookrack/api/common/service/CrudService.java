package org.xs.bookrack.api.common.service;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.xs.bookrack.api.common.persistence.CrudDao;
import org.xs.bookrack.api.common.persistence.DataEntity;

/**
 * service基类
 * @param <D>
 * @param <T>
 */
public abstract class CrudService<D extends CrudDao<T>, T extends DataEntity<T>> {
	
	/**
	 * 持久层对象
	 */
	@Autowired
	protected D dao;
	
	/**
	 * 获取单条数据
	 * @param entity
	 * @return
	 */
	public T get(T entity) {
		return dao.get(entity);
	}
	
	/**
	 * 查询列表数据
	 * @param entity
	 * @return
	 */
	public List<T> findList(T entity) {
		return dao.findList(entity);
	}
	
	/**
	 * 查询分页数据
	 * @param page 分页对象
	 * @param entity
	 * @return
	 *//*
	public Page<T> findPage(Page<T> page, T entity) {
		entity.setPage(page);
		page.setList(dao.findList(entity));
		return page;
	}*/

	/**
	 * 保存数据（新增或更新）
	 * @param entity
	 */
	public void save(T entity) {
		if(StringUtils.isEmpty(entity.getId())){
			entity.generateId();
			dao.add(entity);
		}else{
			dao.update(entity);
		}
	}
	
	/**
	 * 删除数据
	 * @param entity
	 */
	public void delete(T entity) {
		dao.delete(entity.getId());
	}
}
