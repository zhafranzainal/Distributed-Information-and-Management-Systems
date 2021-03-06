package com.sau.swe212_project3.Model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "bonus")

public class BonusEntity{

    @Basic
    @Column(name = "ENAME", nullable = true, length = 10)
    private String ename;

    @Basic
    @Column(name = "JOB", nullable = true, length = 9)
    private String job;

    @Basic
    @Id
    @Column(name = "SAL", nullable = true)
    private Integer sal;

    @Basic
    @Column(name = "COMM", nullable = true)
    private Integer comm;

    public String getEname(){
        return ename;}

    public void setEname(String ename){
        this.ename = ename;}

    public String getJob(){
        return job;}

    public void setJob(String job){
        this.job = job;}

    public Integer getSal(){
        return sal;}

    public void setSal(Integer sal){
        this.sal = sal;}

    public Integer getComm(){
        return comm;}

    public void setComm(Integer comm){
        this.comm = comm;}

    @Override
    public boolean equals(Object obj){

        if(this == obj){
            return true;}

        if(obj == null || getClass() != obj.getClass()){
            return false;}

        BonusEntity bonus = (BonusEntity) obj;

        return Objects.equals(ename, bonus.ename) && Objects.equals(job, bonus.job) && Objects.equals(sal, bonus.sal) && Objects.equals(comm, bonus.comm);

    }

    @Override
    public int hashCode(){
        return Objects.hash(ename, job, sal, comm);}

}
