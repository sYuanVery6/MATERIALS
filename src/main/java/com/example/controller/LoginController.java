package com.example.controller;

import com.example.entity.peopleManager.User;
import com.example.result.Result;
import com.example.result.ResultFactory;
import com.example.service.serviceImpl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.HtmlUtils;

import javax.servlet.http.HttpSession;

@RestController
public class LoginController {

    @Autowired
    private UserServiceImpl userService;

    @CrossOrigin//支持跨域
    @PostMapping("/login")
    @ResponseBody
    public Result login(@RequestBody User requestUser,HttpSession session){
        String jobNum = requestUser.getJobNum();
        jobNum = HtmlUtils.htmlEscape(jobNum);//将数据转义
        User user = userService.selectUserByJobNum(jobNum);
        if(null == user){
            String message = "工号&密码错误！";
            System.out.println(message);
            return ResultFactory.bulidFailResult(message);

        }else {
            session.setAttribute("user",user);
            return ResultFactory.bulidSuccessResult(user);
        }

    }

    @CrossOrigin
    @PostMapping("/logout")
    @ResponseBody
    public Result logout(HttpSession httpSession){
        httpSession.removeAttribute("user");
        return ResultFactory.bulidSuccessResult("请重新登录");
    }

}
