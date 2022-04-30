package com.sau.swe212_project2.Model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "salgrade", schema = "scott", catalog = "")
public class SalgradeEntity {
    @Basic
    @Column(name = "GRADE")
    private Integer grade;
    @Basic
    @Column(name = "LOSAL")
    private Integer losal;
    @Basic
    @Column(name = "HISAL")
    private Integer hisal;

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Integer getLosal() {
        return losal;
    }

    public void setLosal(Integer losal) {
        this.losal = losal;
    }

    public Integer getHisal() {
        return hisal;
    }

    public void setHisal(Integer hisal) {
        this.hisal = hisal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SalgradeEntity that = (SalgradeEntity) o;

        if (grade != null ? !grade.equals(that.grade) : that.grade != null) return false;
        if (losal != null ? !losal.equals(that.losal) : that.losal != null) return false;
        if (hisal != null ? !hisal.equals(that.hisal) : that.hisal != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = grade != null ? grade.hashCode() : 0;
        result = 31 * result + (losal != null ? losal.hashCode() : 0);
        result = 31 * result + (hisal != null ? hisal.hashCode() : 0);
        return result;
    }
}
