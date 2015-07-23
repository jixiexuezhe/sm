package ibatis.model;

public class User implements java.io.Serializable {  
    private Integer empNO;  
    private String ename;  
    private String job;  
    private String mgr;  
    private String sal;  
      
  
    public Integer getEmpNO() {  
        return empNO;  
    }  
  
  
    public void setEmpNO(Integer empNO) {  
        this.empNO = empNO;  
    }  
  
  
    public String getEname() {  
        return ename;  
    }  
  
  
    public void setEname(String ename) {  
        this.ename = ename;  
    }  
  
  
    public String getJob() {  
        return job;  
    }  
  
  
    public void setJob(String job) {  
        this.job = job;  
    }  
  
  
    public String getMgr() {  
        return mgr;  
    }  
  
  
    public void setMgr(String mgr) {  
        this.mgr = mgr;  
    }  
  
  
    public String getSal() {  
        return sal;  
    }  
  
  
    public void setSal(String sal) {  
        this.sal = sal;  
    }  
  
  
    @Override  
    public String toString() {  
        return "EMP [empNO=" + empNO + ", ename=" + ename + ", job="  
                + job + ", mgr=" + mgr + ", sal=" + sal  
                + "]";  
    }  
}  