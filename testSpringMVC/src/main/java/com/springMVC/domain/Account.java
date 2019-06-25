package com.springMVC.domain;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class Account implements Serializable {

    private String name;
    private int id;
    private float money;

    private user user;

    List<user> list;
    Map<String, user>map;


    public List<com.springMVC.domain.user> getList() {
        return list;
    }

    public void setList(List<com.springMVC.domain.user> list) {
        this.list = list;
    }

    public Map<String, com.springMVC.domain.user> getMap() {
        return map;
    }

    public void setMap(Map<String, com.springMVC.domain.user> map) {
        this.map = map;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }

    public com.springMVC.domain.user getUser() {
        return user;
    }

    public void setUser(com.springMVC.domain.user user) {
        this.user = user;
    }


    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", money=" + money +
                ", user=" + user +
                ", list=" + list +
                ", map=" + map +
                '}';
    }
}
