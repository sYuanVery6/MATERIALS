package com.example.service;

import com.example.entity.materialManager.Materials;
import com.example.entity.needPlanManager.NeedPlan;

import java.util.List;

/**
 * @program: materils_v2.0
 * @description:
 * @author: aYuan
 * @create: 2019-08-21 18:13
 */
public interface MaterialService {

    public List<Materials> findAllMaterials();
    public List<Materials> findMaterials();
    public List<Materials> findPassMaterials();

    public void addMaterial(Materials materials);

    public void updateMaterial(Materials materials);

    public void updateState(Materials materials);


}
