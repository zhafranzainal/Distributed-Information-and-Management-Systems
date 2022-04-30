package com.sau.swe212_project2.Model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "bonus", schema = "scott", catalog = "")
public class BonusEntity {
    @Basic
    @Column(name = "ENAME")
    private String ename;
    @Basic
    @Column(name = "JOB")
    private String job;
    @Basic
    @Column(name = "SAL")
    private Integer sal;
    @Basic
    @Column(name = "COMM")
    private Integer comm;

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

    public Integer getSal() {
        return sal;
    }

    public void setSal(Integer sal) {
        this.sal = sal;
    }

    public Integer getComm() {
        return comm;
    }

    public void setComm(Integer comm) {
        this.comm = comm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BonusEntity that = (BonusEntity) o;

        if (ename != null ? !ename.equals(that.ename) : that.ename != null) return false;
        if (job != null ? !job.equals(that.job) : that.job != null) return false;
        if (sal != null ? !sal.equals(that.sal) : that.sal != null) return false;
        if (comm != null ? !comm.equals(that.comm) : that.comm != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = ename != null ? ename.hashCode() : 0;
        result = 31 * result + (job != null ? job.hashCode() : 0);
        result = 31 * result + (sal != null ? sal.hashCode() : 0);
        result = 31 * result + (comm != null ? comm.hashCode() : 0);
        return result;
    }
}
