package com.sau.swe212_project3.Model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "salgrade")

public class SalgradeEntity{

    @Basic
    @Id
    @Column(name = "GRADE", nullable = true)
    private Integer grade;

    @Basic
    @Column(name = "LOSAL", nullable = true)
    private Integer losal;

    @Basic
    @Column(name = "HISAL", nullable = true)
    private Integer hisal;

    public Integer getGrade(){
        return grade;}

    public void setGrade(Integer grade){
        this.grade = grade;}

    public Integer getLosal(){
        return losal;}

    public void setLosal(Integer losal){
        this.losal = losal;}

    public Integer getHisal(){
        return hisal;}

    public void setHisal(Integer hisal){
        this.hisal = hisal;}

    @Override
    public boolean equals(Object obj){

        if(this == obj){
            return true;}

        if(obj == null || getClass() != obj.getClass()){
            return false;}

        SalgradeEntity salgrade = (SalgradeEntity) obj;

        return Objects.equals(grade, salgrade.grade) && Objects.equals(losal, salgrade.losal) && Objects.equals(hisal, salgrade.hisal);

    }

    @Override
    public int hashCode(){
        return Objects.hash(grade, losal, hisal);}

}
