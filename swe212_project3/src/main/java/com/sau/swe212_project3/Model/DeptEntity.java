package com.sau.swe212_project3.Model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "dept")

public class DeptEntity{

    @Basic
    @Id
    @Column(name = "DEPTNO", nullable = true)
    private Integer deptno;

    @Basic
    @Column(name = "DNAME", nullable = true, length = 14)
    private String dname;

    @Basic
    @Column(name = "LOC", nullable = true, length = 13)
    private String loc;

    public Integer getDeptno(){
        return deptno;}

    public void setDeptno(Integer deptno){
        this.deptno = deptno;}

    public String getDname(){
        return dname;}

    public void setDname(String dname){
        this.dname = dname;}

    public String getLoc(){
        return loc;}

    public void setLoc(String loc){
        this.loc = loc;}

    @Override
    public boolean equals(Object obj){

        if(this == obj){
            return true;}

        if(obj == null || getClass() != obj.getClass()){
            return false;}

        DeptEntity dept = (DeptEntity) obj;

        return Objects.equals(deptno, dept.deptno) && Objects.equals(dname, dept.dname) && Objects.equals(loc, dept.loc);

    }

    @Override
    public int hashCode(){
        return Objects.hash(deptno, dname, loc);}

}
