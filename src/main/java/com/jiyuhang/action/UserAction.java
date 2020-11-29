package com.jiyuhang.action;

import com.opensymphony.xwork2.Action;

//public class UserAction implements Action{
public class UserAction{
    public String hello(){
        System.out.println("hello");
        return Action.SUCCESS;
    }


}
