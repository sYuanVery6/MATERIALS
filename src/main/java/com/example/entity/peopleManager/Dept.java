package com.example.entity.peopleManager;

public class Dept {

    private Integer id;

    private String deptNum;

    private String deptName;

    private String jobNum;

    private String deptAdmin;

    public Dept() {
    }

    public Dept(Integer id, String deptNum, String deptName, String jobNum, String deptAdmin) {
        this.id = id;
        this.deptNum = deptNum;
        this.deptName = deptName;
        this.jobNum = jobNum;
        this.deptAdmin = deptAdmin;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "id=" + id +
                ", deptNum='" + deptNum + '\'' +
                ", deptName='" + deptName + '\'' +
                ", jobNum='" + jobNum + '\'' +
                ", deptAdmin='" + deptAdmin + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDeptNum() {
        return deptNum;
    }

    public void setDeptNum(String deptNum) {
        this.deptNum = deptNum;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getJobNum() {
        return jobNum;
    }

    public void setJobNum(String jobNum) {
        this.jobNum = jobNum;
    }

    public String getDeptAdmin() {
        return deptAdmin;
    }

    public void setDeptAdmin(String deptAdmin) {
        this.deptAdmin = deptAdmin;
    }
}
