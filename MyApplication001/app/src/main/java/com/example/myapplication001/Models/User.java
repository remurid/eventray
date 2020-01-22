package com.example.myapplication001.Models;

import androidx.annotation.NonNull;

public class User {

    String uid;
    String name,phone_no;

    public User(){}

    public String getUid(){return uid;}
    public void setUid(String uid){this.uid=uid;}
    public String getName(){return name;}
    public void setName(String name){this.name=name;}
    public String getPhone_no(){return phone_no;}
    public void setPhone_no(String phone_no){this.phone_no=phone_no;}

    @NonNull
    @Override
    public String toString() {
        return "User{"+
                "uid=' "+ uid + '\''+
                ", name='"+ name + '\''+
                ", phone number='"+ phone_no + '\''+
                '}';
    }
}
