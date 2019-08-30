package com.example.controller.materialsManager;

import com.example.entity.materialManager.Materials;
import com.example.result.Result;
import com.example.result.ResultFactory;
import com.example.service.serviceImpl.MaterialServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: materils_v2.0
 * @description:
 * @author: aYuan
 * @create: 2019-08-21 18:17
 */
@RestController
public class MaterialsController {

    @Autowired
    private MaterialServiceImpl materialService;

    @CrossOrigin
    @GetMapping("/materials")
    @ResponseBody
    public List<Materials> getAllMaterials(){
        return materialService.findAllMaterials();
    }

    @CrossOrigin
    @PostMapping("/materials")
    @ResponseBody
    public Result addMaterials(@RequestBody Materials materials){
        materials.setMaterialState("未提交");
        materialService.addMaterial(materials);
        return ResultFactory.bulidSuccessResult("添加成功");
    }

    @CrossOrigin
    @PutMapping("/materials")
    @ResponseBody
    public Result updateMaterials(@RequestBody Materials materials){
        materialService.updateMaterial(materials);
        return ResultFactory.bulidSuccessResult("修改成功");
    }

    @CrossOrigin
    @GetMapping("/waitMaterials")
    @ResponseBody
    public List<Materials> getwaitMaterials(){
        return materialService.findMaterials();
    }

    @CrossOrigin
    @PutMapping("/materialState")
    @ResponseBody
    public Result updateState(@RequestBody Materials materials){
        String materialNum = "pn-"+materials.getId();
        if(materials.getMaterialState().equals("未提交")||materials.getMaterialState().equals("驳回")){
            materials.setMaterialState("待审核");
            materialService.updateState(materials);
        }else if(materials.getMaterialState().equals("待审核")&&materials.getRejectRemark()==null){
            materials.setMaterialState("审批通过");
            materials.setMaterialNum(materialNum);
        }else {
            materials.setMaterialState("驳回");
        }
        materialService.updateState(materials);
        System.out.println(materials.toString());
        return ResultFactory.bulidSuccessResult("success");
    }

    @CrossOrigin
    @GetMapping("/passMaterials")
    @ResponseBody
    public List<Materials> getPassMaterials(){

        return materialService.findPassMaterials();
    }

}
