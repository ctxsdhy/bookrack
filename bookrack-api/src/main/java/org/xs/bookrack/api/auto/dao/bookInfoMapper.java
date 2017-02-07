package org.xs.bookrack.api.auto.dao;

import org.xs.bookrack.api.auto.dto.bookInfo;

public interface bookInfoMapper {
    int deleteByPrimaryKey(String id);

    int insert(bookInfo record);

    int insertSelective(bookInfo record);

    bookInfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(bookInfo record);

    int updateByPrimaryKey(bookInfo record);
}