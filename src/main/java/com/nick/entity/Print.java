package com.nick.entity;

/**
 * Created by shx on 2017/07/12.
 */
public class Print implements Runnable{
    private UserTbl userTbl;

    public Print(UserTbl userTbl) {
        this.userTbl = userTbl;
    }

    @Override
    public void run() {
        this.userTbl.outPut();
    }
}