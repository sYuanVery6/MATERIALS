package com.example.service.serviceImpl;

import com.example.entity.needPlanManager.NeedPlan;
import com.example.entity.peopleManager.User;
import com.example.mapper.NeedPlanMapper;
import com.example.mapper.UserMapper;
import com.example.service.NeedPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: materils_v2.0
 * @description:
 * @author: aYuan
 * @create: 2019-08-22 09:53
 */
@Service
public class NeedPlanServiceImpl implements NeedPlanService {

    @Autowired
    private NeedPlanMapper needPlanMapper;

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<NeedPlan> findAllNeedPlan() {
        return needPlanMapper.findAllNeedPlan();
    }

    @Override
    public void addNeedplan(NeedPlan needPlan) {
        needPlanMapper.addNeedplan(needPlan);
    }

    @Override
    public void updateNeedplan(NeedPlan needPlan) {
        needPlanMapper.updateNeedPlan(needPlan);
    }

    @Override
    public void submitNeedplan(NeedPlan needPlan) {
        needPlanMapper.submitNeedplan(needPlan);
    }

    @Override
    public List<NeedPlan> findNeedplanBystate(NeedPlan needPlan) {
        return needPlanMapper.findNeedplanBystate(needPlan);
    }

    @Override
    public List<User> getAllPruchase() {
        return userMapper.getAllPruchase();
    }
}
