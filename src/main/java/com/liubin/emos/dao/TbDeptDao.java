package com.liubin.emos.dao;

import com.liubin.emos.domain.TbDept;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Mapper
public interface TbDeptDao {

    public ArrayList<HashMap> searchDeptMembers(String keyword);

    public List<TbDept> searchAllDept();

    public int insertDept(String deptName);

    public int deleteDeptById(int id);

    public int updateDeptById(TbDept entity);

}