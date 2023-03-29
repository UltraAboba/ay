package com.example.myapplication;
public class DataBase {
    private static String imail;
    private static String ipassword;
    public DataBase() {}
    public DataBase(String password,String mail){
        DataBase.imail = mail;
        DataBase.ipassword = password;
    }
    public static String getMail(){
        return imail;
    }
    public void setMail(String mail){
        DataBase.imail = mail;
    }
    public static String getPassword(){
        return ipassword;
    }
    public void setPassword(String password) {
        DataBase.ipassword = password;
    }
    public static String post = imail;
    public static String pass = ipassword;
}