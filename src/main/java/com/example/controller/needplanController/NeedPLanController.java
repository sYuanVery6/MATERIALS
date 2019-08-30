package com.example.controller.needplanController;

import com.example.entity.needPlanManager.NeedPlan;
import com.example.entity.peopleManager.User;
import com.example.result.Result;
import com.example.result.ResultFactory;
import com.example.service.NeedPlanService;
import com.example.service.serviceImpl.NeedPlanServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: materils_v2.0
 * @description:
 * @author: aYuan
 * @create: 2019-08-22 09:55
 */
@RestController
public class NeedPLanController {

    @Autowired
    private NeedPlanServiceImpl needPlanService;

    @CrossOrigin
    @GetMapping("/needplans")
    @ResponseBody
    public List<NeedPlan> getNeedPlan(){
        return needPlanService.findAllNeedPlan();
    }

    @CrossOrigin
    @GetMapping("/passNeedplans")
    @ResponseBody
    public List<NeedPlan> getPassNeedplans(){
        NeedPlan needPlan = new NeedPlan();
        needPlan.setNeedPlanState("待审核");
        return needPlanService.findNeedplanBystate(needPlan);
    }


    @CrossOrigin
    @PostMapping("/needplans")
    @ResponseBody
    public Result addNeedPlan(@RequestBody NeedPlan needPlan){
        needPlan.setNeedPlanState("未提交");
        needPlan.setNum_price();
        needPlanService.addNeedplan(needPlan);
        return ResultFactory.bulidSuccessResult("添加成功");
    }

    @CrossOrigin
    @PutMapping("/needplanState")
    @ResponseBody
    public Result submitNeedplan(@RequestBody NeedPlan needPlan){

        System.out.println(needPlan.toString());
        if (needPlan.getNeedPlanState().equals("未提交")){
            needPlan.setNeedPlanState("待审核");
        }else if(needPlan.getNeedPlanState().equals("待审核")&&needPlan.getRejectRemark()==null){
            needPlan.setNeedPlanState("审批通过");
            needPlan.setNeedPlanNum("plan-"+needPlan.getId());
        }else if(needPlan.getNeedPlanState().equals("待审核")&&needPlan.getRejectRemark()!=null){
            needPlan.setNeedPlanState("驳回");
        }else if(needPlan.getNeedPlanState().equals("审批通过")){
            needPlan.setNeedPlanState("请购中");
        }else if(needPlan.getNeedPlanState().equals("请购中")){
            needPlan.setNeedPlanState("请购通过");
        }
        needPlanService.submitNeedplan(needPlan);

        return ResultFactory.bulidSuccessResult("提交成功");
    }

    @CrossOrigin
    @PutMapping("/needplans")
    @ResponseBody
    public Result updateNeedplan(@RequestBody NeedPlan needPlan){

        System.out.println(needPlan.toString());
        needPlan.setNum_price(needPlan.getPrice()*needPlan.getNum());
        needPlanService.updateNeedplan(needPlan);

        return ResultFactory.bulidSuccessResult("提交成功");
    }

    @CrossOrigin
    @GetMapping("/pruchase")
    @ResponseBody
    public List<User> getAllPruchase(){
        return needPlanService.getAllPruchase();
    }
    @CrossOrigin
    @GetMapping("/pruchaseNeedplan")
    @ResponseBody
    public List<NeedPlan> getPruchaseNeedplan(){
        NeedPlan needPlan = new NeedPlan();
        needPlan.setNeedPlanState("审批通过");
        return needPlanService.findNeedplanBystate(needPlan);
    }
}
