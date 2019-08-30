package com.example.entity.needPlanManager;

/**
 * @program: materils_v2.0
 * @description: tbl_needplan 表
 * @author: aYuan
 * @create: 2019-08-22 09:46
 */
public class NeedPlan {
    private Integer id;
    private String needPlanNum;
    private String materialNum;
    private String materialName;
    private Integer num;
    private String materialPassTime;
    private Integer price;
    private Integer num_price;
    private String needPlanState;
    private String orderNum;
    private String dhOrderNum;
    private String poster;
    private String buyer;
    private String rejectRemark;
    private String remark;

    @Override
    public String toString() {
        return "NeedPlan{" +
                "id=" + id +
                ", needPlanNum='" + needPlanNum + '\'' +
                ", materialNum='" + materialNum + '\'' +
                ", materialName='" + materialName + '\'' +
                ", num=" + num +
                ", materialPassTime='" + materialPassTime + '\'' +
                ", price=" + price +
                ", num_price=" + num_price +
                ", needPlanState='" + needPlanState + '\'' +
                ", orderNum='" + orderNum + '\'' +
                ", dhOrderNum='" + dhOrderNum + '\'' +
                ", poster='" + poster + '\'' +
                ", buyer='" + buyer + '\'' +
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

    public String getNeedPlanNum() {
        return needPlanNum;
    }

    public void setNeedPlanNum(String needPlanNum) {
        this.needPlanNum = needPlanNum;
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

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
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

    public Integer getNum_price() {
        return num_price;
    }

    public void setNum_price() {
        this.num_price = this.num * this.price;
    }

    public void setNum_price(Integer num_price){
        this.num_price = num_price;
    }

    public String getNeedPlanState() {
        return needPlanState;
    }

    public void setNeedPlanState(String needPlanState) {
        this.needPlanState = needPlanState;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public String getDhOrderNum() {
        return dhOrderNum;
    }

    public void setDhOrderNum(String dhOrderNum) {
        this.dhOrderNum = dhOrderNum;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getBuyer() {
        return buyer;
    }

    public void setBuyer(String buyer) {
        this.buyer = buyer;
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

    public NeedPlan(Integer id, String needPlanNum, String materialNum, String materialName, Integer num, String materialPassTime, Integer price, Integer num_price, String needPlanState, String orderNum, String dhOrderNum, String poster, String buyer, String rejectRemark, String remark) {
        this.id = id;
        this.needPlanNum = needPlanNum;
        this.materialNum = materialNum;
        this.materialName = materialName;
        this.num = num;
        this.materialPassTime = materialPassTime;
        this.price = price;
        this.num_price = num_price;
        this.needPlanState = needPlanState;
        this.orderNum = orderNum;
        this.dhOrderNum = dhOrderNum;
        this.poster = poster;
        this.buyer = buyer;
        this.rejectRemark = rejectRemark;
        this.remark = remark;
    }

    public NeedPlan() {
    }
}
