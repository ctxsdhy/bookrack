package org.xs.bookrack.api.auto.dao;

import org.xs.bookrack.api.auto.dto.userInfo;

public interface userInfoMapper {
    int deleteByPrimaryKey(String id);

    int insert(userInfo record);

    int insertSelective(userInfo record);

    userInfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(userInfo record);

    int updateByPrimaryKey(userInfo record);
}