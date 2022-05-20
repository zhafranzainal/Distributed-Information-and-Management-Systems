package com.sau.swe212_project3.Model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "user")

public class UserEntity{

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;

    @Basic
    @Column(name = "user_name", nullable = false, length = 16)
    private String userName;

    @Basic
    @Column(name = "password", nullable = false, length = 16)
    private String password;

    @Basic
    @Column(name = "roles", nullable = false, length = 32)
    private String roles;

    @Basic
    @Column(name = "active", nullable = true)
    private Byte active;

    public int getId(){
        return id;}

    public void setId(int id){
        this.id = id;}

    public String getUserName(){
        return userName;}

    public void setUserName(String userName){
        this.userName = userName;}

    public String getPassword(){
        return password;}

    public void setPassword(String password){
        this.password = password;}

    public String getRoles(){
        return roles;}

    public void setRoles(String roles){
        this.roles = roles;}

    public Byte getActive(){
        return active;}

    public void setActive(Byte active){
        this.active = active;}

    @Override
    public boolean equals(Object obj){

        if(this == obj){
            return true;}

        if(obj == null || getClass() != obj.getClass()){
            return false;}

        UserEntity user = (UserEntity) obj;

        return id == user.id && Objects.equals(userName, user.userName) && Objects.equals(password, user.password) && Objects.equals(roles, user.roles) && Objects.equals(active, user.active);
    }

    @Override
    public int hashCode(){
        return Objects.hash(id, userName, password, active, roles);}

}
