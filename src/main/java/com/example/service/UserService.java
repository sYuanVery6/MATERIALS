package com.example.service;

import com.example.entity.peopleManager.User;

import java.util.List;

public interface UserService {

    public User selectUserByJobNum(String jobNum);

    public List<User> findAllUser();

    public boolean addUser(User user);

    public boolean updateUser(User user);

    public boolean deleteUser(String jobNum);

    public void updateJob(User user);

    public User selectUserByDept(String deptNum);

    public User selectUserByName(String userName);

}
