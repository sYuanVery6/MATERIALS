package com.example.service.serviceImpl;

import com.example.entity.materialManager.Materials;
import com.example.mapper.MaterialMapper;
import com.example.service.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: materils_v2.0
 * @description:
 * @author: aYuan
 * @create: 2019-08-21 18:14
 */
@Service
public class MaterialServiceImpl implements MaterialService {

    @Autowired
    private MaterialMapper materialMapper;

    @Override
    public List<Materials> findAllMaterials() {
        return materialMapper.findAllMaterials();
    }

    @Override
    public List<Materials> findMaterials(){
        return materialMapper.findMaterials();
    }

    @Override
    public void addMaterial(Materials materials) {
        materialMapper.addMaterials(materials);
    }

    @Override
    public void updateMaterial(Materials materials) {
        materialMapper.updateMaterials(materials);
    }

    @Override
    public void updateState(Materials materials) {
        materialMapper.updateState(materials);
    }

    @Override
    public List<Materials> findPassMaterials() {
        return materialMapper.findPassMaterials();
    }
}
