package com.example.mapper;

import com.example.entity.materialManager.Materials;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MaterialMapper {

    @Select("select * from tbl_materials")
    public List<Materials> findAllMaterials();

    @Select("select * from tbl_materials where materialstate = '待审核'")
    public List<Materials> findMaterials();

    @Select("select * from tbl_materials where materialstate = '审批通过'")
    public List<Materials> findPassMaterials();

    @Insert("insert into tbl_materials(materialName,price,materialState,materialTypeName,poster,remark) values(#{materialName},#{price},#{materialState},#{materialTypeName},#{poster},#{remark})")
    public void addMaterials(Materials materials);

    @Update("update tbl_materials set materialName = #{materialName},price = #{price},materialTypeName = #{materialTypeName},remark=#{remark} where id = #{id}")
    public void updateMaterials(Materials materials);

    @Update("update tbl_materials set materialState = #{materialState},rejectRemark = #{rejectRemark},materialNum =#{materialNum} where id = #{id}")
    public void updateState(Materials materials);

}
