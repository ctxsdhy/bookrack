package org.xs.bookrack.api.auto.dao;

import org.xs.bookrack.api.auto.dto.userbookInfo;

public interface userbookInfoMapper {
    int deleteByPrimaryKey(String id);

    int insert(userbookInfo record);

    int insertSelective(userbookInfo record);

    userbookInfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(userbookInfo record);

    int updateByPrimaryKey(userbookInfo record);
}