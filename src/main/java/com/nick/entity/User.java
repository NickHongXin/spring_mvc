package com.nick.entity;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.*;

/**
 * Created by shx on 2017/07/05.
 */
//@Component
public class User implements Serializable{

    public User(){}

    public User(long id, String name, int age, String pwd, boolean isConfirmed){
        this.id = id;
        this.name = name;
        this.age = age;
        this.pwd = pwd;
        this.isConfirmed = isConfirmed;
    }

    private long id;

    private String name;

    private int age;

    private String pwd;

    private boolean isConfirmed;

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public boolean getIsConfirmed() {
        return isConfirmed;
    }

    public void setIsConfirmed(boolean isConfirmed) {
        this.isConfirmed = isConfirmed;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public String getPwd() {
        return pwd;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public int hashCode(){
        int result = super.hashCode();
        return (int)id%5;
    }

    public boolean equals(Object o){
        return this.id == ((User)o).getId();
    }

    @Override
    public String toString(){
        return "name: " + name + "; age: " + age;
    }

    public static void main(String[] args){
        User u1 = new User(3,"",1,"",false);
        User u2 = new User(3,"",2,"",false);
        System.out.println(u1);
        Set<User> set = new HashSet();
        set.add(u2);
        set.add(u1);
        set.forEach(u->System.out.println(u.getAge()));
        System.out.println(set.size());
        System.out.println(set);

        Map<User, User> map = new HashMap();
        map.put(u1, u1);
        map.put(u2, u2);
        map.put(null, new User());
        System.out.println("======================");
        System.out.println(map.size());
        System.out.println(map.get(null));
    }
}
