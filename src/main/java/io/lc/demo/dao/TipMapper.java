package io.lc.demo.dao;

import io.lc.demo.po.Tip;

public interface TipMapper {
    int deleteByPrimaryKey(Integer tid);

    int insert(Tip record);

    int insertSelective(Tip record);

    Tip selectByPrimaryKey(Integer tid);

    int updateByPrimaryKeySelective(Tip record);

    int updateByPrimaryKey(Tip record);
}