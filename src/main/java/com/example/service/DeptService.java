package com.example.service;

import com.example.entity.peopleManager.Dept;

import java.util.List;

/**
 * @program: materils_v2.0
 * @description:
 * @author: aYuan
 * @create: 2019-08-18 10:55
 */
public interface DeptService {

    List<Dept> findAllDept();

    boolean addDept(Dept dept);

    boolean updateDept(Dept dept);

    boolean deleteDept(String deptNum);

}
