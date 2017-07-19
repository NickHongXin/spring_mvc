package com.nick.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shx on 2017/07/11.
 */
public class UserTbl {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    private String name;

    private int age;

    private String pwd;

    private List<String> items;

    public UserTbl(List<String> items) {
        this.items = items;
    }

    public synchronized void outPut (){
        if (index > items.size() -1) {System.out.println(Thread.currentThread().getName()+": "+"output is done!"); } else { System.out.println(Thread.currentThread().getName()+": "+items.get(index++));}
    }

    public UserTbl(){}

    private int index;

    public List<String> getItems() {
        return items;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
