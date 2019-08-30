package com.example.service;


import com.example.entity.needPlanManager.NeedPlan;
import com.example.entity.peopleManager.User;

import java.util.List;

public interface NeedPlanService {

    List<NeedPlan> findAllNeedPlan();

    void addNeedplan(NeedPlan needPlan);

    public void submitNeedplan(NeedPlan needPlan);

    public void updateNeedplan(NeedPlan needPlan);

    public List<NeedPlan> findNeedplanBystate(NeedPlan needPlan);

    public List<User> getAllPruchase();

}
