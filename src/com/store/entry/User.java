package com.store.entry;

import java.io.Serializable;

public class User implements Serializable {
    private Integer uId;
    private String uName;
    private String uPwd;
    private Integer uAge;

    public User() {
    }

    public User(Integer uId, String uName, String uPwd, Integer uAge) {
        this.uId = uId;
        this.uName = uName;
        this.uPwd = uPwd;
        this.uAge = uAge;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getuPwd() {
        return uPwd;
    }

    public void setuPwd(String uPwd) {
        this.uPwd = uPwd;
    }

    public Integer getuAge() {
        return uAge;
    }

    public void setuAge(Integer uAge) {
        this.uAge = uAge;
    }

    @Override
    public String toString() {
        return "User{" +
                "uId=" + uId +
                ", uName='" + uName + '\'' +
                ", uPwd='" + uPwd + '\'' +
                ", uAge=" + uAge +
                '}';
    }
}
