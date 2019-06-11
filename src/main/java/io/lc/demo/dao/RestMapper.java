package io.lc.demo.dao;

import com.github.pagehelper.Page;
import io.lc.demo.po.Rest;

public interface RestMapper {
    int deleteByPrimaryKey(Integer rid);

    int insert(Rest record);

    int insertSelective(Rest record);

    Rest selectByPrimaryKey(Integer rid);

    int updateByPrimaryKeySelective(Rest record);

    int updateByPrimaryKey(Rest record);

    Page<Rest> searchAll();
}