package com.example.mapper;

import com.example.entity.needPlanManager.NeedPlan;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NeedPlanMapper {

    @Select("select * from tbl_needplan")
    List<NeedPlan> findAllNeedPlan();

    @Select("select * from tbl_needplan where needPlanState = #{needPlanState}")
    List<NeedPlan> findNeedplanBystate(NeedPlan needPlan);

    @Insert("insert into tbl_needplan(materialNum,materialName,num,price,num_price,needPlanState,poster,remark)values(#{materialNum},#{materialName},#{num},#{price},#{num_price},#{needPlanState},#{poster},#{remark})")
    void addNeedplan(NeedPlan needPlan);

    @Update("update tbl_needplan set needPlanNum = #{needPlanNum} , rejectRemark= #{rejectRemark},buyer=#{buyer},needplanState = #{needPlanState} , poster =#{poster} where id = #{id} ")
    void submitNeedplan(NeedPlan needPlan);

    @Update("update tbl_needplan set materialName = #{materialName},materialNum = #{materialNum},num=#{num},price=#{price},num_price=#{num_price} where id =#{id}")
    void updateNeedPlan(NeedPlan needPlan);



}
