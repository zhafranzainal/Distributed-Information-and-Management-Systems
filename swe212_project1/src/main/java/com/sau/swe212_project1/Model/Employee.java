package com.sau.swe212_project1.Model;

public class Employee{

    private String numID;
    private String name;
    private String job;
    private String managerID;
    private String hireDate;
    private int salary;
    private Integer commission;
    private int deptNo;

    public Employee(){}

    public Employee(String numID, String name, String job, String managerID, String hireDate, int salary, Integer commission, int deptNo) {
        this.numID=numID;
        this.name=name;
        this.job=job;
        this.managerID=managerID;
        this.hireDate=hireDate;
        this.salary=salary;
        this.commission=commission;
        this.deptNo=deptNo;}

    public String getNumID(){
        return numID;}

    public void setNumID(String numID){
        this.numID=numID;}

    public String getName(){
        return name;}

    public void setName(String name){
        this.name=name;}

    public String getJob(){
        return job;}

    public void setJob(String job){
        this.job=job;}

    public String getManagerID(){
        return managerID;}

    public void setManagerID(String managerID){
        this.managerID=managerID;}

    public String getHireDate(){
        return hireDate;}

    public void setHireDate(String hireDate){
        this.hireDate=hireDate;}

    public int getSalary(){
        return salary;}

    public void setSalary(int salary){
        this.salary=salary;}

    public Integer getCommission(){
        return commission;}

    public void setCommission(Integer commission){
        this.commission=commission;}

    public int getDeptNo(){
        return deptNo;}

    public void setDeptNo(int deptNo){
        this.deptNo=deptNo;}

}