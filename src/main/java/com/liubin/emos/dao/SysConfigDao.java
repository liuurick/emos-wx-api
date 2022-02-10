package com.liubin.emos.dao;

import com.liubin.emos.domain.SysConfig;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SysConfigDao {
    List<SysConfig> selectAllParam();
}