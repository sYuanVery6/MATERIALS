package com.example.service.serviceImpl;

import com.example.entity.peopleManager.User;
import com.example.mapper.UserMapper;
import com.example.service.UserService;
import com.example.service.redisService.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private ListOperations<String,Object> listOperations;

    @Autowired
    private RedisService redisService;

    @Override
    public User selectUserByJobNum(String jobNum) {
        return userMapper.findUserByJobNum(jobNum);
    }

    @Override
    public List<User> findAllUser() {

        return userMapper.findAllUser();
//        String key = "userList";
//
//        boolean hashKey = redisTemplate.hasKey(key);
//        if(hashKey){
//            System.out.println("查询到缓存");
//            listOperations = redisTemplate.opsForList();
//            List list = listOperations.range(key,0,-1);
//            return list;
//        }
//
//        List list;
//
//        list = userMapper.findAllUser();
//        if(list != null){
//            System.out.println("插入缓存");
//            listOperations.rightPushAll(key,list,30,TimeUnit.SECONDS);
//
//        }
////        listOperations.leftPush("user",)
//        return list;
    }

    @Override
    public boolean addUser(User user){
        try {
            userMapper.addUser(user);
        }catch (Exception e){
            return false;
        }
        return true;
    }

    @Override
    public boolean updateUser(User user) {
        try {
            userMapper.updateUser(user);
        }catch (Exception e){
            return false;
        }
        return true;
    }

    @Override
    public boolean deleteUser(String jobNum) {
        try {
            userMapper.deleteUser(jobNum);
        }catch (Exception e){
            return false;
        }
        return true;
    }

    @Override
    public void updateJob(User user) {
        userMapper.updateJob(user);
    }

    @Override
    public User selectUserByDept(String deptNum) {
        return userMapper.selectUserByDept(deptNum);
    }

    @Override
    public User selectUserByName(String userName) {
        return userMapper.selectUserByName(userName);
    }
}
