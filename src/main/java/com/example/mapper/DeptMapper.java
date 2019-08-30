package com.example.mapper;

import com.example.entity.peopleManager.Dept;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @program: materils_v2.0
 * @description:
 * @author: aYuan
 * @create: 2019-08-18 10:56
 */
@Mapper
@Repository
public interface DeptMapper {

    @Select("SELECT * FROM tbl_dept")
    List<Dept> findAllDept();

    @Delete("DELETE FROM tbl_dept WHERE deptNum = #{deptNum}")
    boolean deleteDept(@Param("deptNum") String deptNum);

    @Update("UPDATE tbl_dept SET jobNum = #{jobNum},deptAdmin = #{deptAdmin} WHERE deptNum = #{deptNum}")
    boolean updateDept(Dept dept);

    @Insert("INSEST INTO tbl_dept(id,deptNum,deptName,jobNum,deptAdmin) VALUES (#{id},#{deptNum},#{deptName},#{jobNum},#{deptAdmin})")
    boolean addDept(Dept dept);


}
