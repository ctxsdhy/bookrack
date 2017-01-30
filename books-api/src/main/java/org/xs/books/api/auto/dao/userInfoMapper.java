package org.xs.books.api.auto.dao;

import org.xs.books.api.auto.dto.userInfo;

public interface userInfoMapper {
    int deleteByPrimaryKey(String id);

    int insert(userInfo record);

    int insertSelective(userInfo record);

    userInfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(userInfo record);

    int updateByPrimaryKey(userInfo record);
}