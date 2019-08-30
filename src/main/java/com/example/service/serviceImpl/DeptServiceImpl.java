package com.example.service.serviceImpl;

import com.example.entity.peopleManager.Dept;
import com.example.entity.peopleManager.User;
import com.example.mapper.DeptMapper;
import com.example.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: materils_v2.0
 * @description:
 * @author: aYuan
 * @create: 2019-08-18 11:05
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;

    @Override
    public boolean addDept(Dept dept) {
        try {
            deptMapper.addDept(dept);
        }catch (Exception e){
            return false;
        }
        return true;
    }

    @Override
    public boolean updateDept(Dept dept) {
        try {
            deptMapper.updateDept(dept);
        }catch (Exception e){
            return false;
        }
        return true;
    }

    @Override
    public List<Dept> findAllDept() {
        return deptMapper.findAllDept();
    }

    @Override
    public boolean deleteDept(String deptNum) {
        try {

        }catch (Exception e){
            return false;
        }
        return true;
    }
}
