package com.example.entity.peopleManager;

/**
 * @program: materils_v2.0
 * @description: 职位表tbl_job
 * @author: aYuan
 * @create: 2019-08-20 08:15
 */
public class Job {

    private Integer id;

    private String jobNum;

    private String jobName;

    private String jobLev;

    private String deptNum;

    private String deptName;

    public Job() {
    }

    public Job(Integer id, String jobNum, String jobName, String jobLev, String deptNum, String deptName) {
        this.id = id;
        this.jobNum = jobNum;
        this.jobName = jobName;
        this.jobLev = jobLev;
        this.deptNum = deptNum;
        this.deptName = deptName;
    }

    @Override
    public String toString() {
        return "Job{" +
                "id=" + id +
                ", jobNum='" + jobNum + '\'' +
                ", jobName='" + jobName + '\'' +
                ", jobLev='" + jobLev + '\'' +
                ", deptNum='" + deptNum + '\'' +
                ", deptName='" + deptName + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJobNum() {
        return jobNum;
    }

    public void setJobNum(String jobNum) {
        this.jobNum = jobNum;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getJobLev() {
        return jobLev;
    }

    public void setJobLev(String jobLev) {
        this.jobLev = jobLev;
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
}
