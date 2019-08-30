package com.example.controller.peopleManager;

import com.example.entity.peopleManager.Dept;
import com.example.entity.peopleManager.User;
import com.example.result.Result;
import com.example.result.ResultFactory;
import com.example.service.serviceImpl.DeptServiceImpl;
import com.example.service.serviceImpl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * @program: materils_v2.0
 * @description: 部门管理页面
 * @author: aYuan
 * @create: 2019-08-18 11:09
 */
@RestController
public class DeptController {


    @Autowired
    private DeptServiceImpl deptService;

    @Autowired
    private UserServiceImpl userService;

    @CrossOrigin
    @GetMapping("/dept")
    @ResponseBody
    public Result findAllDept(){
        List<Dept> deptList = deptService.findAllDept();
        return ResultFactory.bulidSuccessResult(deptList);
    }

    @CrossOrigin
    @DeleteMapping("/dept")
    @ResponseBody
    public Result deleteDept(@PathVariable String deptNum){
        return ResultFactory.bulidSuccessResult("");
    }

    @CrossOrigin
    @PutMapping("/dept")
    @ResponseBody
    public Result updateDept(@RequestBody Dept dept){//修改部门负责人时，用户表的职位字段也需要变化
        System.out.println(dept.toString());

        User oldUser = userService.selectUserByDept(dept.getDeptNum());
        System.out.println(oldUser.toString()+"before");
        oldUser.setJob("3");
        userService.updateJob(oldUser);
        System.out.println(oldUser.toString()+"after");
//        User oldUser = userService.selectUserByDept(dept.getDeptNum());
//        System.out.println(oldUser.toString());
//        oldUser.setJob("3");
//        oldUser.setDeptNum(dept.getDeptNum());
//        userService.updateJob(oldUser);
        User newUser = userService.selectUserByName(dept.getDeptAdmin());
        newUser.setJob("2");
        dept.setJobNum(newUser.getJobNum());
        System.out.println(newUser.toString()+"defore");
        userService.updateJob(newUser);
        System.out.println(newUser.toString()+"after");
//        System.out.println("oldUser"+oldUser.toString());
//        System.out.println("newUser"+newUser.toString());
        deptService.updateDept(dept);
        return ResultFactory.bulidSuccessResult("");
    }

    public Result addDept(){//新增部门时，不选择部门负责人
        return ResultFactory.bulidSuccessResult("");
    }

}
