package com.sau.swe212_project2.Model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "dept", schema = "scott", catalog = "")
public class DeptEntity {
    @Basic
    @Column(name = "DEPTNO")
    private Integer deptno;
    @Basic
    @Column(name = "DNAME")
    private String dname;
    @Basic
    @Column(name = "LOC")
    private String loc;

    public Integer getDeptno() {
        return deptno;
    }

    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DeptEntity that = (DeptEntity) o;

        if (deptno != null ? !deptno.equals(that.deptno) : that.deptno != null) return false;
        if (dname != null ? !dname.equals(that.dname) : that.dname != null) return false;
        if (loc != null ? !loc.equals(that.loc) : that.loc != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = deptno != null ? deptno.hashCode() : 0;
        result = 31 * result + (dname != null ? dname.hashCode() : 0);
        result = 31 * result + (loc != null ? loc.hashCode() : 0);
        return result;
    }
}
