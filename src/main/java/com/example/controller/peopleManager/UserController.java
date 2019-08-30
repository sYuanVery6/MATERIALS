package com.example.controller.peopleManager;

import com.example.entity.peopleManager.User;
import com.example.result.Result;
import com.example.result.ResultFactory;
import com.example.service.serviceImpl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @program: materils_v2.0
 * @description:
 * @author: aYuan
 * @create: 2019-08-17 12:37
 */
@RestController
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @CrossOrigin
    @GetMapping("/user")
    @ResponseBody
    public List<User> getAllUser(HttpSession httpSession){

        //System.out.println(httpSession.getAttribute("user").toString());
        return userService.findAllUser();
    }

    @CrossOrigin
    @PostMapping("/user")
    @ResponseBody
    public Result addUser(@RequestBody User requestUser){
        boolean flag = userService.addUser(requestUser);
        if(flag){
            return ResultFactory.bulidSuccessResult(requestUser);
        }else {
            return ResultFactory.bulidFailResult("添加失败");
        }

    }

    @CrossOrigin
    @PutMapping("/user")
    @ResponseBody
    public Result updateUser(@RequestBody User requestUser){
        boolean flag = userService.updateUser(requestUser);
        if(flag){
            return ResultFactory.bulidSuccessResult(requestUser);
        }else {
            return ResultFactory.bulidFailResult("添加失败");
        }
    }

    //get和delete方式不支持@RequestBody！！！
    @CrossOrigin
    @DeleteMapping("/user")
    @ResponseBody
    public Result deleteUser(@RequestBody User user){
        System.out.println(user.getJobNum());
        boolean flag = userService.deleteUser(user.getJobNum());

        if(flag){
            return ResultFactory.bulidSuccessResult("success");
        }else {
            return ResultFactory.bulidFailResult("添加失败");
        }
    }

}
