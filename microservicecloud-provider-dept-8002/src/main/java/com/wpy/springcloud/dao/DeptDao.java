package com.wpy.springcloud.dao;

import com.wpy.springcloud.entities.Dept;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface DeptDao {

    @Insert("INSERT INTO dept(dname, db_source) values(#{dname}, DATABASE())")
    public boolean addDept(Dept dept);

    @Select("select deptno, dname, db_source from dept where deptno=#{deptno}")
    public Dept findById(Long id);

    @Select("select deptno, dname, db_source from dept")
    public List<Dept> findAll();

}
