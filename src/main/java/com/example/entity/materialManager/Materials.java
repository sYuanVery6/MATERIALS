package com.example.entity.materialManager;

/**
 * @program: materils_v2.0
 * @description: tbl_material表
 * @author: aYuan
 * @create: 2019-08-20 09:12
 */
public class Materials {

    private Integer id;
    private String materialNum;
    private String materialName;
    private String materialPostTime;
    private String materialPassTime;
    private Integer price;
    private String materialState;
    private String materialTypeNum;
    private String materialTypeName;
    private String poster;
    private String rejectRemark;
    private String remark;

    @Override
    public String toString() {
        return "Materials{" +
                "id=" + id +
                ", materialNum='" + materialNum + '\'' +
                ", materialName='" + materialName + '\'' +
                ", materialPostTime='" + materialPostTime + '\'' +
                ", materialPassTime='" + materialPassTime + '\'' +
                ", price=" + price +
                ", materialState='" + materialState + '\'' +
                ", materialTypeNum='" + materialTypeNum + '\'' +
                ", materialTypeName='" + materialTypeName + '\'' +
                ", poster='" + poster + '\'' +
                ", rejectRemark='" + rejectRemark + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMaterialNum() {
        return materialNum;
    }

    public void setMaterialNum(String materialNum) {
        this.materialNum = materialNum;
    }

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    public String getMaterialPostTime() {
        return materialPostTime;
    }

    public void setMaterialPostTime(String materialPostTime) {
        this.materialPostTime = materialPostTime;
    }

    public String getMaterialPassTime() {
        return materialPassTime;
    }

    public void setMaterialPassTime(String materialPassTime) {
        this.materialPassTime = materialPassTime;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getMaterialState() {
        return materialState;
    }

    public void setMaterialState(String materialState) {
        this.materialState = materialState;
    }

    public String getMaterialTypeNum() {
        return materialTypeNum;
    }

    public void setMaterialTypeNum(String materialTypeNum) {
        this.materialTypeNum = materialTypeNum;
    }

    public String getMaterialTypeName() {
        return materialTypeName;
    }

    public void setMaterialTypeName(String materialTypeName) {
        this.materialTypeName = materialTypeName;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getRejectRemark() {
        return rejectRemark;
    }

    public void setRejectRemark(String rejectRemark) {
        this.rejectRemark = rejectRemark;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Materials(Integer id, String materialNum, String materialName, String materialPostTime, String materialPassTime, Integer price, String materialState, String materialTypeNum, String materialTypeName, String poster, String rejectRemark, String remark) {
        this.id = id;
        this.materialNum = materialNum;
        this.materialName = materialName;
        this.materialPostTime = materialPostTime;
        this.materialPassTime = materialPassTime;
        this.price = price;
        this.materialState = materialState;
        this.materialTypeNum = materialTypeNum;
        this.materialTypeName = materialTypeName;
        this.poster = poster;
        this.rejectRemark = rejectRemark;
        this.remark = remark;
    }

    public Materials() {
    }
}
